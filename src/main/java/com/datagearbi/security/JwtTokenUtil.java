package com.datagearbi.security;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.datagearbi.security.service.JwtUserDetailsService;

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClock;

@Component
public class JwtTokenUtil implements Serializable {
	@Autowired
	JwtUserDetailsService jwtUserDetailsService;
    static final String CLAIM_KEY_USERNAME = "sub";
    static final String CLAIM_KEY_CREATED = "iat";
    private static final long serialVersionUID = -3301605591108950415L;
//    @SuppressFBWarnings(value = "SE_BAD_FIELD", justification = "It's okay here")
    private Clock clock = DefaultClock.INSTANCE;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String getUsernameFromToken(String token) {
    	System.out.println("---getUsernameFromToken---");
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getIssuedAtDateFromToken(String token) {
    	System.out.println("---getIssuedAtDateFromToken---");
        return getClaimFromToken(token, Claims::getIssuedAt);
    }

    public Date getExpirationDateFromToken(String token) {
    	System.out.println("---getExpirationDateFromToken---");
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
    	System.out.println("---getClaimFromToken---");
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
    	System.out.println("---getClaimFromToken---");
        return Jwts.parser()
            .setSigningKey(secret)
            .parseClaimsJws(token)
            .getBody();
    }

    private Boolean isTokenExpired(String token) {
    	System.out.println("---isTokenExpired---");
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(clock.now());
    }

    private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
    	System.out.println("---isCreatedBeforeLastPasswordReset---");
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    private Boolean ignoreTokenExpiration(String token) {
        // here you specify tokens, for that the expiration is ignored
    	System.out.println("---ignoreTokenExpiration---");
        return false;
    }

    public String generateToken(JwtUser userDetails) {
    	System.out.println("---generateToken---");
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails);
    }

    private String doGenerateToken(Map<String, Object> claims,JwtUser userDetails) {
    	System.out.println("---doGenerateToken---");
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);
		Map<String, Object> payload = new HashMap<>();
		payload.put("userName", userDetails.getFirstname() + " " + userDetails.getLastname());
		payload.put("id", userDetails.getId());
		payload.put("authorities", jwtUserDetailsService.getUserCapabilities(userDetails.getId()));

        return Jwts.builder()
            .setClaims(claims)
            .setSubject(userDetails.getUsername())
            .setIssuedAt(createdDate)
            .setExpiration(expirationDate).addClaims(payload)
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }

    public Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
    	System.out.println("---canTokenBeRefreshed---");
        final Date created = getIssuedAtDateFromToken(token);
        return !isCreatedBeforeLastPasswordReset(created, lastPasswordReset)
            && (!isTokenExpired(token) || ignoreTokenExpiration(token));
    }

    public String refreshToken(String token) {
    	System.out.println("---refreshToken---");
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);

        final Claims claims = getAllClaimsFromToken(token);
        claims.setIssuedAt(createdDate);
        claims.setExpiration(expirationDate);

        return Jwts.builder()
            .setClaims(claims)
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
    	System.out.println("---validateToken---");
        JwtUser user = (JwtUser) userDetails;
        final String username = getUsernameFromToken(token);
        final Date created = getIssuedAtDateFromToken(token);
        //final Date expiration = getExpirationDateFromToken(token);
        return (
            username.equals(user.getUsername())
                && !isTokenExpired(token)
                && !isCreatedBeforeLastPasswordReset(created, user.getLastPasswordResetDate())
        );
    }

    private Date calculateExpirationDate(Date createdDate) {
    	System.out.println("---calculateExpirationDate---");
        return new Date(createdDate.getTime() + expiration * 1000);
    }
}

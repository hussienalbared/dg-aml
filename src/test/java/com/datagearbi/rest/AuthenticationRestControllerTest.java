package com.datagearbi.rest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.datagearbi.security.JwtAuthenticationRequest;
import com.datagearbi.security.JwtTokenUtil;
import com.datagearbi.security.JwtUser;
import com.datagearbi.security.JwtUserFactory;
import com.datagearbi.security.service.JwtUserDetailsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.datagearbi.model.security.AuthorityName;
import com.datagearbi.model.security.Group;
import com.datagearbi.model.security.User;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticationRestControllerTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private AuthenticationManager authenticationManager;

    @MockBean
    private JwtTokenUtil jwtTokenUtil;

    @MockBean
    private JwtUserDetailsService jwtUserDetailsService;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
            .webAppContextSetup(context)
            .apply(springSecurity())
            .build();
    }

    @Test
    @WithAnonymousUser
    public void successfulAuthenticationWithAnonymousUser() throws Exception {

        JwtAuthenticationRequest jwtAuthenticationRequest = new JwtAuthenticationRequest("user", "password");

        mvc.perform(post("/auth")
            .contentType(MediaType.APPLICATION_JSON)
            .content(new ObjectMapper().writeValueAsString(jwtAuthenticationRequest)))
            .andExpect(status().is2xxSuccessful());
    }

    @Test
    @WithMockUser(roles = "USER")
    public void successfulRefreshTokenWithUserRole() throws Exception {

        Group group = new Group();
        group.setId(0);
        group.setName(AuthorityName.ROLE_USER);
        List<Group> groups = Arrays.asList(group);

        User user = new User();
        user.setUsername("username");
        user.setGroup(groups);
        user.setEnabled(Boolean.TRUE);
        user.setLastPasswordResetDate(new Date(System.currentTimeMillis() + 1000 * 1000));

        JwtUser jwtUser = JwtUserFactory.create(user);

        when(jwtTokenUtil.getUsernameFromToken(any())).thenReturn(user.getUsername());

        when(jwtUserDetailsService.loadUserByUsername(eq(user.getUsername()))).thenReturn(jwtUser);

        when(jwtTokenUtil.canTokenBeRefreshed(any(), any())).thenReturn(true);

        mvc.perform(get("/refresh")
            .header("Authorization", "Bearer 5d1103e-b3e1-4ae9-b606-46c9c1bc915a"))
            .andExpect(status().is2xxSuccessful());
    }

    @Test
    @WithMockUser(roles = "ADMIN")
    public void successfulRefreshTokenWithAdminRole() throws Exception {

    	Group group = new Group();
    	group.setId(1);
    	group.setName(AuthorityName.ROLE_ADMIN);
        List<Group> groups = Arrays.asList(group);

        User user = new User();
        user.setUsername("admin");
        user.setGroup(groups);
        user.setEnabled(Boolean.TRUE);
        user.setLastPasswordResetDate(new Date(System.currentTimeMillis() + 1000 * 1000));

        JwtUser jwtUser = JwtUserFactory.create(user);

        when(jwtTokenUtil.getUsernameFromToken(any())).thenReturn(user.getUsername());

        when(jwtUserDetailsService.loadUserByUsername(eq(user.getUsername()))).thenReturn(jwtUser);

        when(jwtTokenUtil.canTokenBeRefreshed(any(), any())).thenReturn(true);

        mvc.perform(get("/refresh")
            .header("Authorization", "Bearer 5d1103e-b3e1-4ae9-b606-46c9c1bc915a"))
            .andExpect(status().is2xxSuccessful());
    }

    @Test
    @WithAnonymousUser
    public void shouldGetUnauthorizedWithAnonymousUser() throws Exception {

        mvc.perform(get("/refresh"))
            .andExpect(status().isUnauthorized());
    }
}


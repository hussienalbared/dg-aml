package com.datagearbi.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CoreAccountD;
import com.datagearbi.repository.AccountObjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/account")
public class AccountController {

	@Autowired
	private AccountObjectRepository accountObjectRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@RequestMapping(value = "allaccounts", method = RequestMethod.GET)
	public List<CoreAccountD> allAccounts() {
		return accountObjectRepository.findAll();
	}

	/* Search function- */
	@RequestMapping(value = "searchAccount", method = RequestMethod.GET)
	@ResponseBody
	public List<CoreAccountD> search(@RequestParam(name = "AccountNumber") String AccountNumber,
			@RequestParam(name = "AccountName") String AccountName,
			@RequestParam(name = "AccountType") String AccountType,
			@RequestParam(name = "AccountOpenDate") String AccountOpenDate,
			@RequestParam(name = "AccountCloseDate") String AccountCloseDate)

	{
		if ((AccountNumber == null || AccountNumber.isEmpty()) && (AccountName == null || AccountName.isEmpty())
				&& (AccountType == null || AccountType.isEmpty())
				&& (AccountOpenDate == null || AccountOpenDate.isEmpty())
				&& (AccountCloseDate == null || AccountCloseDate.isEmpty())) {
			return null;
		}

		List<CoreAccountD> articleList = accountObjectRepository.findAll();

		String query = "select ACCTNO,ACCTNM,ACCTTYDESC,ACCTOPDATE,ACCTCLDATE from CORE_ACCOUNT_D a where 1=1 ";
		if (!AccountNumber.isEmpty()&&AccountNumber!=null) {
			query += " and ACCTNO='" + AccountNumber + "'";
			articleList = articleList.stream().filter(p->p.getAcctno()!=null)
					.filter(article ->

			article.getAcctno().trim().equals(AccountNumber.trim())).collect(Collectors.toList());

		}
		if (!AccountType.isEmpty()&&AccountType!=null) {
			query += " and ACCTTYDESC='" + AccountType + "'";
			articleList = articleList.stream().filter(a->a.getAccttydesc()!=null)
					.filter(a -> a.getAccttydesc().trim().equals(AccountType.trim()))
					.collect(Collectors.toList());
		}
		if (!AccountName.isEmpty()&&AccountName!=null) {
			query += " and ACCTNM='" + AccountName + "'";
			articleList = articleList.stream().filter(a->a.getAcctnm()!=null).
					filter(a -> a.getAcctnm().trim().equals(AccountName.trim()))
					.collect(Collectors.toList());
		}

		if (!AccountOpenDate.isEmpty()&&AccountOpenDate!=null) {
			query += " and ACCTOPDATE='" + AccountOpenDate + "'";
		

			articleList = articleList.stream().filter(a->a.getAcctopdate()!=null).
					filter(e -> e.getAcctopdate() != null).filter(
					article -> (article.getAcctopdate().toString().split(" ")[0]).trim().equals(AccountOpenDate.trim()))
					.collect(Collectors.toList());
		}
		if (!AccountCloseDate.isEmpty()&&AccountCloseDate!=null) {
			query += " and ACCTCLDATE='" + AccountCloseDate + "'";
			articleList = articleList.stream().filter(a->a.getAcctcldate()!=null).
					filter(e -> e.getAcctcldate() != null)
					.filter(article -> (article.getAcctcldate().toString().split(" ")[0]).trim()
							.equals(AccountCloseDate.trim()))
					.collect(Collectors.toList());
		}
		return articleList;

	}
	@RequestMapping("accountDetail")
	public List<CoreAccountD> getAccountDetail(@RequestParam("accountNumber") String accountNumber  ){
		
		return this.accountObjectRepository.findByacctno(accountNumber);
		
	}
}

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

import com.datagearbi.model.Account;
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
	public List<Account> allAccounts() {
		return accountObjectRepository.findAll();
	}

	/* Search function- */
	@RequestMapping(value = "searchAccount", method = RequestMethod.GET)
	@ResponseBody
	public List<Account> search(@RequestParam(name = "AccountNumber") String AccountNumber,
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

		List<Account> articleList = accountObjectRepository.findAll();

		String query = "select ACCTNO,ACCTNM,ACCTTYDESC,ACCTOPDATE,ACCTCLDATE from CORE_ACCOUNT_D a where 1=1 ";
		if (!AccountNumber.isEmpty()) {
			query += " and ACCTNO='" + AccountNumber + "'";
			articleList = articleList.stream().filter(article ->

			article.getAcctNo().trim().equals(AccountNumber.trim())).collect(Collectors.toList());

		}
		if (!AccountType.isEmpty()) {
			query += " and ACCTTYDESC='" + AccountType + "'";
			articleList = articleList.stream()
					.filter(article -> article.getACCTTYDESC().trim().equals(AccountType.trim()))
					.collect(Collectors.toList());
		}
		if (!AccountName.isEmpty()) {
			query += " and ACCTNM='" + AccountName + "'";
			articleList = articleList.stream().filter(article -> article.getACCTNM().trim().equals(AccountName.trim()))
					.collect(Collectors.toList());
		}

		if (!AccountOpenDate.isEmpty()) {
			query += " and ACCTOPDATE='" + AccountOpenDate + "'";
			System.out.println("opendate " + AccountOpenDate.length());

			articleList = articleList.stream().filter(e -> e.getACCTOPDATE() != null).filter(
					article -> (article.getACCTOPDATE().toString().split(" ")[0]).trim().equals(AccountOpenDate.trim()))
					.collect(Collectors.toList());
		}
		if (!AccountCloseDate.isEmpty()) {
			query += " and ACCTCLDATE='" + AccountCloseDate + "'";
			articleList = articleList.stream().filter(e -> e.getACCTCLDATE() != null)
					.filter(article -> (article.getACCTCLDATE().toString().split(" ")[0]).trim()
							.equals(AccountCloseDate.trim()))
					.collect(Collectors.toList());
		}
		return articleList;

	}
}

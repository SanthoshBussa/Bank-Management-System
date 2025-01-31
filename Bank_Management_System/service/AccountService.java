package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.AccountDao;
import com.jsp.Bank_Management_System.dto.Account;

@Service
public class AccountService {

	@Autowired
	AccountDao accountDao;

	public Account saveAccount(Account account) {
		return accountDao.saveAccount(account);
	}

	public Account fetchAccountById(int id) {
		return accountDao.fetchAccountById(id);
	}

	public List<Account> fetchAllAccounts() {
		return accountDao.fetchAllAccounts();
	}

	public Account updateAccount(Account account) {
		return accountDao.updateAccount(account);
	}

	public void deleteAccountById(int id) {
		accountDao.deleteAccountById(id);
	}

	public void deleteAllAccounts() {
		accountDao.deleteAllAccounts();
	}
}
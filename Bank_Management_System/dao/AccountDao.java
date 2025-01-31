package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Account;
import com.jsp.Bank_Management_System.repo.AccountRepo;

@Repository
public class AccountDao {

	@Autowired
	AccountRepo accountRepo;

	@PostMapping
	public Account saveAccount(Account account) {
		return accountRepo.save(account);
	}

	@GetMapping
	public Account fetchAccountById(int id) {
		return accountRepo.findById(id).get();
	}

	@GetMapping
	public List<Account> fetchAllAccounts() {
		return accountRepo.findAll();
	}

	@PutMapping
	public Account updateAccount(Account account) {
		return accountRepo.save(account);
	}

	@DeleteMapping
	public void deleteAccountById(int id) {
		accountRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllAccounts() {
		accountRepo.deleteAll();
	}
}
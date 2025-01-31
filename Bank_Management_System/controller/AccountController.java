package com.jsp.Bank_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Bank_Management_System.dto.Account;
import com.jsp.Bank_Management_System.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@PostMapping("/saveAccount")
	public Account saveAccount(@RequestBody Account account) {
		return accountService.saveAccount(account);
	}

	@GetMapping("/fetchAccountById")
	public Account fetchAccountById(@RequestParam int id) {
		return accountService.fetchAccountById(id);
	}

	@GetMapping("/fetchAllAccounts")
	public List<Account> fetchAllAccounts() {
		return accountService.fetchAllAccounts();
	}

	@PutMapping("/updateAccount")
	public Account updateAccount(@RequestParam int id, @RequestBody Account account) {
		account.setAccountId(id);
		return accountService.updateAccount(account);
	}

	@DeleteMapping("/deleteAccountById")
	public String deleteAccountById(@RequestParam int id) {
		accountService.deleteAccountById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllAccounts")
	public String deleteAllAccounts() {
		accountService.deleteAllAccounts();
		return "Successfully Deleted All Accounts";
	}
}
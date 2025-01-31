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

import com.jsp.Bank_Management_System.dto.Loan;
import com.jsp.Bank_Management_System.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	LoanService loanService;

	@PostMapping("/saveLoan")
	public Loan saveLoan(@RequestBody Loan loan) {
		return loanService.saveLoan(loan);
	}

	@GetMapping("/fetchLoanById")
	public Loan fetchLoanById(@RequestParam int id) {
		return loanService.fetchLoanById(id);
	}

	@GetMapping("/fetchAllLoans")
	public List<Loan> fetchAllLoans() {
		return loanService.fetchAllLoans();
	}

	@PutMapping("/updateLoan")
	public Loan updateLoan(@RequestParam int id, @RequestBody Loan loan) {
		loan.setLoanId(id);
		return loanService.updateLoan(loan);
	}

	@DeleteMapping("/deleteLoanById")
	public String deleteLoanById(@RequestParam int id) {
		loanService.deleteLoanById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllLoans")
	public String deleteAllLoans() {
		loanService.deleteAllLoans();
		return "Successfully Deleted All Loans";
	}
}
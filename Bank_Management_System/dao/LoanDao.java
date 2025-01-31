package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Loan;
import com.jsp.Bank_Management_System.repo.LoanRepo;

@Repository
public class LoanDao {

	@Autowired
	LoanRepo loanRepo;

	@PostMapping
	public Loan saveLoan(Loan loan) {
		return loanRepo.save(loan);
	}

	@GetMapping
	public Loan fetchLoanById(int id) {
		return loanRepo.findById(id).get();
	}

	@GetMapping
	public List<Loan> fetchAllLoans() {
		return loanRepo.findAll();
	}

	@PutMapping
	public Loan updateLoan(Loan loan) {
		return loanRepo.save(loan);
	}

	@DeleteMapping
	public void deleteLoanById(int id) {
		loanRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllLoans() {
		loanRepo.deleteAll();
	}
}
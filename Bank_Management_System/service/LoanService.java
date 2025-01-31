package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.LoanDao;
import com.jsp.Bank_Management_System.dto.Loan;

@Service
public class LoanService {

	@Autowired
	LoanDao loanDao;

	public Loan saveLoan(Loan loan) {
		return loanDao.saveLoan(loan);
	}

	public Loan fetchLoanById(int id) {
		return loanDao.fetchLoanById(id);
	}

	public List<Loan> fetchAllLoans() {
		return loanDao.fetchAllLoans();
	}

	public Loan updateLoan(Loan loan) {
		return loanDao.updateLoan(loan);
	}

	public void deleteLoanById(int id) {
		loanDao.deleteLoanById(id);
	}

	public void deleteAllLoans() {
		loanDao.deleteAllLoans();
	}
}
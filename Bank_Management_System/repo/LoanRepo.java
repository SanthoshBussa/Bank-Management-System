package com.jsp.Bank_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Bank_Management_System.dto.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer> {

}

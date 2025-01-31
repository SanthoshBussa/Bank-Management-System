package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Account;
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Loan;
import com.jsp.Bank_Management_System.repo.CustomerRepo;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepo customerRepo;

	@PostMapping
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@GetMapping
	public Customer fetchCustomerById(int id) {
		return customerRepo.findById(id).get();
	}

	@GetMapping
	public List<Customer> fetchAllCustomers() {
		return customerRepo.findAll();
	}

	@PutMapping
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@DeleteMapping
	public void deleteCustomerById(int id) {
		customerRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllCustomers() {
		customerRepo.deleteAll();
	}

	@PutMapping
	public Customer addNewAccountToCustomer(int customerId, Account account) {
		Customer customer = fetchCustomerById(customerId);
		List<Account> list = customer.getAccountsList();
		list.add(account);
		customer.setAccountsList(list);
		return saveCustomer(customer);
	}

	@PutMapping
	public Customer addNewLoanToExistingCustomer(int customerId, Loan loan) {
		Customer customer = fetchCustomerById(customerId);
		List<Loan> list = customer.getLoansList();
		list.add(loan);
		customer.setLoansList(list);
		return saveCustomer(customer);
	}
}
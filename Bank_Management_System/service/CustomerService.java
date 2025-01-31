package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Bank_Management_System.dao.CustomerDao;
import com.jsp.Bank_Management_System.dto.Account;
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Loan;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public Customer fetchCustomerById(int id) {
		return customerDao.fetchCustomerById(id);
	}

	public List<Customer> fetchAllCustomers() {
		return customerDao.fetchAllCustomers();
	}

	public Customer updteCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public void deleteCustomerById(int id) {
		customerDao.deleteCustomerById(id);
	}

	public void deleteAllCustomers() {
		customerDao.deleteAllCustomers();
	}

	public Customer addNewAccountToCustomer(int customerId, Account account) {
		return customerDao.addNewAccountToCustomer(customerId, account);
	}

	public Customer addNewLoanToExistingCustomer(int customerId, Loan loan) {
		return customerDao.addNewLoanToExistingCustomer(customerId, loan);
	}
}
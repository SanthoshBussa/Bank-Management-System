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
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Loan;
import com.jsp.Bank_Management_System.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@GetMapping("/fetchCustomerById")
	public Customer fetchCustomerById(@RequestParam int id) {
		return customerService.fetchCustomerById(id);
	}

	@GetMapping("/fetchAllCustomers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchAllCustomers();
	}

	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestParam int id, @RequestBody Customer customer) {
		customer.setCustomerId(id);
		return customerService.updteCustomer(customer);
	}

	@DeleteMapping("/deleteCustomerById")
	public String deleteCustomerById(@RequestParam int id) {
		customerService.deleteCustomerById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllCustomers")
	public String deleteAllCustomers() {
		customerService.deleteAllCustomers();
		return "Successfully Deleted All Customers";
	}

	@PutMapping("/addNewAccountToCustomer")
	public Customer addNewAccountToCustomer(@RequestParam int customerId, @RequestBody Account account) {
		return customerService.addNewAccountToCustomer(customerId, account);
	}

	@PutMapping("/addNewLoanToExistingCustomer")
	public Customer addNewLoanToExistingCustomer(@RequestParam int customerId, @RequestBody Loan loan) {
		return customerService.addNewLoanToExistingCustomer(customerId, loan);
	}
}
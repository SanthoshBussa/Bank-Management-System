package com.jsp.Bank_Management_System.dto;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private Date customerDOB;
	private int customerAge;
	private long customerMobile;
	private String customerEmail;
	private long customerAadharCard;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Account> accountsList;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Loan> loansList;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Fd> fdList;

	public List<Fd> getFdList() {
		return fdList;
	}

	public void setFdList(List<Fd> fdList) {
		this.fdList = fdList;
	}

	public List<Loan> getLoansList() {
		return loansList;
	}

	public void setLoansList(List<Loan> loansList) {
		this.loansList = loansList;
	}

	public List<Account> getAccountsList() {
		return accountsList;
	}

	public void setAccountsList(List<Account> accountsList) {
		this.accountsList = accountsList;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerAadharCard() {
		return customerAadharCard;
	}

	public void setCustomerAadharCard(long customerAadharCard) {
		this.customerAadharCard = customerAadharCard;
	}
}
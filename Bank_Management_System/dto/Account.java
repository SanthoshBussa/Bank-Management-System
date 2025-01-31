package com.jsp.Bank_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private long accountNumber;
	private String accountType;
	private double accountMinBalance;
	private String accountnominee;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountMinBalance() {
		return accountMinBalance;
	}

	public void setAccountMinBalance(double accountMinBalance) {
		this.accountMinBalance = accountMinBalance;
	}

	public String getAccountnominee() {
		return accountnominee;
	}

	public void setAccountnominee(String accountnominee) {
		this.accountnominee = accountnominee;
	}
}
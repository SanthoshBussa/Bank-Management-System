package com.jsp.Bank_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	private String managerName;
	private double managerSalary;
	private long managerMobile;
	private String managerEmail;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public double getManagerSalary() {
		return managerSalary;
	}

	public void setManagerSalary(double managerSalary) {
		this.managerSalary = managerSalary;
	}

	public long getManagerMobile() {
		return managerMobile;
	}

	public void setManagerMobile(long managerMobile) {
		this.managerMobile = managerMobile;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
}
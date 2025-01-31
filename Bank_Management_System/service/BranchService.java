package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Bank_Management_System.dao.BranchDao;
import com.jsp.Bank_Management_System.dto.Address;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Employee;
import com.jsp.Bank_Management_System.dto.Manager;

@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;

	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}

	public Branch fetchBranchById(int id) {
		return branchDao.fetchBranchById(id);
	}

	public List<Branch> fetchAllBranches() {
		return branchDao.fetchAllBranches();
	}

	public Branch updateBranch(Branch branch) {
		return branchDao.updateBranch(branch);
	}

	public void deleteBranchById(int id) {
		branchDao.deleteBranchById(id);
	}

	public void deleteAllBranches() {
		branchDao.deleteAllBranches();
	}

	public Branch addExistingManagerToExistingBranch(int branchId, int managerId) {
		return branchDao.addExistingManagerToExistingBranch(branchId, managerId);
	}

	public Branch addNewManagerToExistingBranch(int branchId, Manager manager) {
		return branchDao.addNewManagerToExistingBranch(branchId, manager);
	}

	public Branch addExistingAddressToExistingBranch(int branchId, int addressId) {
		return branchDao.addExistingAddressToExistingBranch(branchId, addressId);
	}

	public Branch addNewAddressToExistingBranch(int branchId, Address address) {
		return branchDao.addNewAddressToExistingBranch(branchId, address);
	}

	public Branch addExistingEmployeeToExistingBranch(int branchId, int employeeId) {
		return branchDao.addExistingEmployeeToExistingBranch(branchId, employeeId);
	}

	public Branch addNewEmployeeToExistingBranch(int branchId, Employee employee) {
		return branchDao.addNewEmployeeToExistingBranch(branchId, employee);
	}

	public Branch addExistingCustomerToExistingBranch(int branchId, int customerId) {
		return branchDao.addExistingCustomerToExistingBranch(branchId, customerId);
	}

	public Branch addNewCustomerToExistingBranch(int branchId, Customer customer) {
		return branchDao.addNewCustomerToExistingBranch(branchId, customer);
	}
}
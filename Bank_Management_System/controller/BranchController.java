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

import com.jsp.Bank_Management_System.dto.Address;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Employee;
import com.jsp.Bank_Management_System.dto.Manager;
import com.jsp.Bank_Management_System.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	BranchService branchService;

	@PostMapping("/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}

	@GetMapping("/fetchBranchById")
	public Branch fetchBranchById(@RequestParam int id) {
		return branchService.fetchBranchById(id);
	}

	@GetMapping("/fetchAllBranches")
	public List<Branch> fetchAllBranches() {
		return branchService.fetchAllBranches();
	}

	@PutMapping("/updateBranch")
	public Branch updateBranch(@RequestParam int id, @RequestBody Branch branch) {
		branch.setBranchId(id);
		return branchService.updateBranch(branch);
	}

	@DeleteMapping("/deleteBranchById")
	public String deleteBranchById(@RequestParam int id) {
		branchService.deleteBranchById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllBranches")
	public String deleteAllBranches() {
		branchService.deleteAllBranches();
		return "Successfully Deleted All Branches";
	}

	@PutMapping("/addExistingManagerToExistingBranch")
	public Branch addExistingManagerToExistingBranch(@RequestParam int branchId, @RequestParam int managerId) {
		return branchService.addExistingManagerToExistingBranch(branchId, managerId);
	}

	@PutMapping("/addNewManagerToExistingBranch")
	public Branch addNewManagerToExistingBranch(@RequestParam int branchId, @RequestBody Manager manager) {
		return branchService.addNewManagerToExistingBranch(branchId, manager);
	}

	@PutMapping("/addExistingAddressToExistingBranch")
	public Branch addExistingAddressToExistingBranch(@RequestParam int branchId, @RequestParam int addressId) {
		return branchService.addExistingAddressToExistingBranch(branchId, addressId);
	}

	@PutMapping("/addNewAddressToExistingBranch")
	public Branch addNewAddressToExistingBranch(@RequestParam int branchId, @RequestBody Address address) {
		return branchService.addNewAddressToExistingBranch(branchId, address);
	}

	@PutMapping("/addExistingEmployeeToExistingBranch")
	public Branch addExistingEmployeeToExistingBranch(@RequestParam int branchId, @RequestParam int employeeId) {
		return branchService.addExistingEmployeeToExistingBranch(branchId, employeeId);
	}

	@PutMapping("/addNewEmployeeToExistingBranch")
	public Branch addNewEmployeeToExistingBranch(@RequestParam int branchId, @RequestBody Employee employee) {
		return branchService.addNewEmployeeToExistingBranch(branchId, employee);
	}

	@PutMapping("/addExistingCustomerToExistingBranch")
	public Branch addExistingCustomerToExistingBranch(@RequestParam int branchId, @RequestParam int customerId) {
		return branchService.addExistingCustomerToExistingBranch(branchId, customerId);
	}

	@PutMapping("/addNewCustomerToExistingBranch")
	public Branch addNewCustomerToExistingBranch(@RequestParam int branchId, @RequestBody Customer customer) {
		return branchService.addNewCustomerToExistingBranch(branchId, customer);
	}
}
package com.jsp.Bank_Management_System.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.jsp.Bank_Management_System.dto.Address;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.dto.Customer;
import com.jsp.Bank_Management_System.dto.Employee;
import com.jsp.Bank_Management_System.dto.Manager;
import com.jsp.Bank_Management_System.repo.BranchRepo;

@Repository
public class BranchDao {

	@Autowired
	BranchRepo branchRepo;

	@Autowired
	ManagerDao managerDao;

	@Autowired
	AddressDao addressDao;

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	CustomerDao customerDao;

	@PostMapping
	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	@GetMapping
	public Branch fetchBranchById(int id) {
		return branchRepo.findById(id).get();
	}

	@GetMapping
	public List<Branch> fetchAllBranches() {
		return branchRepo.findAll();
	}

	@PutMapping
	public Branch updateBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	@DeleteMapping
	public void deleteBranchById(int id) {
		branchRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllBranches() {
		branchRepo.deleteAll();
	}

	@PutMapping
	public Branch addExistingManagerToExistingBranch(int branchId, int managerId) {
		Branch branch = fetchBranchById(branchId);
		Manager manager = managerDao.fetchManagerById(managerId);
		branch.setManager(manager);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addNewManagerToExistingBranch(int branchId, Manager manager) {
		Branch branch = fetchBranchById(branchId);
		branch.setManager(manager);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addExistingAddressToExistingBranch(int branchId, int addressId) {
		Branch branch = fetchBranchById(branchId);
		Address address = addressDao.fetchAddressById(addressId);
		branch.setAddress(address);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addNewAddressToExistingBranch(int branchId, Address address) {
		Branch branch = fetchBranchById(branchId);
		branch.setAddress(address);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addExistingEmployeeToExistingBranch(int branchId, int employeeId) {
		Employee employee = employeeDao.fetchEmployeeById(employeeId);
		Branch branch = fetchBranchById(branchId);
		List<Employee> list = branch.getEmployeeList();
		list.add(employee);
		branch.setEmployeeList(list);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addNewEmployeeToExistingBranch(int branchId, Employee employee) {
		Branch branch = fetchBranchById(branchId);
		List<Employee> list = branch.getEmployeeList();
		list.add(employee);
		branch.setEmployeeList(list);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addExistingCustomerToExistingBranch(int branchId, int customerId) {
		Customer customer = customerDao.fetchCustomerById(customerId);
		Branch branch = fetchBranchById(branchId);
		List<Customer> list = branch.getCustomerList();
		list.add(customer);
		branch.setCustomerList(list);
		return saveBranch(branch);
	}

	@PutMapping
	public Branch addNewCustomerToExistingBranch(int branchId, Customer customer) {
		Branch branch = fetchBranchById(branchId);
		List<Customer> list = branch.getCustomerList();
		list.add(customer);
		branch.setCustomerList(list);
		return saveBranch(branch);
	}
}
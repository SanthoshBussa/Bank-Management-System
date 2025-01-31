package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Employee;
import com.jsp.Bank_Management_System.repo.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo employeeRepo;

	@PostMapping
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@GetMapping
	public Employee fetchEmployeeById(int id) {
		return employeeRepo.findById(id).get();
	}

	@GetMapping
	public List<Employee> fetchAllEmployees() {
		return employeeRepo.findAll();
	}

	@PutMapping
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@DeleteMapping
	public void deleteEmployeeById(int id) {
		employeeRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllEmployees() {
		employeeRepo.deleteAll();
	}
}
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

import com.jsp.Bank_Management_System.dto.Employee;
import com.jsp.Bank_Management_System.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/fetchEmployeeById")
	public Employee fetchEmployeeById(@RequestParam int id) {
		return employeeService.fetchEmployeeById(id);
	}

	@GetMapping("/fetchAllEmployees")
	public List<Employee> fetchAllEmployees() {
		return employeeService.fetchAllEmployees();
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestParam int id, @RequestBody Employee employee) {
		employee.setEmployeeId(id);
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/deleteEmployeeById")
	public String deleteEmployeeById(@RequestParam int id) {
		employeeService.deleteEmployeeById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllEmployees")
	public String deleteAllEmployees() {
		employeeService.deleteAllEmployees();
		return "Successfully Deleted All Employees";
	}
}
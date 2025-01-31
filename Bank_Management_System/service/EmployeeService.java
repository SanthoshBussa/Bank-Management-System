package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Bank_Management_System.dao.EmployeeDao;
import com.jsp.Bank_Management_System.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	public Employee fetchEmployeeById(int id) {
		return employeeDao.fetchEmployeeById(id);
	}

	public List<Employee> fetchAllEmployees() {
		return employeeDao.fetchAllEmployees();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	public void deleteEmployeeById(int id) {
		employeeDao.deleteEmployeeById(id);
	}

	public void deleteAllEmployees() {
		employeeDao.deleteAllEmployees();
	}
}
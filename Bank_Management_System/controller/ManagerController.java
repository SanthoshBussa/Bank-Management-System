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

import com.jsp.Bank_Management_System.dto.Manager;
import com.jsp.Bank_Management_System.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	ManagerService managerService;

	@PostMapping("/saveManager")
	public Manager saveManager(@RequestBody Manager manager) {
		return managerService.saveManager(manager);
	}

	@GetMapping("/fetchManagerById")
	public Manager fetchManagerById(@RequestParam int id) {
		return managerService.fetchManagerById(id);
	}

	@GetMapping("/fetchAllManagers")
	public List<Manager> fetchAllManagers() {
		return managerService.fetchAllManagers();
	}

	@PutMapping("/updateManager")
	public Manager updateManager(@RequestParam int id, @RequestBody Manager manager) {
		manager.setManagerId(id);
		return managerService.updateManager(manager);
	}

	@DeleteMapping("/deleteManagerById")
	public String deleteManagerById(@RequestParam int id) {
		managerService.deleteManagerById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllManagers")
	public String deleteAllManagers() {
		managerService.deleteAllManagers();
		return "Successfully Deleted All Managers";
	}
}
package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Manager;
import com.jsp.Bank_Management_System.repo.ManagerRepo;

@Repository
public class ManagerDao {

	@Autowired
	ManagerRepo managerRepo;
	
	@PostMapping
	public Manager saveManager(Manager manager) {
		return managerRepo.save(manager);
	}
	
	@GetMapping
	public Manager fetchManagerById(int id) {
		return managerRepo.findById(id).get();
	}
	
	@GetMapping
	public List<Manager> fetchAllManagers(){
		return managerRepo.findAll();
	}
	
	@PutMapping
	public Manager updateManager(Manager manager) {
		return managerRepo.save(manager);
	}
	
	@DeleteMapping
	public void deleteManagerById(int id) {
		managerRepo.deleteById(id);
	}
	
	@DeleteMapping
	public void deleteAllManagers() {
		managerRepo.deleteAll();
	}
}

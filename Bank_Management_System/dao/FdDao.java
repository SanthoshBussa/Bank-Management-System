package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Fd;
import com.jsp.Bank_Management_System.repo.FdRepo;

@Repository
public class FdDao {

	@Autowired
	FdRepo fdRepo;

	@PostMapping
	public Fd saveFd(Fd fd) {
		return fdRepo.save(fd);
	}

	@GetMapping
	public Fd fetchFdById(int id) {
		return fdRepo.findById(id).get();
	}

	@GetMapping
	public List<Fd> fetchAllFds() {
		return fdRepo.findAll();
	}

	@PutMapping
	public Fd updateFd(Fd fd) {
		return fdRepo.save(fd);
	}

	@DeleteMapping
	public void deleteFdById(int id) {
		fdRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllFds() {
		fdRepo.deleteAll();	
	}
}
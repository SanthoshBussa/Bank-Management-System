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

import com.jsp.Bank_Management_System.dto.Fd;
import com.jsp.Bank_Management_System.service.FdService;

@RestController
public class FdController {
	
	@Autowired
	FdService fdService;
	
	@PostMapping("/saveFd")
	public Fd saveFd(@RequestBody Fd fd) {
		return fdService.saveFd(fd);
	}
	
	@GetMapping("/fetchFdById")
	public Fd fetchFdById(@RequestParam int id) {
		return fdService.fetchFdById(id);
	}
	
	@GetMapping("/fetchAllFds")
	public List<Fd> fetchAllFds(){
		return fdService.fetchAllFds();
	}
	
	@PutMapping("/updateFd")
	public Fd updateFd(@RequestParam int id, @RequestBody Fd fd) {
		fd.setFdId(id);
		return fdService.updateFd(fd);
	}
	
	@DeleteMapping("/deleteFdById")
	public String deleteFdById(@RequestParam int id) {
		fdService.deleteFdById(id);
		return "Successfully Deleted ";
	}
	
	@DeleteMapping("/deleteAllFds")
	public String deleteAllFds() {
		fdService.deleteAllFds();
		return "Successfully Deleted All Fds";
	}
}
package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jsp.Bank_Management_System.dto.Address;
import com.jsp.Bank_Management_System.repo.AddressRepo;

@Repository
public class AddressDao {

	@Autowired
	AddressRepo addressRepo;

	@PostMapping
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}

	@GetMapping
	public Address fetchAddressById(int id) {
		return addressRepo.findById(id).get();
	}

	@GetMapping
	public List<Address> fetchAllAddresses() {
		return addressRepo.findAll();
	}

	@PutMapping
	public Address updateAddress(Address address) {
		return addressRepo.save(address);
	}

	@DeleteMapping
	public void deleteAddressById(int id) {
		addressRepo.deleteById(id);
	}

	@DeleteMapping
	public void deleteAllAddresses() {
		addressRepo.deleteAll();
	}
}

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
import com.jsp.Bank_Management_System.service.AddressService;
@RestController
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}

	@GetMapping("/fetchAddressById")
	public Address fetchAddressById(@RequestParam int id) {
		return addressService.fetchAddressById(id);
	}

	@GetMapping("/fetchAllAddresses")
	public List<Address> fetchAllAddresses() {
		return addressService.fetchAllAddresses();
	}

	@PutMapping("/updateAddress")
	public Address updateAddress(@RequestParam int id, @RequestBody Address address) {
		address.setAddressId(id);
		return addressService.updateAddress(address);
	}

	@DeleteMapping("/deleteAddressById")
	public String deleteAddressById(@RequestParam int id) {
		addressService.deleteAddressById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllAddresses")
	public String deleteAllAddresses() {
		addressService.deleteAllAddresses();
		return "Successfully Deleted All Addresses";
	}
}
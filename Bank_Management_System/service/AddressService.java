package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Bank_Management_System.dao.AddressDao;
import com.jsp.Bank_Management_System.dto.Address;

@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;

	public Address saveAddress(Address address) {
		return addressDao.saveAddress(address);
	}

	public Address fetchAddressById(int id) {
		return addressDao.fetchAddressById(id);
	}

	public List<Address> fetchAllAddresses() {
		return addressDao.fetchAllAddresses();
	}

	public Address updateAddress(Address address) {
		return addressDao.updateAddress(address);
	}

	public void deleteAddressById(int id) {
		addressDao.deleteAddressById(id);
	}

	public void deleteAllAddresses() {
		addressDao.deleteAllAddresses();
	}
}
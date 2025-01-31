package com.jsp.Bank_Management_System.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.OwnerDao;
import com.jsp.Bank_Management_System.dto.Owner;
import com.jsp.Bank_Management_System.exception.OwnerIdNotFound;
import com.jsp.Bank_Management_System.util.ResponseStructure;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;

	@Autowired
	ResponseStructure<Owner> responseStructure;

	public ResponseStructure<Owner> saveOwner(Owner owner) {
		responseStructure.setMessage("Data Saved Successfully.");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setData(ownerDao.saveOwner(owner));

		return responseStructure;
	}

	public ResponseStructure<Owner> fetchOwnerById(int id) {
		Owner owner = ownerDao.fetchOwnerById(id);
		if (owner != null) {
			responseStructure.setMessage("Data Saved Successfully.");
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setData(owner);

			return responseStructure;
		} else {
			throw new OwnerIdNotFound();
		}
	}

	public List<Owner> fetchAllOwners() {
		List<Owner> list = ownerDao.fetchAllowners();
		return ownerDao.fetchAllowners();
	}

	public Owner updateOwner(Owner owner) {
		return ownerDao.updateOwner(owner);
	}

	public String deleteOwnerById(int id) {
		ownerDao.deleteOwnerById(id);
		return "Successfully Deleted";
	}

	public String deleteAllOwners() {
		ownerDao.deleteAllOwners();
		return "Successfully Deleted All Owners";
	}

	public Owner addExistingBankToExistingOwner(int bankId, int ownerId) {
		return ownerDao.addExistingBankToExistingOwner(bankId, ownerId);
	}
}
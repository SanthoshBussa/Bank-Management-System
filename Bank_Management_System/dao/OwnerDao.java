package com.jsp.Bank_Management_System.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.jsp.Bank_Management_System.dto.Bank;
import com.jsp.Bank_Management_System.dto.Owner;
import com.jsp.Bank_Management_System.repo.OwnerRepo;

@Repository
public class OwnerDao {

	@Autowired
	OwnerRepo ownerRepo;

	@Autowired
	BankDao bankDao;

	public Owner saveOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	public Owner fetchOwnerById(int id) {
		return ownerRepo.findById(id).get();
	}

	public List<Owner> fetchAllowners() {
		return ownerRepo.findAll();
	}

	public Owner updateOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	public String deleteOwnerById(int id) {
		ownerRepo.deleteById(id);
		return "Successfully Deleted";
	}

	public String deleteAllOwners() {
		ownerRepo.deleteAll();
		return "Successfully Deleted All Owners";
	}

	public Owner addExistingBankToExistingOwner(int bankId, int ownerId) {
		Owner owner = fetchOwnerById(ownerId);
		Bank bank = bankDao.fetchBankById(bankId);
		owner.setBank(bank);
		return saveOwner(owner);
	}
}
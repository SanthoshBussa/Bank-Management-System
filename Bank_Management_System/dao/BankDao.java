package com.jsp.Bank_Management_System.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.Bank_Management_System.dto.Bank;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.repo.BankRepo;

@Repository
public class BankDao {

	@Autowired
	BankRepo bankRepo;

	@Autowired
	BranchDao branchDao;

	public Bank saveBank(Bank bank) {
		return bankRepo.save(bank);
	}

	public Bank fetchBankById(int id) {
		Optional<Bank> bank = bankRepo.findById(id);
		if (bank.isEmpty()) {
			return null;
		} else {
			return bank.get();
		}
	}

	public List<Bank> fetchAllBanks() {
		List<Bank> banks = bankRepo.findAll();
		if (banks.isEmpty()) {
			return null;
		} else {
			return banks;
		}
	}

	public Bank updateBank(Bank bank) {
		return bankRepo.save(bank);
	}

	public Optional<Bank> deleteBankById(int id) {
		Optional<Bank> bank = bankRepo.findById(id);
		if (bank.isPresent()) {
			bankRepo.deleteById(id);
			return bank;
		} else {
			return null;
		}

	}

	public List<Bank> deleteAllBanks() {
		List<Bank> banks = bankRepo.findAll();
		if (banks!=null) {
			bankRepo.deleteAll();
			return null;
		} else {
			return banks;
		}
	}

	public Bank addExistingBranchToExistingBank(int bankId, int branchId) {
		Bank bank = fetchBankById(bankId);
		Branch branch = branchDao.fetchBranchById(branchId);
		List<Branch> list = bank.getBranch();
		list.add(branch);
		bank.setBranch(list);
		return saveBank(bank);
	}

	public Bank addNewBranchToExistingbank(int bankId, Branch branch) {
		Bank bank = fetchBankById(bankId);
		List<Branch> list = bank.getBranch();
		list.add(branch);
		bank.setBranch(list);
		return saveBank(bank);
	}
}
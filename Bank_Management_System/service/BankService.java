package com.jsp.Bank_Management_System.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.BankDao;
import com.jsp.Bank_Management_System.dao.BranchDao;
import com.jsp.Bank_Management_System.dto.Bank;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.exception.BankIdNotFound;
import com.jsp.Bank_Management_System.exception.BanksNotFound;
import com.jsp.Bank_Management_System.exception.BranchIdNotFound;
import com.jsp.Bank_Management_System.util.ResponseStructure;
import com.jsp.Bank_Management_System.util.ResponseStructureList;

@Service
public class BankService {

	@Autowired
	BankDao bankDao;

	@Autowired
	BranchDao branchDao;

	@Autowired
	ResponseStructure<Bank> responseStructure;

	@Autowired
	ResponseStructureList<Bank> responseStructureList;

	public ResponseStructure<Bank> saveBank(Bank bank) {
		responseStructure.setMessage("Data Saved Successfully.");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setData(bankDao.saveBank(bank));

		return responseStructure;
	}

	public ResponseStructure<Bank> fetchBankById(int id) {
		Bank bank = bankDao.fetchBankById(id);
		if (bank != null) {
			responseStructure.setMessage("Successfully Bank Fetched from Data Base");
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setData(bank);

			return responseStructure;
		} else {
			throw new BankIdNotFound();
		}
	}

	public ResponseStructureList<Bank> fetchAllBanks() {
		List<Bank> banks = bankDao.fetchAllBanks();
		if (banks != null) {
			responseStructureList.setMessage("All Banks Fetched Successfully from Data Base");
			responseStructureList.setStatusCode(HttpStatus.FOUND.value());
			responseStructureList.setData(banks);

			return responseStructureList;
		} else {
			throw new BanksNotFound();
		}
	}

	public ResponseStructure<Bank> updateBank(int id, Bank bank) {
		Bank dbBank = bankDao.fetchBankById(id);
		if (dbBank != null) {
			bank.setBankId(id);
			bankDao.updateBank(bank);
			responseStructure.setMessage("Data Updated Successfully.");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(bank);

			return responseStructure;
		} else {
			throw new BankIdNotFound();
		}

	}

	public ResponseStructure<Bank> deleteBankById(int id) {
		Bank bank = bankDao.fetchBankById(id);
		if (bank != null) {
			responseStructure.setMessage("Successfully Bank Deleted from Data Base");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(bank);

			return responseStructure;
		} else {
			throw new BankIdNotFound();
		}
	}

	public ResponseStructureList<Bank> deleteAllBanks() {
		List<Bank> fetchingBanks = bankDao.fetchAllBanks();
		if (fetchingBanks != null) {
			List<Bank> banks = bankDao.deleteAllBanks();
			responseStructureList.setMessage("All Banks Deleted Successfully from Data Base");
			responseStructureList.setStatusCode(HttpStatus.OK.value());
			responseStructureList.setData(fetchingBanks);

			return responseStructureList;
		} else {
			throw new BanksNotFound();
		}
	}

	public ResponseStructure<Bank> addExistingBranchToExistingBank(int bankId, int branchId) {
		Bank bank = bankDao.fetchBankById(bankId);
		if (bank != null) {
			Branch branch = branchDao.fetchBranchById(branchId);
			if (branch != null) {
				responseStructure.setMessage("Branch Added to Existing Bank Successfully");
				responseStructure.setStatusCode(HttpStatus.OK.value());
				responseStructure.setData(bank);
				return responseStructure;
			} else {
				throw new BranchIdNotFound();
			}
		} else {
			throw new BankIdNotFound();
		}
	}

	public Bank addNewBranchToExistingBank(int bankId, Branch branch) {
		return bankDao.addNewBranchToExistingbank(bankId, branch);
	}
}
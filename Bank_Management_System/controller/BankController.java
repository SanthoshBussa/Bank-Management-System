package com.jsp.Bank_Management_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.Bank_Management_System.dto.Bank;
import com.jsp.Bank_Management_System.dto.Branch;
import com.jsp.Bank_Management_System.service.BankService;
import com.jsp.Bank_Management_System.util.ResponseStructure;
import com.jsp.Bank_Management_System.util.ResponseStructureList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class BankController {

	@Autowired
	BankService bankService;

	@Operation(summary = "Save Bank", description = "API is used to save the bank")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Successfully created") })
	@PostMapping("/saveBank")
	public ResponseStructure<Bank> saveBank(@RequestBody Bank bank) {
		return bankService.saveBank(bank);
	}

	@Operation(summary = "Fetch Bank By Id", description = "API is used to Fetch the bank")
	@ApiResponses(value = { @ApiResponse(responseCode = "302", description = "Bank Fetched Successfully"),
			@ApiResponse(responseCode = "404", description = "Bank not found for the given id") })
	@GetMapping("/fetchBankById")
	public ResponseStructure<Bank> fetchBankById(@RequestParam int id) {
		return bankService.fetchBankById(id);
	}

	@Operation(summary = "Fetch All Banks", description = "API is used to Fetch All the Banks")
	@ApiResponses(value = { @ApiResponse(responseCode = "302", description = "All Banks Fetched Successfully"),
			@ApiResponse(responseCode = "404", description = "No Banks Are Present in the Data Base") })
	@GetMapping("/fetchAllBanks")
	public ResponseStructureList<Bank> fetchAllBanks() {
		return bankService.fetchAllBanks();
	}

	@Operation(summary = "Update Bank", description = "API is used to Update the Bank")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Bank Updated Successfully"),
			@ApiResponse(responseCode = "404", description = "Bank Not Found for the given id") })
	@PutMapping("/updateBank")
	public ResponseStructure<Bank> updateBank(@RequestParam int id, @RequestBody Bank bank) {
		return bankService.updateBank(id, bank);
	}

	@Operation(summary = "Delete Bank By Id", description = "API is used to Delete the bank")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Bank Deleted Successfully"),
			@ApiResponse(responseCode = "404", description = "Bank not found for the given id") })
	@DeleteMapping("/deleteBankById")
	public ResponseStructure<Bank> deleteBankById(@RequestParam int id) {
		return bankService.deleteBankById(id);
	}

	@Operation(summary = "Delete All Banks", description = "API is used to Delete All the banks")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "All Banks Deleted Successfully"),
			@ApiResponse(responseCode = "404", description = "No Banks Are Present in the Data Base") })
	@DeleteMapping("/deleteAllBanks")
	public ResponseStructureList<Bank> deleteAllBanks() {
		return bankService.deleteAllBanks();
	}

	@Operation(summary = "Add Existing Branch To Existing Bank", description = "API is used to add Existing Branch to Existing bank")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Branch Added Successfully"),
			@ApiResponse(responseCode = "404", description = "Data not found in the Data Base") })
	@PutMapping("/addExistingBranchToExistingBank")
	public ResponseStructure<Bank> addExistingBranchToExistingBank(@RequestParam int bankId, @RequestParam int branchId) {
		return bankService.addExistingBranchToExistingBank(bankId, branchId);
	}

	@PutMapping("/addNewBranchToExistingBank")
	public Bank addNewBranchToExistingBank(@RequestParam int bankId, @RequestBody Branch branch) {
		return bankService.addNewBranchToExistingBank(bankId, branch);
	}
}
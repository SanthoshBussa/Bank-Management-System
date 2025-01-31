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
import com.jsp.Bank_Management_System.dto.Owner;
import com.jsp.Bank_Management_System.service.OwnerService;
import com.jsp.Bank_Management_System.util.ResponseStructure;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class OwnerController {

	@Autowired
	OwnerService ownerService;

	@Operation(summary = "Save Owner", description = "API is used to save the Owner")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Successfully created") })
	@PostMapping("/saveOwner")
	public ResponseStructure<Owner> saveOwner(@RequestBody Owner owner) {
		return ownerService.saveOwner(owner);
	}

	@Operation(summary = "Save Owner", description = "API is used to save the Owner")
	@ApiResponses(value = { @ApiResponse(responseCode = "302", description = "Owner Fetched Successfully"),
			@ApiResponse(responseCode = "404", description = "Owner Not Found by give") })
	@GetMapping("/fetchOwnerById")
	public ResponseStructure<Owner> fetchOwnerById(@RequestParam int id) {
		return ownerService.fetchOwnerById(id);
	}

	@Operation(summary = "Fetch All Owners", description = "This API is used to fetch all the Owners persent in the database.")
	@ApiResponses(value = {@ApiResponse(responseCode = "302", description = "All Owners fetched Successfully."),
			@ApiResponse(responseCode = "404", description = "No Owners Present in the database...")})
	@GetMapping("/fetchAllOwners")
	public List<Owner> fetchAllOwners() {
		return ownerService.fetchAllOwners();
	}

	@PutMapping("/updateOwner")
	public Owner updateOwner(@RequestParam int id, @RequestBody Owner owner) {
		owner.setOwnerId(id);
		return ownerService.updateOwner(owner);
	}

	@DeleteMapping("/deleteOwner")
	public String deleteOwnerById(@RequestParam int id) {
		ownerService.deleteOwnerById(id);
		return "Success";
	}

	@DeleteMapping("/deleteAllOwners")
	public String deleteAllOwners() {
		ownerService.deleteAllOwners();
		return "Sucessfully Deleted All Owners";
	}

	@PutMapping("/addExistingBankToExistingOwner")
	public Owner addExistingBankToExistingOwner(int bankId, int ownerId) {
		return ownerService.addExistingBankToExistingOwner(bankId, ownerId);
	}
}
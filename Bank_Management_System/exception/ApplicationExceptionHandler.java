package com.jsp.Bank_Management_System.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.jsp.Bank_Management_System.util.ResponseStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@Autowired
	ResponseStructure<String> responseStructure;
	
	@ExceptionHandler(OwnerIdNotFound.class)
	public ResponseStructure<String> OwnerIdNotFound(OwnerIdNotFound ownerIdNotFound) {
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("ID Not Found");
		responseStructure.setData(ownerIdNotFound.getMessage());

		return responseStructure;
	}

	@ExceptionHandler(BankIdNotFound.class)
	public ResponseStructure<String> BankIdNotFound(BankIdNotFound bankIdNotFound) {
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("ID Not Found");
		responseStructure.setData(bankIdNotFound.getMessage());

		return responseStructure;
	}

	@ExceptionHandler(BanksNotFound.class)
	public ResponseStructure<String> BanksNotFound(BanksNotFound banksNotFound) {
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("Banks Not Found");
		responseStructure.setData(banksNotFound.getMessage());

		return responseStructure;
	}
	
	@ExceptionHandler(BranchIdNotFound.class)
	public ResponseStructure<String> BranchIdNotFound(BranchIdNotFound branchIdNotFound) {
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("ID Not Found");
		responseStructure.setData(branchIdNotFound.getMessage());

		return responseStructure;
	}
}
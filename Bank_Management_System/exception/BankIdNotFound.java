package com.jsp.Bank_Management_System.exception;

public class BankIdNotFound extends RuntimeException {

	private String message = "Bank Id Not Found in the DataBase";

	public String getMessage() {
		return message;
	}
}
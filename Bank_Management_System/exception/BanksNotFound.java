package com.jsp.Bank_Management_System.exception;

public class BanksNotFound extends RuntimeException {

	private String message = "No Banks Found in the DataBase";

	public String getMessage() {
		return message;
	}
}

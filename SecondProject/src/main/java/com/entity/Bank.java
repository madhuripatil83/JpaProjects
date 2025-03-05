package com.entity;

public class Bank {
	
	int bankId;
	String bankName;
	
	public Bank() {
	}

	public Bank(int bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + "]";
	}
	
	

}

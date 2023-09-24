package com.corejava.oop;

public class Account {
	private String Number=null;
	private String Accounttype;
	private String Balance;
	
	public void setNumber (String Number) {
		this.Number=Number;
	}
	public String getNumber() {
		return Number;
	}
	public void setAccounttype (String Accounttype) {
		this.Accounttype=Accounttype;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setBalance (String Balance) {
		this.Balance=Balance;
	}
	public String getBalance() {
		return Balance;
	}

}

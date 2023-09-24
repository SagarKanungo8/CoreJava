package com.corejava.oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a;
		a= new Account ();
		a.setNumber("09941101176555");
		a.setAccounttype("Current");
		a.setBalance("287000.00");
		System.out.println("Number:"+a.getNumber());
		System.out.println("Accounttype:"+a.getAccounttype());
		System.out.println("Balance:"+a.getBalance());
		// TODO Auto-generated method stub

	}

}

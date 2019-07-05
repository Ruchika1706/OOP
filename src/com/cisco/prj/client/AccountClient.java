package com.cisco.prj.client;

import com.cisco.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account(1000);
		Account second = new Account();
		
		first.deposit(5000); // gets converted to deposit(first, 5000) internally 
		second.deposit(2500); //deposit(second,2500)
		
		System.out.println("First Account:");
		System.out.println(first.getBalance());
		
		System.out.println("Second Account:");
		System.out.println(second.getBalance());
		
		System.out.println("Number of objects created " + Account.getCount());
		
	}

}

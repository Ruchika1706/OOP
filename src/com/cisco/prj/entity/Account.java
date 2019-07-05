package com.cisco.prj.entity;

public class Account {
	private double balance; //Instance member
	private static int count; //class member
	
	/* constructor */
	public Account(double amt) {
		this.balance = amt;
		count++;
	}
	
	/* default constructor*/
	public Account() {
		count++;
	}
	
	/* Mutation code */
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	/* Accessor code */
	public double getBalance() {
		return this.balance;
	}	
	
	public static int getCount() {
		return count;
	}
}

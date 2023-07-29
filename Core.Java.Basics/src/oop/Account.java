package oop;



public class Account {
private String number;
private String accountType;
private double balance;

public String getAccountType() {
	return accountType;
}

public void setAccountType(String string) {
	this.accountType = string;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}

public void deposit(double d) {
	this.balance=d+balance;
}
public void withdrawl (double w) {
	this.balance= balance - w;
   if (balance<1000) {
	   System.err.println("Insufficent Balance ... !!!");
}
}
public void fundTransfer (double f) {
	this.balance = balance - f;
}
public void payBill (double p) {
	this.balance = balance - p;
}
}

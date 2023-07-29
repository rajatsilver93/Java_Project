package oop;

public class TestAccount {
	public static void main(String[] args) {
		Account x = new Account();
		x.setAccountType("savings");
		System.out.println(x.getAccountType());
		x.setBalance(25000.00);
		System.out.println(x.getBalance());
		x.setNumber("BOI123411");
		System.out.println(x.getNumber());
		x.deposit(25004);
		System.out.println(x.getBalance());
		x.withdrawl(50000);
		System.out.println(x.getBalance());
		x.fundTransfer(2100);
		System.out.println(x.getBalance());
		x.payBill(1200);
		System.out.println(x.getBalance());
	}
}

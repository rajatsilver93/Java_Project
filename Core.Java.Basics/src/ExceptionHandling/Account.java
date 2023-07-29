package ExceptionHandling;

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
	public void withdrawl (double w) throws InsufficientFund {
		this.balance= balance - w;
	   if (balance<500) {
		   InsufficientFund e = new InsufficientFund();
		   throw e;
		   }
	   System.out.println("Withdrawl = "+ w);
	   
	}
	public void fundTransfer (double f) throws InsufficientFund {
		this.balance = balance - f;
		 if (balance<500) {
			   InsufficientFund e = new InsufficientFund();
			   throw e;
			   }
		 System.out.println("FundTransfer = "+ f );
	}
	public void payBill (double p) throws InsufficientFund {
		this.balance = balance - p;
		if (balance<500) {
			   InsufficientFund e = new InsufficientFund();
			   throw e;
			   }
		 System.out.println("PayBill = "+ p);

}
}

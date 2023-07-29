package ExceptionHandling;

public class TestAccount {
	public static void main(String[] args) throws InsufficientFund {
		Account a = new Account();
		a.setBalance(5000);
		a.setAccountType("savings");
		a.setNumber("5512345");

		a.deposit(500);
		try {
			a.withdrawl(1501);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			a.fundTransfer(1000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			a.payBill(250);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Remaining Balance = " + a.getBalance());

		}
	}
}

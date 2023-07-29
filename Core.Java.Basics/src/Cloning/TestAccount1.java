package Cloning;

public class TestAccount1 {
	public static void main(String[] args) throws Exception {
		Customer c1= new Customer("Rajat");
		Customer c2 = (Customer)c1.clone();
		c2.name="Rahul";
		c2.account.setBalance(20);
		Customer c3 = (Customer)c1.clone();
		c3.name="Monil";
		c3.account.setBalance(50);
		Customer c4 = (Customer)c1.clone();
		c4.name="Arun";
		c4.account.setBalance(-50);
		System.out.println("Name -> "+ c1.name);
		System.out.println("Balance -> "+c1.account.getBalance());
		System.out.println("Name -> "+ c2.name);
		System.out.println("Balance -> "+c2.account.getBalance());
		System.out.println("Name -> "+ c3.name);
		System.out.println("Balance -> "+c3.account.getBalance());
		System.out.println("Name - "+ c4.name);
		System.out.println("Balance -> "+c4.account.getBalance());
	}

}

package Cloning;
//deep
public class Customer implements Cloneable {
	public String name = null;
	public Account account= null;
	
	public Customer(String n) {
		name = n;
		account= new Account(10);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c =(Customer)super.clone();
		c.account=(Account)account.clone();
		return c;
	}
	

}

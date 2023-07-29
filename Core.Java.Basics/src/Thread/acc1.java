package Thread;

public class acc1 {
	int balance=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	} 
public synchronized void deposit (String name , int amt) {
	
	int total = getBalance()+amt;
	setBalance(total);
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(name+" "+getBalance());
}
}
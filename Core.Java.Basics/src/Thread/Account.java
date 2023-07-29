package Thread;

public class Account {
private int balance= 0 ;

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}	
public synchronized void deposit (String name , int amt) {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	int total = getBalance()+amt;
	
	setBalance(total);
	System.out.println(name+" "+getBalance());
}
}

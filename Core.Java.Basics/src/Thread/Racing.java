package Thread;

public class Racing extends Thread{
	
  String name = null;
  
 public static Account account = new Account();
 @Override
	public void run() {
	for (int i = 1; i <=5; i++) {
		account.deposit(name,1000);
	}
		
	}
 public Racing(String name) {
	 this.name=name;
	 
 }
}

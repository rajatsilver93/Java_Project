package Thread;

public class racing1 extends Thread{
	String name=null;
	public static acc1 account = new acc1();
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 1; i <=5; i++) {
		account.deposit(name, 500);
	}
}
	public racing1(String name) {
		this.name=name;
	}
}
package Thread;

public class TestThreadByRunnable {
	public static void main(String[] args) {
		ThreadByRunnable r1 = new ThreadByRunnable("Rajat");
		ThreadByRunnable r2 = new ThreadByRunnable("Monil");
		ThreadByRunnable r3 = new ThreadByRunnable("Arun");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

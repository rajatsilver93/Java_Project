package Thread;

public class TestWithThread {
	public static void main(String[] args) {
		WithThread t1 = new WithThread("Rajat");
		WithThread t2 = new WithThread("Arun");
		WithThread t3 = new WithThread("Monil");
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

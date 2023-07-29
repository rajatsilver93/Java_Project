package Thread;

public class TestRacing {
	public static void main(String[] args) {
		//Account a = new Account();
		Racing t1 = new Racing("Rajat");
		Racing t2 = new Racing("Arun");
		Racing t3 = new Racing("Monil");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

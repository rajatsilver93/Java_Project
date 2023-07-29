package Thread;

public class TestWithoutThread {
	public static void main(String[] args) {
		WithoutThread w1 = new WithoutThread("Rajat");
		WithoutThread w2 = new WithoutThread("Monil");
		WithoutThread w3 = new WithoutThread("Arun");
		
		w1.run();
		w2.run();
		w3.run();
	}
	

}

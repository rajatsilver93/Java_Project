package Thread;

public class testrac1 {

	public static void main(String[] args) {
		racing1 r = new racing1("monil");
		racing1 r1 = new racing1("rajat");
		
		r.start();
		r1.start();

	}

}

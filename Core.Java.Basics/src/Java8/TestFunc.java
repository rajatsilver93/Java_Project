package Java8;

public class TestFunc {
	public static void main(String[] args) {
		TestHello h = new TestHello() {
			
			@Override
			public void show() {
				System.out.println("Show method");
				
			}
		};
		h.show();
		h.defaultmethod();
		TestHello.staticmethod();
	}

}

package Java8;
@FunctionalInterface
public interface TestHello {
	public void show();
	
	public default void defaultmethod(){
		System.out.println("Default method");
	}
		public static void staticmethod() {
			System.out.println("Static method");
			
		}
		
	}



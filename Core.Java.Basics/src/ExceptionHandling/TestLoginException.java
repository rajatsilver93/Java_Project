package ExceptionHandling;

public class TestLoginException {
	public static void main(String[] args) {
		try {
			String name = "Rajat";
			if (name.equals("arun")) {
				System.out.println("Valid user");

			} else {
				throw new LogInException();

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

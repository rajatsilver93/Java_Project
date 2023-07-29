package ExceptionHandling;

public class MultipleTryCatch {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[8]);
			int a = 15/0;
			System.out.println(a);

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("GoodBye");
		}

	}

}

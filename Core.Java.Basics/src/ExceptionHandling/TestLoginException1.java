package ExceptionHandling;

public class TestLoginException1 {
	public static void main(String[] args)throws LogInException {
		auth("Rajat");
	}

	private static void auth(String login) throws LogInException {
		if(!login.equals("admin")) {
			LogInException e=new LogInException();
			System.out.println(e.getMessage());
			throw e;
		}
		
	}


		
	}



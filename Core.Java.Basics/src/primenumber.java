
public class primenumber {
	public static void main(String[] args) {
		int n = 29;
	    boolean f = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      if (n % i == 0) {
	        f = true;
	        break;
	      }
	    }

	    if (!f)
	      System.out.println(n + " is a prime number.");
	    else
	      System.out.println(n+ " is not a prime number.");
	  }
		
	}




	import java.util.Scanner;

	public class Calculator {
		public static void main(String[]args) {
			
			char cal;
			do {
			 double
			 s1,s2,Result;
			Scanner sr=new Scanner(System.in);
			System.out.println(" Pls Enter your Data -");
			cal=sr.next().charAt(0);
			System.out.println("Enter First number -" );
			s1=sr.nextInt();
			System.out.println("Enter Second number -" );
			s2=sr.nextInt();
			switch(cal) {
			    case '+':
			    	Result = s1+s2;
					System.out.println(s1+"+"+s2+"="+Result);
				    break;
				case '-':
				    Result = s1-s2;
				    System.out.println(s1+"-"+s2+"="+Result);
				    break;
				case '*':
					Result = s1*s2;
					System.out.println(s1+"*"+s2+"="+Result);
					break;
				case '/':
					Result = s1/s2;
					System.out.println(s1+"/"+s2+"="+Result);
					break;
				case '%':
					
				default:
					System.out.println("Invalid data!");
					break;
							  }
			System.out.println("Do you want to continue(Y/N)");
			 cal =sr.next().charAt(0);
			 
			 
			}
			while(cal=='y'||cal=='y');
			
			}
		
			}

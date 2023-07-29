
public class strcount1 {
public static void main(String[] args) {
	String name = "rajat soni";
	int count = 0;
	for (int i = 0; i < name.length(); i++) {
		  System.out.print(name.charAt(i));
		  
		if (name.charAt(i)=='a') {
			 count++;		
		}	
	}
		System.out.println(" ");
		System.err.println("a -->" + count);

	}
}
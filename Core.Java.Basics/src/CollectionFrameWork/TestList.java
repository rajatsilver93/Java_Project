package CollectionFrameWork;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		 ArrayList A1= new ArrayList();
		 A1.add("Rajat");
		 A1.add(100);
		 
		 ArrayList A2= new ArrayList();
		 A2.add("Rahul");
		 A2.add(200);
		 
		 A1.add("indore");
		 System.out.println(A1);
		 
		 A1.addAll(A2);
		 System.out.println(A1);
		 
		 System.out.println(A1.get(2));
		 
		 System.out.println(A1.remove(4));
		 System.out.println(A1);
		 
		 A1.set(0, "Soni");
		 System.out.println(A1);
		 
		 System.out.println(A1.subList(0,2 ));
		 
	     System.out.println(A1.indexOf("Rahul"));
	     
	     System.out.println(A1);
	     
	     System.out.println(A1.lastIndexOf("Soni"));
	     String s="Harsh Sahu";
	     System.out.println(s.lastIndexOf("u"));
		 
		 
		
	}

}

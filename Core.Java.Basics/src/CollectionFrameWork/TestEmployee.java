package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
	Employee e1=new Employee(1, "Rajat", "Rau");
	Employee e2=new Employee(1, "Rajat", "Rau");
	Employee e3=new Employee(3, "Monil", "Sanwer");
	Employee e4=new Employee(4, "Arun", "Gwalior");
	Employee e5=new Employee(5, "Harsh", "Indore");
	
	System.out.println(e1.equals(e2));
	//System.out.println(e2.equals(e3));
	//System.out.println(e3.equals(e4));
	//System.out.println(e4.equals(e5));
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	//System.out.println(e3.hashCode());
	//System.out.println(e4.hashCode());
	//System.out.println(e5.hashCode());

    List list= new ArrayList();
    //list.add("one");
    //System.out.println(list.contains("one"));
    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    list.add(e5);
    
    Iterator it = list.iterator();
    while (it.hasNext()) {
	  Employee e = (Employee) it.next();
	  System.err.println(e.getId());
	  //System.out.println(e.getName());
	//  System.err.print(e.getAddress());
		
	}

}
}
package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestiteratorPerson{
public static void main(String[] args) {
	
	Person p1= new Person(1, "Rajat", "Indore");
	Person p2= new Person(2, "Arun", "Indore");
	Person p3= new Person(3, "Monil", "Indore");
	Person p4= new Person(4, "Rahul", "Indore");
	
	List l = new ArrayList();
	
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	
	Iterator it= l.iterator();
	
	while (it.hasNext()) {
		Person p = (Person) it.next();
		
		//System.out.println(p);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
	}
	
	
}

}
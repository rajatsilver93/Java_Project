package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Employee(1, "Rajat", "Indore") );
		list.add(new Employee(2, "Rahul", "Indore") );
		list.add(new Employee(3, "Raj", "Indore") );
		list.add(new Employee(4, "Raja", "Indore") );
		list.add(new Employee(5, "Raajat", "Indore") );
		//Collections.sort(list);
		//for (Object object : list) {
			//System.out.println(object);
		//Collections.sort(list, new OrderByName());
		for (Object object : list) {
		System.out.println(object);	
	
			
		}
		Collections.sort(list, new OrderById());
		for (Object object2 : list) {
			System.out.println(object2);
		}
		}		}
	


package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection list1 = new ArrayList();
		list1.add("One");
		list1.add("two");
		System.out.println(list1);
		
		Collection list2 = new ArrayList();
		list2.add("three");
		list2.add("four");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list2.clear();
		System.out.println(list2);
	
		System.out.println(list1.contains("one"));
		
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list2.isEmpty());
		
		list1.remove("two");
		System.out.println(list1);
		
		//list1.removeAll(list1);
		//System.out.println(list1);
		
		list1.retainAll(list1);
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		
	}

}

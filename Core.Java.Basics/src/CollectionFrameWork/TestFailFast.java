package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(1);
	l.add("one");
	l.add(2);
	l.add("two");
	
	Iterator it=l.iterator();
	//l.add(30);
	
	
	while (it.hasNext()) {
		
		System.out.println(it.next());
		
	}
}
}

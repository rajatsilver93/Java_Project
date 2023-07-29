package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {public static void main(String[] args) {
	Vector v = new Vector();
	v.add(1);
	v.add("one");
	v.add(2);
	v.add("two");
	
     Enumeration e = v.elements();
	v.add(30);
	
	
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
	}
}


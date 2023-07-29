package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		a.add("tata");
		a.add("bye bye");
		a.add("gya");
		//a.add("one");
		//a.add("two");
		//a.add("three");
		
		System.out.println("lenght of collection:" + a.size());
		System.out.println(a);
		for (Object b : a) {
			System.out.println(b);
		}
			

		}

	}



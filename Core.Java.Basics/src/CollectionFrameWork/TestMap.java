package CollectionFrameWork;

import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap m1 = new HashMap();
		m1.put("1", "Rajat");
		m1.put("2", "Arun");
		m1.put("3", "Rahul");
		
		System.out.println(m1);
		//m1.clear();
		//System.out.println(m1);
		System.out.println(m1.containsKey("2"));
		
		System.out.println(m1.containsValue("Rajat"));
		
		System.out.println(m1.entrySet());
		
		System.out.println(m1.get("2"));
		
		System.out.println(m1.isEmpty());
		
		System.out.println(m1.keySet());
		
		m1.put("1", "MOnil");
		System.out.println(m1);
		
		m1.remove("2");
		System.out.println(m1);
		
		System.out.println(m1.size());
		
		System.out.println(m1.values());
	}

}

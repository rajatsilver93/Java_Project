package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {
	public static void main(String[] args) {

	List l = new ArrayList();
		l.add(12);
		l.add(15);
		l.add(13);
		l.add(11);
		l.add(14);
		l.add(16);
		l.add(11);

	//	l.stream().sorted().forEach(e -> {System.out.println(e);});
		l.stream().sorted().distinct().forEach(e -> {System.out.println(e);});
		
	}
}
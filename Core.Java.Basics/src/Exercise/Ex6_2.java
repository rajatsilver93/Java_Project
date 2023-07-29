package Exercise;

public class Ex6_2 {
	public static void main(String[] args) {
		String s = "Vijay Chauhan";
		int i = s.indexOf(" ");
		String s1 = s.substring(0,i);
		String s2 = s.substring(i+1);
		
		System.out.println(s2);
	}

}

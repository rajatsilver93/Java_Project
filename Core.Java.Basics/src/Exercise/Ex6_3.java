package Exercise;

public class Ex6_3 {
	public static void main(String[] args) {
		String s = "Intersteller";
		int Totalcount =s.length();
		int Totalcount_afterRemove=s.replace("e","").length();
		int count =Totalcount-Totalcount_afterRemove;
		
		System.out.println("Total count of e is--> "+count);
	}

}

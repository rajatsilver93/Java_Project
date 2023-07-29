package constructer;

public class TestPerson {
	public static void main(String[] args) {
		Employee p= new Employee(10,"Rajat","indore", "IT");
		
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.getDepartment());
	
	}

}

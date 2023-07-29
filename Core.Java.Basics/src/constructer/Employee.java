package constructer;

public class Employee extends Person {
	private String department;
	public Employee() {
		System.out.println("zero parameter");
		
	}
	public Employee (int id, String name , String address , String department) {
		super(id , name , address);
		this.department=department;
		
		System.out.println("four parameter");
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
		
	}



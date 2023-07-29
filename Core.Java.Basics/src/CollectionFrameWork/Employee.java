package CollectionFrameWork;

public class Employee {
	private int id;
	private String name;
	private String address;
	
	public Employee(int id , String name , String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;	
		}
		Employee e =(Employee)obj;
		boolean b = this.id==e.id && this.name==e.name && this.address==e.name;
		return b;
	}
	@Override
	public int hashCode() {
		String str= id+name+address;
		return str.hashCode();
	}
	
@Override
public String toString() {
	return id+" "+name+" "+address;
}

}

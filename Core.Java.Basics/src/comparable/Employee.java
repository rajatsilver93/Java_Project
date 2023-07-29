package comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String address;

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String toString() {
		return id + " " + name + " " + address;
	}

	@Override
	public int compareTo(Employee o) {
		return (this.id - o.id);

	}
	
}
class OrderById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}
	 
 }
class OrderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
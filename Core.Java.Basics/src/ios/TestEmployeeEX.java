package ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeEX {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\Employee1.txt");
		
		ObjectOutputStream o = new ObjectOutputStream(f);

		Employee e = new Employee();

		e.id = 1;
		e.Firstname = "Rajat";
		e.Lastname = "soni";
		e.salary = 1000;

		o.writeObject(e);

		f.close();
		o.close();
	}
}
class TestEmoloyeeEx1{
	public static void main(String[] args) throws Exception {
		FileInputStream fi= new FileInputStream("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\Employee1.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Employee e1 = (Employee)oi.readObject();
		System.out.println(e1.id);
		System.out.println(e1.Firstname);
		System.out.println(e1.Lastname);
		System.out.println(e1.salary);
	}
}

package ios;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	public int id;
	public String Firstname;
	public String Lastname;
	public int salary;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(Firstname);
		out.writeObject(Lastname);
		out.writeObject(salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=(int)in.readObject();
		Firstname=(String)in.readObject();
		Lastname=(String)in.readObject();
		salary=(int)in.readObject();
	
		
	}

}

package ios;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialisation {
	public static void main(String[] args)throws Exception {
		FileInputStream fs = new FileInputStream("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\Untiteled.txt");
		ObjectInputStream  os = new ObjectInputStream(fs);
		Marksheet m  = (Marksheet)os.readObject();
		
		System.out.println(m.rollno);
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.total);
	}

}

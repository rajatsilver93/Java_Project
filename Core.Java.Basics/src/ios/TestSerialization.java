package ios;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws Exception{
		FileOutputStream f = new FileOutputStream("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\Untiteled.txt");
		ObjectOutputStream of = new ObjectOutputStream(f);
		Marksheet m = new Marksheet();
		m.rollno=1212121;
		m.name="Rajat";
		m.physics=70;
		m.chemistry=75;
		m.maths=80;
		m.total=m.physics+m.chemistry+m.maths;
		of.writeObject(m);
		
		f.close();
		of.close();
	}

}

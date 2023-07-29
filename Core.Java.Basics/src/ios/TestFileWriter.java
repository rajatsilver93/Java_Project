package ios;

import java.io.FileWriter;

public class TestFileWriter {
	public static void main(String[] args)  throws Exception{
		FileWriter f = new FileWriter("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt",true);
		f.write("how are you ????");
		f.write("where are you from ???");
		f.close();
		
		
	}

}

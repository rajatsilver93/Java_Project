package ios;

import java.io.FileReader;

public class ReadCharbyChar {
	public static void main(String[] args) throws Exception{
		FileReader f= new FileReader("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt");
		int ch = f.read();
		while ((ch!=-1)) {
			System.out.println((char)ch);
			ch=f.read();
			
		}
		
	}

}

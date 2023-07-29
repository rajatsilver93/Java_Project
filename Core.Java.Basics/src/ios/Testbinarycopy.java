package ios;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Testbinarycopy {
	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt";
		String target = "C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\h.txt";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = in.read();
		while (ch!=-1) {
			out.write(ch);
			ch= in.read();
		}
		in.close();
		out.close();
	}

}

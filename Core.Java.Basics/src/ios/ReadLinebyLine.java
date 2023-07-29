package ios;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLinebyLine {
	public static void main(String[] args) throws Exception{
		FileReader f = new FileReader("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt");
		BufferedReader br = new BufferedReader(f);
		String l = br.readLine();
		while (l !=null) {
			System.out.println(l);
			l=br.readLine();
			
		}
		
	}

}

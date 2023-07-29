package ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Testreadwrite {
	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt");
		FileWriter w = new FileWriter("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hi.txt");
		BufferedReader br = new BufferedReader(f);
		PrintWriter out = new PrintWriter(w);
		String s = br.readLine();
		
		while (s!=null) {
			//System.out.println(s);
			out.print(s);
			s=br.readLine();
		}
				w.close();
				br.close();
	}

}

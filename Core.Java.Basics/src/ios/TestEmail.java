package ios;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestEmail {
	public static void main(String[] args) throws Exception {

		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\Email.txt"));

		String line = br.readLine();

		while (!(line.equals("quit"))) {
			//pw.println(line);
			//line=br.readLine();
			if (line.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
				pw.println(line);
				
			}
			line = br.readLine();
		}
		sr.close();
		br.close();
		pw.close();


	}

}

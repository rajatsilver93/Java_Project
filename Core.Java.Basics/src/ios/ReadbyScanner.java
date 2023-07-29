package ios;

import java.io.FileReader;
import java.util.Scanner;

public class ReadbyScanner {
public static void main(String[] args)throws Exception {
	FileReader f = new FileReader("C:\\Users\\rajat\\OneDrive\\Desktop\\ios\\hello.txt");
	Scanner s = new Scanner(f);
	while (s.hasNext()) {
		System.out.println(s.nextLine());
		
	}
	f.close();
	s.close();
}
}

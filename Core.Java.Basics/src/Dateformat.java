import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {
public static void main(String[] args) {
	
			Date d=new Date();
			System.out.println(d);
			SimpleDateFormat h=new SimpleDateFormat("dd/MM/yyyy");
			String s=h.format(d);
			System.out.println(s);
		}
}


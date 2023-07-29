package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallableOut {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	CallableStatement call = conn.prepareCall("{Call empOUT(?)}");
	call.registerOutParameter(1, Types.INTEGER);
	
	call.execute();
	
	System.out.println("MAX AGE= "+call.getInt(1));
	
	
}
}

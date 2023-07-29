package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallableInOut {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		CallableStatement callstmt = conn.prepareCall("{Call empINOUT(?)}");
		
		callstmt.setInt(1, 1);
		callstmt.registerOutParameter(1, Types.INTEGER);
		callstmt.execute();
		
		System.out.println(callstmt.getInt(1));
		
	}

}

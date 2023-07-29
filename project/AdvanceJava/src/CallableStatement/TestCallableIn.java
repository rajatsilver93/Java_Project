package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestCallableIn {
	
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	CallableStatement call = conn.prepareCall("{Call empIN(?)}");
	call.setInt(1, 2);
	call.execute();
	ResultSet rs =call.getResultSet();
	while (rs.next()) {
		System.out.print("\t"+rs.getInt(1));
		System.out.print("\t"+rs.getString(2));
		System.out.print("\t"+rs.getString(3));
		System.out.print("\t"+rs.getString(4));
		System.out.print("\t"+rs.getInt(5));
		System.out.print("\t"+rs.getString(6));
		System.out.print("\t"+rs.getString(7));
		System.out.println("\t"+rs.getString(8));
	}
	
}

}

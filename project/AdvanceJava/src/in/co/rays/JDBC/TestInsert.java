package in.co.rays.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root" ,"root");
		Statement st=conn.createStatement();
		int i = st.executeUpdate("insert into marksheet values(16,'nitin',1116,56,85,45)");
		System.out.println("Data inserted "+ i);
		
	}

}

package in.co.rays.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","root");
		Statement st =conn.createStatement();
		int i =st.executeUpdate("update marksheet set roll_no=1120 where id =1 ");
		
		System.out.println("Data Updated "+i);
		
	}

}

package in.co.rays.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCreateDatabase {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st =conn.createStatement();
		int i =st.executeUpdate("create database testdtbs1 ");
		
		System.out.println("NEW DATABASE "+ i);
	}

}

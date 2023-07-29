package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
			
			try {
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into marksheet values(19, 'xyz', 1214, 14, 14, 14)");
			i = stmt.executeUpdate("insert into marksheet values(20, 'xyz', 1214, 14, 14, 14)");
			i = stmt.executeUpdate("insert into marksheet values(21, 'xyz', 1214, 14, 14, 14)");
			System.out.println("Data Inserted "+ i);
			conn.commit();
			
		}catch (Exception e) {
			conn.rollback();
			System.out.println("Data not Inserted");
			
		}

}}

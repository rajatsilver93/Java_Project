package in.co.rays.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transaction {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into marksheet values(16, 'xyz', 1214, 14, 14, 14)");
			i = stmt.executeUpdate("insert into marksheet values(17, 'xyz', 1214, 14, 14, 14)");
			i = stmt.executeUpdate("insert into marksheet values(18, 'xyz', 1214, 14, 14, 14)");
			System.out.println("Data Inserted "+ i);
			conn.commit();
		}
}

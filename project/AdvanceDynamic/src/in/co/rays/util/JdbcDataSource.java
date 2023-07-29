package in.co.rays.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private static JdbcDataSource jds = null;
	private ComboPooledDataSource ds = null;

	private JdbcDataSource() {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");
			
			ds = new ComboPooledDataSource();
			ds.setDriverClass(rb.getString("Driver"));
			ds.setJdbcUrl(rb.getString("Url"));
			ds.setUser(rb.getString("User"));
			ds.setPassword(rb.getString("Password"));
			ds.setInitialPoolSize(Integer.parseInt(rb.getString("Initial")));
			ds.setAcquireIncrement(Integer.parseInt(rb.getString("Acquire")));
			ds.setMaxPoolSize(Integer.parseInt(rb.getString("Maximum")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JdbcDataSource getInstance() {
		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;
	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (Exception e) {
			return null;
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, Statement stmt) {
		closeConnection(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);
	}
}
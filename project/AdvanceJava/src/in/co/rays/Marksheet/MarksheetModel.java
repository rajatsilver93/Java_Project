package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRollno());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		int i = ps.executeUpdate();
		System.out.println("Inserted Values " + i);
	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = conn.prepareStatement(
				"UPDATE MARKSHEET SET NAME=? , ROLL_NO=?, PHYSICS=?,CHEMISTRY=?,MATHS=? WHERE ID = ?");

		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getRollno());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getId());
		int i = ps.executeUpdate();
		System.out.println("UPDATED VALUES " + i);

	}

	public static void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ID = ?");

		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println("DELETED VALUES" + i);

	}

	public MarksheetBean searchByRoll(int rollno) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM MARKSHEET WHERE ROLL_NO =?");

		ps.setInt(1, rollno);
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;

	}
	public List search(MarksheetBean bean , int PageNumber , int PageSize) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		StringBuffer sql = new StringBuffer("SELECT * FROM MARKSHEET where 1=1");
		
		if (bean !=null) {
			if (bean.getName() != null && bean.getName().length()>0) {		
				sql.append("and name like '" + bean.getName()+"%'");	
			}
			if (bean.getRollno() >0) {
				sql.append(" and Roll_no = '" +bean.getRollno() + "'");
			}
		}
		if (PageSize>0) {
			PageNumber = (PageNumber-1)* PageSize ;
			
			sql.append(" limit " + PageNumber + "," + PageSize);
			
		}
		System.out.println(sql);
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs= ps.executeQuery();
		ArrayList list = new ArrayList();
		
		while (rs.next()) {
		    bean= new MarksheetBean();
		    
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}
		
		return list;
		
	}

}

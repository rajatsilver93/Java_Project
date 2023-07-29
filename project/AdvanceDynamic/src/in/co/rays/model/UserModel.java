package in.co.rays.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.Userbean;
import in.co.rays.util.JdbcDataSource;

public class UserModel {
	public int nextPk() throws Exception {
		int pk = 0;
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select max(id) from user");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;
	}

	public void add(Userbean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?, ?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getLoginId());
		ps.setString(5, bean.getPassword());
		ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(7, bean.getAddress());
		int i = ps.executeUpdate();
		System.out.println("Data inserted " + i);
	}

	public void delete(int id) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");
		ps.setInt(1, id);
		int i = ps.executeUpdate();

		System.out.println("Data Deleted " + i);
	}

	public void update(Userbean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(
				"update user set first_name =?, last_name=?, login_id=?, password =?, dob=?, address=? where id = ?");

		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());

		ps.setInt(7, bean.getId());
		int i = ps.executeUpdate();
		System.out.println("Data updated " + i);
	}

	public Userbean searchById(int id) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from user where id = ?");
		ResultSet rs = ps.executeQuery();
		ps.setInt(1, id);
		Userbean bean = null;
		while (rs.next()) {
			bean = new Userbean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
		}
		return bean;
	}

	public List search(Userbean bean, int pageNo, int pageSize) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		StringBuffer sql = new StringBuffer("select * from user where 1=1");
		if (bean != null) {
			if (bean.getDob() != null && bean.getDob().getTime() > 0) {
				sql.append(" and Dob like '" + new java.sql.Date(bean.getDob().getTime()) + "%'");
			}
			if (bean.getFirstName() != null && bean.getFirstName().length() > 0) {
				sql.append(" and First_Name like '" + bean.getFirstName() + "%'");
			}
			if (bean.getLoginId() != null && bean.getLoginId().length() > 0) {
				sql.append(" and Login_id like '" + bean.getLoginId() + "%'");
			}
		}
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + "," + pageSize);
		}
		System.out.println(sql);
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		List list = new ArrayList();
		bean = null;
		while (rs.next()) {
			bean = new Userbean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
			list.add(bean);
		}
		return list;
	}

	public Userbean authentication(String login_id, String password) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from User where Login_id = ? and password = ?");
		ps.setString(1, login_id);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		Userbean bean = null;
		while (rs.next()) {
			bean = new Userbean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
		}
		return bean;
	}

	public Userbean FindbyPk(int id) throws Exception {

		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from User where id = ? ");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Userbean bean = null;
		while (rs.next()) {
			bean = new Userbean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));

		}
		return bean;
	}
}
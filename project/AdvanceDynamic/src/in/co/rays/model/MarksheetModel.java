package in.co.rays.model;

 import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import com.mysql.cj.protocol.Resultset;
	import com.mysql.cj.xdevapi.PreparableStatement;

	import in.co.rays.bean.Marksheetbean;
	import in.co.rays.util.JdbcDataSource;

	public class MarksheetModel {

		public int nextPk() throws Exception {
			int pk = 0;

			Connection conn = JdbcDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet	");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				pk = rs.getInt(1);

			}
			return pk + 1;

		}

		public void add(Marksheetbean bean) throws Exception {

			Connection conn = JdbcDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("insert into marksheet values(? ,? ,? ,? ,? ,?)");

			ps.setInt(1, nextPk());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getRollno());
			ps.setInt(4, bean.getPhysics());
			ps.setInt(5, bean.getChemistry());
			ps.setInt(6, bean.getMaths());

			int i = ps.executeUpdate();
			System.out.println("Data Inserted " + i);

		}

		public static void delete(int id) throws Exception {
			Connection conn = JdbcDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");

			ps.setInt(1, id);
			int i = ps.executeUpdate();
			System.out.println("Data deleted " + i);
		}

		public static void update(Marksheetbean bean) throws Exception {

			Connection conn = JdbcDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement(
					"update marksheet set name=? ,roll_no = ?, physics =?, CHEMISTRY = ?, MATHEMATICS = ? where id = ? ");

			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getRollno());
			ps.setInt(3, bean.getPhysics());
			ps.setInt(4, bean.getChemistry());
			ps.setInt(5, bean.getMaths());
			ps.setInt(6, bean.getId());

			int i = ps.executeUpdate();

			System.out.println("Data Updated " + i);

		}

		public Marksheetbean searchById(int id) throws Exception {

			Connection conn = JdbcDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = ?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			Marksheetbean bean = null;

			while (rs.next()) {
				bean = new Marksheetbean();
				
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setRollno(rs.getInt(3));
				bean.setPhysics(rs.getInt(4));
				bean.setChemistry(rs.getInt(5));
				bean.setMaths(rs.getInt(6));
			}
			return bean;
		}

		public List search(Marksheetbean bean, int pageNumber, int pageSize) throws Exception {

			Connection conn = JdbcDataSource.getConnection();

			StringBuffer sql = new StringBuffer("select * from marksheet where true"); // we can write 1=1 where true

			PreparedStatement ps = conn.prepareStatement(sql.toString());

			ResultSet rs = ps.executeQuery();
			if (bean != null) {
				if (bean.getName() != null && bean.getName().length() > 0) {
					sql.append("and name like'" + bean.getName() + "%'");
				}
				if (bean.getRollno() > 0) {
					sql.append("and roll_no = '" + bean.getRollno() + "'");
				}
			}
			if (pageSize > 0) {
				pageNumber = (pageNumber - 1) * pageSize;
				sql.append(" limit " + pageNumber + "," + pageSize);
			}
			System.out.println(sql);
			List list = new ArrayList();
			while (rs.next()) {
				bean = new Marksheetbean();
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

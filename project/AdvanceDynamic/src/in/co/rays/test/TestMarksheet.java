package in.co.rays.test;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	import in.co.rays.bean.Userbean;
	import in.co.rays.model.UserModel;

	public class TestMarksheet {
		public static void main(String[] args) throws Exception {
			// testAdd();
			// testDelete();
			// testUpdate();
			testSearch();
		}

		private static void testSearch() throws Exception {
			Userbean bean = new Userbean();
			UserModel model = new UserModel();
			List list = new ArrayList();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (Userbean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getFirstName());
				System.out.println(bean.getLastName());
				System.out.println(bean.getLoginId());
				System.out.println(bean.getPassword());
				System.out.println(bean.getDob());
				System.out.println(bean.getAddress());
			}
		}

		private static void testUpdate() throws Exception {
			Userbean bean = new Userbean();
			UserModel model = new UserModel();
			SimpleDateFormat sdf = new SimpleDateFormat();

			bean.setId(7);
			bean.setFirstName("xyz");
			bean.setLastName("abc");
			bean.setLoginId("xyz.abc@gmail.com");
			bean.setPassword("1234567");
			bean.setDob(sdf.parse("2001-07-07"));
			bean.setAddress("Ujjain");
			model.update(bean);
		}

		private static void testDelete() throws Exception {
			UserModel model = new UserModel();
			model.delete(15);
		}

		private static void testAdd() throws Exception {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Userbean bean = new Userbean();
			UserModel model = new UserModel();

			bean.setFirstName("Aditi");
			bean.setLastName("Bajpai");
			bean.setLoginId("aiditi.bajpai@gmail.com");
			bean.setPassword("123456");
			bean.setDob(sdf.parse("2000-07-07"));
			bean.setAddress("Indore");

			model.add(bean);
		}
	}



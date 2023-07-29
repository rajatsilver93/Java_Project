package in.co.rays.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		//testDelete();
          //testSearchById();
		//testSearch();
		testauthentication();
          
	}

	private static void testauthentication()throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.authentication("rajat.soni93@gmail.com", "654465cds");
		if (bean != null) {
            System.out.println("ACCESS GRANTED");
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
		}
		else {
			System.err.println("NOT VALID");
		}
		
	}

	private static void testSearch() throws Exception {
		UserBean bean=new UserBean();
		UserModel model = new UserModel();
		List list =model.Search(null, 1, 4);
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			bean= (UserBean)it.next();
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getFirstName());
			System.out.print("\t"+bean.getLastName());
			System.out.print("\t"+bean.getLogId());
			System.out.print("\t"+bean.getPassword());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t"+bean.getAddress());
		}
		}
		

	private static void testSearchById() throws Exception{
		UserModel model = new UserModel();
		UserBean bean= model.SearchByid(3);
		
		if (bean == null) {
			System.err.println("DATA NOT FOUND");
			
		}
		else {
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getFirstName());
			System.out.print("\t"+bean.getLastName());
			System.out.print("\t"+bean.getLogId());
			System.out.print("\t"+bean.getPassword());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t"+bean.getAddress());
		}
		
		
	}

	private static void testDelete() throws Exception {
		UserModel.delete(6);

	}

	private static void testUpdate() throws Exception {
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		bean.setId(4);
		bean.setFirstName("Harsh");
		bean.setLastName("Sahu");
		bean.setLogId("harshsahu@gmail.com");
		bean.setPassword("jkhdsjk5");
		bean.setDob(sdf.parse("2001/05/06"));
		bean.setAddress("Indore");
		UserModel model = new UserModel();
		model.update(bean);

	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		bean.setId(model.nextPk());
		bean.setFirstName("Monil");
		bean.setLastName("Chouhan");
		bean.setLogId("monilchouhan@gmail.com");
		bean.setPassword("csass555");
		bean.setDob(sdf.parse("1993/04/16"));
		bean.setAddress("Indore");
		model.add(bean);
	}

}

package in.co.rays.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testupdate();
		// testdelete();
		//testsearchByRoll();
		testsearch();
	}
	private static void testsearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();
		List list = model.search(null ,1 , 5);
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			 bean = (MarksheetBean) it.next();
			 
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getName());
			System.out.print("\t"+bean.getRollno());
			System.out.print("\t"+bean.getPhysics());
			System.out.print("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			
			
		}
		
		
	}
	private static void testdelete() throws Exception {
		MarksheetModel.delete(17);
	}
	private static void testsearchByRoll() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.searchByRoll(1120);
		if (bean == null) {
			System.err.println("NOT EXIST....");

		} else {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getRollno());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
		}
	}
	private static void testupdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(17);
		bean.setName("nitesh");
		bean.setRollno(1117);
		bean.setPhysics(56);
		bean.setChemistry(66);
		bean.setMaths(45);
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
	}
	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(17);
		bean.setName("vipin");
		bean.setRollno(1117);
		bean.setPhysics(56);
		bean.setChemistry(66);
		bean.setMaths(45);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}
}

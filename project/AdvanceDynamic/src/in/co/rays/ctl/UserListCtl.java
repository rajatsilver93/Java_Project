package in.co.rays.ctl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.Userbean;
import in.co.rays.model.UserModel;

@WebServlet("/UserListCtl.do")
public class UserListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int pageNo = 1;
		int pageSize = 5;
		Userbean bean = null;
		UserModel model = new UserModel();

		try {
			List list = model.search(bean, pageNo, pageSize);
			req.setAttribute("list", list);
			req.setAttribute("pageNo", pageNo);

			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pageNo = 1;
		int pageSize = 5;

		pageNo = Integer.parseInt(req.getParameter("pageNo"));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String op = req.getParameter("operation");

		UserModel model = new UserModel();
		Userbean bean = new Userbean();
		if (op.equals("delete")) {
			try {
				String id = req.getParameter("ids");
				model.delete(Integer.parseInt(id));
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		if (op.equals("next")) {
			pageNo++;
		}
		if (op.equals("previous")) {
			pageNo--;

		}

		if (op.equals("Search")) {

			try {

				String FirstName = req.getParameter("firstName");
				String dob = req.getParameter("dob");
				bean.setFirstName(FirstName);

				if (!(dob.equals(""))) {
					bean.setDob(sdf.parse(dob));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		List list;
		try {
			list = model.search(bean, pageNo, pageSize);

			req.setAttribute("list", list);
			req.setAttribute("pageNo", pageNo);

			RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

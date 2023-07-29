package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.Userbean;
import in.co.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if (id != null) {
			UserModel model = new UserModel();

			try {
				Userbean bean = model.FindbyPk(Integer.parseInt(id));
				req.setAttribute("bean", bean);

				RequestDispatcher rd = req.getRequestDispatcher("UpdateUser.jsp");
				rd.forward(req, resp);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {

			resp.sendRedirect("UserRegistrationView.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = req.getParameter("operation");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String DOB = req.getParameter("dob");
		String address = req.getParameter("address");

		Userbean bean = new Userbean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(DOB));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setAddress(address);

		UserModel model = new UserModel();
		try {
			if (op.equals("register")) {

				model.add(bean);

				resp.setContentType("Text/html");
				PrintWriter out = resp.getWriter();
				out.print("<h1>Data Inserted.....!!!!</h1>");

				resp.sendRedirect("LoginView.jsp");
			}
			if (op.equals("update")) {
				HttpSession session = req.getSession();
				
				String id = req.getParameter("id");
				
				bean.setId(Integer.parseInt(id));

				model.update(bean);
                
				session.setAttribute("update", "Updated Successfully");
				resp.sendRedirect("UserListCtl.do");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

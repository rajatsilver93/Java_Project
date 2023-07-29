package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.Userbean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = req.getParameter("operation");
		if (op != null) {
			HttpSession session = req.getSession();
			System.out.println("logout: " + session.getId());
			session.invalidate();

		}
		resp.sendRedirect("LoginView.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");

		String op = req.getParameter("operation");

		if (op.equals("signIn")) {

			UserModel model = new UserModel();

			try {
				Userbean bean = model.authentication(loginId, password);
				if (bean != null) {
					HttpSession session = req.getSession();
					System.out.println(session.getId());
					session.setAttribute("user", bean);
					String uri = req.getParameter("uri");
					if (uri.equalsIgnoreCase("null")) {
						resp.sendRedirect("WelcomeCtl.do");
					} else {
						resp.sendRedirect(uri);
					}
				} else {
					req.setAttribute("msg", "Invalid LoginId & password");
					RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
					rd.forward(req, resp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (op.equals("signUp")) {
			resp.sendRedirect("UserRegistrationCtl");

		}
	}

}

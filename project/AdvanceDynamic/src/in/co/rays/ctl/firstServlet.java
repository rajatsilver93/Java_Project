package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("in do get");
	String firsname = req.getParameter("firstName");
	String lastname = req.getParameter("lastName");
	String logInId = req.getParameter("logInId");
	String password = req.getParameter("password");
	String[] address = req.getParameterValues("address");
	
	System.out.println(firsname);
	System.out.println(lastname);
	System.out.println(logInId);
	System.out.println(password);
	System.out.println(address[0]);
	System.out.println(address[1]);
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.print(firsname+" "+lastname+" "+logInId+" "+password+" "+address[0]+" "+address[1]);
	out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	}



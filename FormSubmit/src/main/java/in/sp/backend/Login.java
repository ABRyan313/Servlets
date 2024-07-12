package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		
		String user = (String) req.getParameter("user1");
		String password = (String) req.getParameter("pass1");
		PrintWriter out = res.getWriter();
		
		if(user.equals("AB Ryan") && password.equals("389141")) {
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		
		else {
			res.setContentType("text/html");
			out.print("<h3 style = 'color:red'> OOPSI!!!!</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
			
			
		}
		
	}

}

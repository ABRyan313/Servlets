package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
	
		PrintWriter out = res.getWriter();
		
		String search = (String)req.getParameter("search1");
		if(search.equals("Audri Udash")) {
			res.sendRedirect("https://www.facebook.com");
		}
		
		else {
			res.setContentType("text/html");
			out.print("<h3 style ='color:red'>Fuck you </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.include(req, res);
		}
		
	}

}

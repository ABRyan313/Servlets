package in.sp.backend;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
	
		
		
		String search = req.getParameter("search1");
		if(search.equals("Audri Udash")) {
			res.sendRedirect("https://www.facebook.com");
		}
		
	}

}

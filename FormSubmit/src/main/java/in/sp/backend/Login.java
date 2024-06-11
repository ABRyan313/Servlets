package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		String myuser = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		if(myuser.equals("AB Ryan") && mypass.equals("389141")){
			PrintWriter out = res.getWriter();
			out.print("Success");
			System.out.println("Success");
		}
		else {
			PrintWriter out = res.getWriter();
			out.print("Try Again");
			System.out.println("try Again");
		}
		
			/*
			 * PrintWriter out = res.getWriter(); out.print("Name" + myuser);
			 * out.print("Email" + mypass);
			 */
		
		
		
	}

}

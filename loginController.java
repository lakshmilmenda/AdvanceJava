package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		
	String uname = request.getParameter("uname");
	String password = request. getParameter("password");
	
	
	model.loginCredential obj = new model.loginCredential();
	obj.setUname(uname);
	obj.setPassword(password);
	
	if(obj.checkLogin())
			{
				request.setAttribute("username",uname);
				RequestDispatcher dispatch =  request.getRequestDispatcher("success.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				RequestDispatcher dispatch =  request.getRequestDispatcher("failure.jsp");
				dispatch.forward(request, response);
			}
	
	
	}

}

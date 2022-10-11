package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet mwthod called::");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//username="om";
		//password="dd";
		
		
		
		LoginService loginservice = new LoginService();
		boolean flag = loginservice.verifyUserCredentials(username,password);
		if(flag) {
			
			HttpSession session = request.getSession();
			session.setAttribute("lusername", username);
			
			//session.getValue(request.getParameter("username"));
			System.out.println("user is valid");
			String st = "login successfully!";
			request.setAttribute("message", st);

			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

			rd.forward(request, response);
			
		}else {
			
			String str= "invalid username or password ";
			request.setAttribute("Message", str);
			
			System.out.println("user is not valid");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

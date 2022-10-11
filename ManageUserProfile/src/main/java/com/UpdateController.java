package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		int userid=Integer.parseInt(request.getParameter("userid"));
		//request.getParameter("username");
		if(request.getParameter("username") == null) {
		
		try {
			
			int userid=Integer.parseInt(request.getParameter("userid"));
		System.out.println(userid);
			LoginService login = new LoginService();
			
			User2 user=	login.getdata(userid);
			if(user != null) {
				request.setAttribute("user", user);
				RequestDispatcher rd =request.getRequestDispatcher("user-edit.jsp");
			
			rd.forward(request, response);
			
			}
			else {
				RequestDispatcher rd =request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);

				
			}
			
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
		}else {
			try {
			User2 user = new User2();
			LoginService login = new LoginService();
			
			
			
			user.setUserid(Integer.parseInt(request.getParameter("userid")));
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user.setMobileno(request.getParameter("mobileno"));
			user.setAddress(request.getParameter("address"));
			boolean bl=login.UpdatedData(user);
			if(bl) {
				
			LoginService log=new LoginService();
			List<User2> list=log.showdata();
		
			request.setAttribute("update", list);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

			rd.forward(request, response);
			}else {
				
				request.setAttribute("error","cant update list");
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);

			}
				
			
			}catch(Exception e){
				e.printStackTrace();
			}	
			
			
			
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

package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resetting
 */
@WebServlet("/Resetting")
public class Resetting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resetting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User2 user2 = new User2();
		user2.setUsername(request.getParameter("username"));
		user2.setPassword(request.getParameter("password"));
		user2.setAddress(request.getParameter("address"));
		user2.setMobileno(request.getParameter("mobileno"));
		//user2.setUserid(Integer.parseInt(request.getParameter("userid")));
		
		/*String username=request.getParameter("username");
		String address=request.getParameter("address");
		String password= request.getParameter("password");
		int mobileno=Integer.parseInt(request.getParameter("mobileno"));*/
		
		LoginService ls =new LoginService();
		try {
		boolean data=ls.storedata(user2);
			if(data==true) {
				System.out.println("user found");
				RequestDispatcher ds=request.getRequestDispatcher("index.jsp");
				ds.forward(request, response);
				
			}else {
				System.out.println("user not found");
				RequestDispatcher ds = request.getRequestDispatcher("fill.jsp");
				ds.forward(request, response);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
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

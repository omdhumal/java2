package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteDataController
 */
@WebServlet("/DeleteDataController")
public class DeleteDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteDataController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("userid");
		int userid = Integer.parseInt(id);
		String username = request.getParameter("username");

		LoginService log = new LoginService();
		
		HttpSession session = request.getSession(false);
		String lusername = (String)session.getAttribute("lusername");

		// int list=log.deletedatas(userid);
		String uid = request.getParameter("userid");
		System.out.println("id:" + uid);
		boolean i=false;
		try {

			if (!username.equalsIgnoreCase(lusername)) {

				i = log.deletedatas(userid);

				if (i) {

					List<User2> list = log.showdata();

					request.setAttribute("data", list);
					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					rd.forward(request, response);
					System.out.println("deleted successfully!");

				} else {

					List<User2> list = log.showdata();

					request.setAttribute("Message", "Can't delete");

					RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
					rd.forward(request, response);
				}
			} else {
				List list = log.showdata();

				request.setAttribute("data", list);
				request.setAttribute("message", "you cant delete logged in user ");
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

				rd.forward(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

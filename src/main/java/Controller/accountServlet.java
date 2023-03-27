package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Dao.accountsDao;

import Model.accounts;

/**
 * Servlet implementation class accountServlet
 */
@WebServlet("/accountServlet")
public class accountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Login.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");

		accountsDao dao = new accountsDao();
		
		try { 
			accounts isValid = dao.checkLogin(username, password);
			
			if (isValid != null)
			   
			{
				//tao session de luu tru phien dang nhap
				HttpSession session = request.getSession();
				//thiet lap gia tri trong session
				session.setAttribute("username", isValid);
				
				//chuyen den view trang home
				response.sendRedirect("productServlet");
			}else {
				//truong hop dang nhap that bai 
				request.setAttribute("mess","Wrong username or pass !!!");
				RequestDispatcher rd = request.getRequestDispatcher("Loilogin.jsp");
				rd.forward(request, response);
			}
		} finally {
		     response.getWriter().close();
		}
	}
}
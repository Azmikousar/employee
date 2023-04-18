package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserValidation
 */
@WebServlet("/login")
public class UserValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter  out=response.getWriter();
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		RequestDispatcher rd=null;
		if(userName.equals("admin")&& password.equals("admin")) {
			rd=request.getRequestDispatcher("showMenu.jsp");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("login.jsp");
			out.println("<h2>Invalid username or password. Please try again.");
			rd.include(request, response);
			
		}
		
		
		

		}

}


package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import dao.IDao;
import hr.Employee;

/**
 * Servlet implementation class UpdateDepartment
 */
@WebServlet("/updateDept")
public class UpdateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean success=false;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sEmpNo=request.getParameter("empNo");
		int empNo=Integer.parseInt(sEmpNo);
		String newDept=request.getParameter("empDept");
		IDao<Employee,Integer> dao=new EmployeeDAO();
		try
		{
			success=dao.updateById(empNo,"DEPARTMENT", newDept);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		if(success)
			out.println("<h1>Department updated successfully</h1>");
		else
			out.println("<h1>Employee does not exist</h1>");
		
		request.getRequestDispatcher("showMenu.jsp").include(request, response);
	}

}

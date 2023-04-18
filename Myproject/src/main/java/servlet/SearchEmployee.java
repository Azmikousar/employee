package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import dao.IDao;
import hr.Employee;

/**
 * Servlet implementation class SearchEmployee
 */
@WebServlet("/searchEmployee")
public class SearchEmployee extends HttpServlet {
	/**
	 * @return the serialversionuid
	 */
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

response.setContentType("text/html");
PrintWriter out = response.getWriter();
String sEmpNo=request.getParameter("empNo");
int empNo =Integer.parseInt(sEmpNo);

IDao<Employee, Integer> dao=new EmployeeDAO();

Employee emp=null;
try {
	emp=dao.getById(empNo);
	
}
catch (Exception e) {
	e.printStackTrace();
}
if(emp!=null) {
	request.setAttribute("foundEmployee", emp);
	request.getRequestDispatcher("showEmployee.jsp").forward(request, response);
}
else
{
	out.println("<h3>Employee does not exist...</h3>");
	request.getRequestDispatcher("showMenu.jsp").include(request, response);
	
}
	}

}

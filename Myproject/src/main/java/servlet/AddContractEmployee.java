package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import dao.IDao;
import hr.ContractEmployee;
import hr.Employee;



/**
 * Servlet implementation class AddContractEmployee
 */
@WebServlet("/addContractEmp")
public class AddContractEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sEmpno=request.getParameter("empNo");
		String empName=request.getParameter("empName");
		String sEmpSal=request.getParameter("empSal");
		String empDept=request.getParameter("empDept");
		String sDateOfJoining=request.getParameter("empJoinDate");
		String jDateValues[]=sDateOfJoining.split("-");
		String sDateOfBirth=request.getParameter("empBirthDate");
		String bDateValues[]=sDateOfBirth.split("-");
		String empContractor=request.getParameter("contractor");
		String sContractPeriod=request.getParameter("contractPeriod");
		
		
		int empNo=Integer.parseInt(sEmpno);
		float empSal=Float.parseFloat(sEmpSal);
		LocalDate joinDate=LocalDate.of(Integer.parseInt(jDateValues[0]),Integer.parseInt(jDateValues[1]),Integer.parseInt(jDateValues[2]) );
		LocalDate birthDate=LocalDate.of(Integer.parseInt(bDateValues[0]),Integer.parseInt(bDateValues[1]),Integer.parseInt(bDateValues[2]));
		int empContractPeriod=Integer.parseInt(sContractPeriod);
		
		float empIncentives=empSal*11.75f/100.0f;
		
		
		Employee contEmp = new ContractEmployee(empNo,empName,empSal,empDept,joinDate,birthDate, empContractPeriod, empContractor, empIncentives);
		IDao<Employee,Integer> idao=new EmployeeDAO();
		try {
			idao.add(contEmp);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		
		RequestDispatcher rd=request.getRequestDispatcher("showMenu.jsp");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Record added successfully</h1>");
		rd.include(request, response);
	}


	}


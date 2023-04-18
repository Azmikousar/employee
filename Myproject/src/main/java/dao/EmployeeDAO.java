package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import helpers.DBUtils;
import hr.ContractEmployee;
import hr.Employee;
import hr.PermanentEmployee;

public  class EmployeeDAO implements IDao<Employee,Integer> {

	

	

	@Override
	public void add(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		
		String sqlQuery =null;
		String empType=null;
		Connection conn=DBUtils.getConnection();
		if(emp instanceof PermanentEmployee){
		  sqlQuery="insert into employee_master(emp_no,emp_name,emp_sal,emp_dept,emp_join_date,emp_birth_date,emp_type,emp_perm_da,emp_perm_hra) values(?,?,?,?,?,?,?,?,?)";
		  PermanentEmployee pe=(PermanentEmployee)emp;
		  int empNo=pe.getEmpNo();
		  String empName=pe.getEmpName();
		  float empSal=pe.getEmpSal();
		  String empDept=pe.getDepartment();
		  LocalDate empJoinDate=pe.getDateOfJoining();
		  LocalDate empBirthDate=pe.getDateOfBirth();
		  empType ="PERMANENT";
		  float empDa=pe.getDa();
		  float empHra=pe.getHra();


		 PreparedStatement pstmt =conn.prepareStatement(sqlQuery);
		 pstmt.setInt(1,empNo);
		 pstmt.setString(2,empName);
		 pstmt.setFloat(3,empSal);
		 pstmt.setString(4,empDept);
		 pstmt.setDate(5,java.sql.Date.valueOf(empJoinDate));
		 pstmt.setDate(6,java.sql.Date.valueOf(empBirthDate));
		 pstmt.setString(7,empType);
		 pstmt.setFloat(8,empDa);
		 pstmt.setFloat(9,empHra);

		 pstmt.executeUpdate();

		
	}

		else if(emp instanceof ContractEmployee) {
			sqlQuery="insert into employee_master(emp_no,emp_name,emp_sal,emp_dept,emp_join_date,emp_birth_date,emp_type,emp_cont_incentives,emp_cont_period,emp_cont_contractor) values(?,?,?,?,?,?,?,?,?,?)";
			  ContractEmployee ce=(ContractEmployee)emp;
			  int empNo=ce.getEmpNo();
			  String empName=ce.getEmpName();
			  float empSal=ce.getEmpSal();
			  String empDept=ce.getDepartment();
			  LocalDate empJoinDate=ce.getDateOfJoining();
			  LocalDate empBirthDate=ce.getDateOfBirth();
			  empType ="CONTRACT";
			  float empIncentives=ce.getIncentives();
			  int empContractPeriod=ce.getContractPeriod();
			  String empContractor=ce.getContractor();


			 PreparedStatement pstmt =conn.prepareStatement(sqlQuery);
			 pstmt.setInt(1,empNo);
			 pstmt.setString(2,empName);
			 pstmt.setFloat(3,empSal);
			 pstmt.setString(4,empDept);
			 pstmt.setDate(5,java.sql.Date.valueOf(empJoinDate));
			 pstmt.setDate(6,java.sql.Date.valueOf(empBirthDate));
			 pstmt.setString(7,empType);
			 pstmt.setFloat(8,empIncentives);
			 pstmt.setInt(9,empContractPeriod);
			 pstmt.setString(10,empContractor);
			 

			 pstmt.executeUpdate();
		}

	
	}

	@Override
	public Employee getById(Integer empNo) throws Exception {
		// TODO Auto-generated method stub
		Employee emp =null;
		String sqlQuery="select *from employee_master where emp_no=?";
		Connection conn=DBUtils.getConnection();
		PreparedStatement pstmt =conn.prepareStatement(sqlQuery);
		pstmt.setInt(1, empNo);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			String empName=rs.getString(2);
			float empSal=rs.getFloat(3);
			String empDept=rs.getString(4);
			LocalDate empJoinDate=rs.getDate(5).toLocalDate();
			LocalDate empBirthDate =rs.getDate(6).toLocalDate();
			String empType=rs.getString(7);
			if(empType.equals("PERMANENT")) {
				float empDa=rs.getFloat(8);
				float empHra=rs.getFloat(9);
				emp= new PermanentEmployee(empNo,empName,empSal,empDept,empJoinDate,empBirthDate,empDa,empHra);
			}
			else if(empType.equals("CONTRACT")) {
				float empIncentives =rs.getFloat(10);
				int empContractPeriod=rs.getInt(11);
				String empContractor=rs.getString(12);
			 emp= new ContractEmployee(empNo,empName,empSal,empDept,empJoinDate,empJoinDate, empContractPeriod, empContractor, empIncentives);
			 
			}
			
			
		}
		return emp;
		
		
		
	}
	@Override
	public boolean  updateById(Integer key, String fieldName, String val) throws Exception {
		// TODO Auto-generated method stub
		boolean Success=false;
		String empType=null;
		Connection conn=DBUtils.getConnection();
		String sqlQuery="select emp_type from employee_master where  emp_no=?";
		PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
		pstmt.setInt(1, key);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			Success=true;
			empType=rs.getString(1);
		}
		
		rs.close();
		pstmt.close();
		
		if(Success) {
			if(fieldName.equals("SALARY")) {
				float newSal=Float.parseFloat(val);
				if(empType.equals("PERMANENT")) {
					float newDa=newSal *10.0f/100.0f;
					float newHra=newSal*7.5f/100f;
					pstmt=conn.prepareStatement("update employee_master set emp_sal=?,emp_perm_da=?,emp_perm_hra=? where emp_no=?");
					pstmt.setFloat(1, newSal);
					pstmt.setFloat(2, newDa);
					pstmt.setFloat(3, newHra);
					pstmt.setFloat(4,key);
					pstmt.executeUpdate();
					
				}
				else {
					float newIncentives=newSal *11.75f/100.0f;
					pstmt=conn.prepareStatement("update employee_master set emp_sal=?,emp_cont_incentives=? where emp_no=?");
					pstmt.setFloat(1, newSal);
					pstmt.setFloat(2, newIncentives);
					pstmt.setFloat(3, key);
					pstmt.executeUpdate();
					
				}
				
			}
			else if(fieldName.equals("DEPARTMENT")) {
				pstmt=conn.prepareStatement("update employee_master set emp_dept=? where emp_no=?");
				pstmt.setString(1, val);
				pstmt.setInt(2, key);
				pstmt.executeUpdate();
				
				
			}
		}
		pstmt.close();
		return Success;
		
		}
	
	
	
public static void main(String as[])throws Exception {
	IDao<Employee,Integer> dao=new EmployeeDAO();
	Employee emp=dao.getById(111);
	System.out.println(emp.getClass().getName());
	


}
}


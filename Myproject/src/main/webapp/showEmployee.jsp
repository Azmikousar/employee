


<%@page import="hr.ContractEmployee" %>
<%@page import="hr.PermanentEmployee" %>
<%@page import="hr.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
h2{
color:MidnightBlue;
text-align:center;
}
a{
color:hoptick;
text-decoration:italic,underline;
text-align:center;
font-size:20px;


}
table,th,td{
border:1px solid black;
border-collapse:collapse;
border-color:#96d4d4;
padding:15px;
margin:80px;
}

tr:nth-child(even){
background-color:#D6EEEE;

}

</style>
<body bgcolor="">
<h2><u><i>Showing Employee Details:</i></u></h2>
<table border='1' style="width:50%" >
<tr>
<th>Name:</th>
<th>GrossSalary Rs.: </th>
<th>Department :</th>
<th>Joining Date :</th>
<th>Birth Date :</th>
</tr>

<tr>
<td>${requestScope.foundEmployee.empName}</td>
<td>${requestScope.foundEmployee.processSalary() }</td>
<td>${requestScope.foundEmployee.department }</td>
<td>${requestScope.foundEmployee.dateOfJoining }</td>
<td>${requestScope.foundEmployee.dateOfBirth }</td>
</tr>
</table>
<%
Employee emp=(Employee)request.getAttribute("foundEmployee");
if(emp instanceof PermanentEmployee){
	out.println("<table border='1'><tr><th>Employment Type:</th></tr>  <tr><td>Permanent</td></tr></table>");
	
	
}

else if(emp instanceof ContractEmployee){
	ContractEmployee ce =(ContractEmployee)emp;
	out.println("<table border='1' border-spacing:30px;>");
	out.println("<tr>");
	out.println("<th>");
	out.println("Employment Type:");
	out.println("</th>");
	out.println("<th>");
	out.println("Contract Period:");
	out.println("</th>");
	out.println("<th>");
	out.println("Contractor:");
	out.println("</th>");
	out.println("</tr>");
	
	out.println("<tr>");
	
	out.println("<td>");
	out.println("Contract");
	out.println("</td>");
	
	
	
	out.println("<td>");
	out.println( + ce.getContractPeriod()+"Months" );
	out.println("</td>");
	
	out.println("<td>");
	out.println( ce.getContractor() +" ");
	out.println("</td>");
	
	out.println("</tr>");
	out.println("</table>");
	
	}
%>

<a href="showMenu.jsp">Main Page</a>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
h1{
text-align:center;
top:55%;
color:dark grey;
font:italic;
}

body
 {
 font-family: "Lato", sans-serif;
background-image:url('last.png');
 background-attachment:fixed;
  background-size:cover;

 align-items:center;
 }
 
 
 img {
  
 
  padding: 300px;
  width: 150px;
  
}

.sidebar {
  height: 100%;
  width: 160px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #728FCE;
  overflow-x: hidden;
  padding-top: 16px;
}
.sidebar a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 20px;
  color: #eee;
  display: block;
}

.sidebar a:hover {
  color: #000000;
}

@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
h1{

color:MidnightBlue;

}



</style>
<body >
<h1><u><i>Welcome to Employee Management System</i></u></h1>


<div class="sidebar">
  <a href="#">EMPLOYEE DETAILS</a>
  <a href="addPermanentEmployee.jsp"><i class="fa fa-fw fa-home"></i>Create Permanent Employee </a>
  <a href="addContractEmployee.jsp"><i class="fa fa-fw fa-wrench"></i> Create Contract Employee</a>
  <a href="searchEmployee.jsp"><i class="fa fa-fw fa-user"></i> Search Employee</a>
  <a href="updateSalary.jsp"><i class="fa fa-fw fa-envelope"></i>Update Salary</a>
  <a href="updateDept.jsp"><i class="fa-fa-fw fa-envelope"></i>Update Department</a>
  
  
</div>



<form action="logout" method="post">
    <input type="submit" value="log out">
</form>

</body>
</html>
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
text-align:center;



}
<style type="text/css">
.form-style-3{
	max-width: 10px;
	font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
	align-items:center;
}
.form-style-3 label{
	display:block;
	margin-bottom: 10px;
}
.form-style-3 label > span{
	float: left;
	width: 100px;
	color: #000000;
	font-weight: bold;
	font-size: 13px;
	
	
}
.form-style-3 fieldset{
    
	border-radius: 10px;
	-webkit-border-radius: 10px;
	-moz-border-radius: 10px;
	margin: 0px 0px 10px 0px;
	border: 1px solid #5F9EA0;
	padding: 20px;
	background: #F8F8FF;
	box-shadow: inset 0px 0px 15px #5F9EA0;
	-moz-box-shadow: inset 0px 0px 10px #5F9EA0;
	-webkit-box-shadow: inset 0px 0px 10px #5F9EA0;
}
.form-style-3 fieldset legend{
	color: #000000;
	border-top: 1px solid #5F9EA0;
	border-left: 1px solid #5F9EA0;
	border-right: 1px solid #5F9EA0;
	border-radius: 5px 5px 0px 0px;
	-webkit-border-radius: 5px 5px 0px 0px;
	-moz-border-radius: 5px 5px 0px 0px;
	background: #E0FFFF;
	padding: 0px 8px 3px 8px;
	box-shadow: -0px -1px 2px #5F9EA0;
	-moz-box-shadow:-0px -1px 2px #5F9EA0;
	-webkit-box-shadow:-0px -1px 2px #5F9EA0;
	font-weight: normal;
	font-size: 12px;
}
.form-style-3 textarea{
	width:250px;
	height:100px;
}
.form-style-3 input[type=text],
.form-style-3 input[type=date],
.form-style-3 input[type=datetime],
.form-style-3 input[type=number],
.form-style-3 input[type=search],
.form-style-3 input[type=time],
.form-style-3 textarea{
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border: 1px solid #000000;
	outline: none;
	color: #F072A9;
	padding: 5px 8px 5px 8px;
	box-shadow: inset 1px 1px 4px #eee;
	-moz-box-shadow: inset 1px 1px 4px #eee;
	-webkit-box-shadow: inset 1px 1px 4px #eee;
		qq2qqa	border-radius: 3px;
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;	
	font-weight: bold;
}
.required{
	color:red;
	font-weight:normal;
}
h2{
color:MidnightBlue;
}


a{
color:hoptick;
text-decoration:italic,underline;
text-align:center;
font-size:20px;


}
</style>


<body bgcolor="">
<h2><u><i>Contract   Employee  Creation</i></u></h2>


<div class="form-style-3">
<form action="addContractEmp" method="post">
<fieldset><legend>Employee Details</legend>
<label for="field1"><span>Employee No: <span class="required">*</span></span><input type="text" class="input-field" name="empNo" value="" /></label>
<label for="field2"><span>Name: <span class="required">*</span></span><input type="text" class="input-field" name="empName" value="" /></label>
<label for="field3"><span>Basic Salary: <span class="required">*</span></span><input type="text" class="input-field" name="empSal" value="" /></label>
<label for="field3"><span>Department: <span class="required">*</span></span><input type="text" class="input-field" name="empDept" value="" /></label>
<label for="field3"><span>Date of Joining: <span class="required">*</span></span><input type="text" class="input-field" name="empJoinDate" value="" /></label>
<label for="field3"><span>Date of Birth: <span class="required">*</span></span><input type="text" class="input-field" name="empBirthDate" value="" /></label>
<label for="field3"><span>Contract Period: <span class="required">*</span></span><input type="text" class="input-field" name="contractPeriod" value="" /></label>
<label for="field3"><span>Contractor: <span class="required">*</span></span><input type="text" class="input-field" name="contractor" value="" /></label>


<input type="submit" name="Submit"/>
</fieldset>

</form>
</div>


<a href="showMenu.jsp">Back</a>
</body>
</html>
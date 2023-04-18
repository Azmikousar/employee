<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
  
  background-image:url('login.jpg');
  background-attachment:fixed;
  background-size:cover;
  display: flex;
  justify-content:center;
  height: 100vh;
  
  
}

.form {
  background-color:#728FCE;
  border-radius: 100px;
  box-sizing: border-box;
  height: 500px;
  padding: 30px;
  width: 320px;
  align-items:right;
  margin:0;
  
}

.title {
  color: #eee;
  font-family: sans-serif;
  font-size: 36px;
  font-weight: 600;
  margin-top: 30px;
}

.subtitle {
  color: #eee;
  font-family: sans-serif;
  font-size: 16px;
  font-weight: 600;
  margin-top: 10px;
}

.input-container {
  height: 50px;
  position: relative;
  width: 100%;
}

.ic1 {
  margin-top: 40px;
}

.ic2 {
  margin-top: 30px;
}

.input {
  background-color: #303245;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  font-size: 18px;
  height: 100%;
  outline: 0;
  padding: 4px 20px 0;
  width: 100%;
}





.submit {
  background-color: #000000;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 18px;
  height: 50px;
  margin-top: 38px;
  // outline: 0;
  text-align: center;
  width: 100%;
}

.submit:active {
  background-color: #06b;
}

h1{
font-weight:500;
text-decoration:underline;
text-align:center;
top:100%;
color:dark grey;
font:italic;

}


</style>
<body>
<h1><center>Welcome Admin<br> Please Login To Continue</center></h1>


<form action="login" method="post">
    <div class="form">
      <div class="title">Welcome</div>
      <div class="subtitle">Let's create your account!</div>
      <div class="input-container ic1">
        <input class="input" type="text" name="username" placeholder=" " />
       
      <div class="input-container ic2">
        <input  class="input" type="password" name="password" placeholder=" " />
        
      
      <button type="submit" class="submit">Login</button>
    </div>
    </form>
</body>
</html>
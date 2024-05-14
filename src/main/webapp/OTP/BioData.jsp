<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill BioData</title>
<link rel="stylesheet" href="registration.css">
<style>
	.login{
		margin: 3%;
    	font-size: 1.5em;
    	font-weight: 550;
    	width: 25%;
    	height: 7vh;
    	border-radius: 10px;
    	transition: 0.2s ease-in;
    	cursor: pointer;
	}
	.lookup{
		position: absolute;
    	top: 10%;
	}
	
</style>
</head>
<body>
<div class="box">
	<form class="lookup" id="lookup" action="SaveBioData">
      <p class="heading">REGISTRATION</p>
      <input type="text" name="user_id" id="newuser" placeholder="User Name" required>
      <input type="text" name="Mobile" id="newEmail" placeholder="Mobile Number" required>
      <input type="text" name="Address" id="Address" placeholder="Address" required>
      <input type="text" name="Email_id" id="EmailId" placeholder="Email Id" readonly value="<%out.println(request.getAttribute("email")); %>">
      <input type="text" name="password1" id="newpassword" placeholder="Create Password" required>
      <input type="password" name="password" id="newpassword" placeholder="Confirm Password" required>
      <button type="submit" class="login" onclick="register()">Register</button>
    </form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="login.css">
<title>Login Page</title>
<style>
.forget{
	color:white;
	font-size: 1vw;
	margin-left: 50%;
	cursor:pointer;
}
.forget:hover{
	font-color: blue;
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="box">
		<form class="lookup" id="lookup">
			<p class="heading">LOGIN</p>
			<input type="text" name="userid" id="userId" placeholder="User Name" required>
			<input type="text" name="passwordid" id="password" placeholder="Password" required>
			<p class="forget"><a href="http://localhost:8080/Whole_Login/forget/ForgetPassword.jsp">Forget Password</a></p>
			<button type="submit" class="login" onclick="check()">Login</button>
			<p class="bottom">
				<a href="http://localhost:8080/Whole_Login/OTP/registration.jsp">Create account</a>
			</p>
		</form>
	</div>
	<script type="text/javascript">
		function check() {
			var user = document.getElementById("userId");
			var pass = document.getElementById("password");
			var form = document.getElementById("lookup");
			string1 = user.value;
			string2 = user.value;
			if (string1 != "" || string2 != "") {
				form.action = "Login";
			}
			/*else if(string1 == ""){
				alert("Enter the User Id");
			}
			else if(string2 == ""){
				alert("Enter the Password");
			}*/
		}
	</script>
</body>
</html>

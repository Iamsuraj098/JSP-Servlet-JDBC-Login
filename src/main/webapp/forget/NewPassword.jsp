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
	color: blue;
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="box">
		<form class="lookup" id="lookup">
			<p class="heading">Create Password</p>
			<input type="text" name="Password" id="Password" placeholder="Password" required>
			<input type="password" name="ConfirmPassword" id="Confirm" placeholder="Confirm Password" required>
			<button type="submit" class="login" onclick="check()">Login</button>
			<input style="opacity:0; z-index:-9;" type="text" name="email1" id="email" value="<%String email = request.getAttribute("email").toString(); out.println(email); %>">
		 </form>
	</div>
	<script type="text/javascript">
		function check() {
			var pass = document.getElementById("Password");
			var confirm = document.getElementById("Confirm");
			var form = document.getElementById("lookup");
			string1 = pass.value;
			string2 = confirm.value;
			if (string1 != string2) alert("Both Password Not matched");
			else form.action = "SetPassword";
		}
	</script>
</body>
</html>

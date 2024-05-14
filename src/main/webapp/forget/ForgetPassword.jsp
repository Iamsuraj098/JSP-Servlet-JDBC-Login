<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="login.css">
<title>Forget Password</title>
</head>
<body>
	<div class="box">
		<form class="lookup" id="lookup">
			<p class="heading">Forget Password</p>
			<input type="text" name="emailid" id="emailid" placeholder="Email Id" required>
			<button type="submit" class="login" onclick="check()">Next</button>
		</form>
	</div>
	<script type="text/javascript">
		var form = document.getElementById("lookup");
		function check() {
			email = document.getElementById("emailid").value;
			if(email != ""){
				if(email.includes("@gmail.com")){
					form.action = "ForgetPassword";
				}
				else{
					alert("Enter correct Email Id");
				}	
			}
		}
	</script>
</body>
</html>

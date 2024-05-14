<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<div class="box">
        <form class="lookup" id="lookup">
			<p class="heading">REGISTRATION</p>
			<input type="text" name="Email_Id" id="Email_Id" placeholder="Email Id" required>
            <button type="submit" class="login" onclick="check()">Next</button>
		</form>
    </div>
    <script type="text/javascript">
    	var email = document.getElementById("Email_Id");
    	var form = document.getElementById("lookup");
		function check(){
			var string1 = email.value;
			if(string1 != ""){
				if(string1.includes("@gmail.com")){
					form.action = "OTP_Page"
				}
				else{
					alert("Enter the correct email id");
				}
			}
		}
    </script>
</body>
</html>
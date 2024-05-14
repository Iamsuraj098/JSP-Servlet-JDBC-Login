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
			<input type="text" name="otp" id="otp" placeholder="Enter OTP" required>
			<input style="opacity:0; z-index:-9;" type="text" name="email" id="email" value="<%String email = request.getAttribute("email").toString(); out.println(email); %>">
            <button type="submit" class="login" onclick="check()">Next</button>
		</form>
    </div>
    <script type="text/javascript">
    	var otp = document.getElementById("otp");
    	var form = document.getElementById("lookup");
		function check(){
			var string1 = otp.value;
			if(string1 != ""){
				form.action = "ForgetOTP"
			}
		}
    </script>
</body>
</html>
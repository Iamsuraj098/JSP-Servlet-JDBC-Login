<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OTP Verification</title>
<link rel="stylesheet" href="registration.css">
<style>
	.send{
		opacity:0;
		position: absolute;
		top:80%;
		left:80%;
		width: 12vw;
		border-radius: 10%;
		background-color: #959595;
    	mix-blend-mode: hard-light;
	}
	.send p{
		color: white;
		font-size: 2vw;
		text-align: center;
		margin: 10%;
	}
	.login{
		margin: 3%;
    	font-size: 1.5em;
    	font-weight: 550;
    	width: 25%;
    	height: 7vh;
    	border-radius: 10px;
    	/* height: 40%; */
    	transition: 0.2s ease-in;
    	cursor: pointer;
	}
</style>
</head>
<body>
	<div class="box">
		<form class="lookup" id="lookup" action="Verification">
        	<p class="heading">OTP VERIFICATION</p>
            <input type="text" name="otp" id="otp" placeholder="Enter OTP" required>

            <h5 id="match"><% String email = request.getAttribute("lable").toString(); out.println(email); %> </h5>
           
           	<button class="login" onclick="checkotp()">Enter</button>
           	<input style="opacity: 0; z-index: -10;" type="text" name="email" id="email" placeholder="Email Id" value="<%out.println(request.getAttribute("email"));%>">
        </form>
	</div>
	<div class="send">
		<p>OTP Sent!</p>
	</div>
	<script type="text/javascript">
		var otp_str = document.getElementById("otp");
		function checkotp(){
			var str = otp_str.value;
			if(str != ""){
				document.getElementById("lookup").action = "Verification";
			}
		}
	</script>
</body>
</html>
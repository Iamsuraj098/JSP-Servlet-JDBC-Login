<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="landing.css">
<title>Home Page</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Inter:wght@500&display=swap')
	;

@import
	url('https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap')
	;

* {
	margin: 0;
	padding: 0;
}

body {
	background: url(wall.jpg) no-repeat center center fixed;
	background-size: cover;
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 100%;
	height: 100%;
	overflow: hidden;
	font-family: 'Inter', sans-serif;
}

.box {
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 50%;
	height: 50%;
	overflow: hidden;
}

form{
	margin: 60%;
	width: 25%;
}

.logout {
	/*margin-top: 60%;*/
	padding: 2%;
	font-size: 1.5vw;
	font-weight: 550;
	width: 100%;
	border-radius: 10px;
	/*height: 40px;*/
	transition: 0.2s ease-in;
	cursor: pointer;
	background: #e2e2e2;
	mix-blend-mode: screen;
}

.logout a{
	text-decoration:none;
}

.circle {
	display: flex;
	align-items: center;
	justify-content: center;
	text-align: center;
	opacity: 1;
	z-index: 5;
	position: absolute;
	top: 20%;
	z-index: 10;
	width: 20%;
	height: 40%;
	border-radius: 100%;
	background: white;
	transition: 0.8s ease-in;
	font-size: 3vw;
	font-family: 'Dancing Script', cursive;
	font-weight: 500
}
</style>

</head>
<body>
	<div class="box">
		<div class="circle">
			<%
		out.println(request.getAttribute("lable1"));
		%>
		</div>
	<form>
		<button type="submit" class="logout"><a href="http://localhost:8080/Whole_Login/Home/index.jsp"><%out.println(request.getAttribute("lable2")); %></a></button>
	</form>
	</div>
</body>
</html>

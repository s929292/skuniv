<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="css/registration.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div class="testbox">
		<h1>Registration</h1>

		<form method="post" action = "registration">
			<label id="icon"></label> <input type="text" name="mname" id="name"
				placeholder="Name" required /> <label id="icon"></label> <input
				type="text" name="mid" id="name" placeholder="ID" required /> <label
				id="icon"></label> <input type="password" name="mpassword" id="name"
				placeholder="Password" required /> <label id="icon"></label> <input
				type="text" name="mbirth" id="name" placeholder="Birth (yy/mm/dd)"
				required />

			<div class="gender">
				<input type="radio" id="male" name="mgender" value="m" checked /> <label
					for="male" class="radio">Male</label> <input type="radio"
					id="female" name="mgender" value="f" /> <label for="female"
					class="radio">Female</label>
			</div>
			<label id="icon"></label> <input type="text" name="mphone" id="name"
				placeholder="Phone" required /> <label id="icon"></label> <input
				type="text" name="memail" id="name" placeholder="Email" required />
			<input type="submit" value="Register" id="register" name="register"/>
		</form>
	</div>
</body>
</html>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
* {
	margin: 0;
	padding: 0;
}

#wrap {
	width: 960px;
	margin: 0 auto;
}

#box1 {
	width: 30%;
	height: 700px;
	background: #fa9ecd;
	float: left;
}

#box2 {
	width: 40%;
	height: 700px;
	background: #52be7f;
	float: left;
}

#box3 {
	width: 30%;
	height: 700px;
	background: #a5e064;
	float: left;
}

/* 화면 너비 0픽셀 ~ 960픽셀 */
@media screen and (max-width: 960px) {
	#wrap {
		width: 95%;
	}
}
/* 화면 너비 0픽셀 ~ 768픽셀 */
@media screen and (max-width: 768px) {
	#wrap {
		width: 100%;
	}
	#box2 {
		float: none;
		width: auto;
	}
	#box3 {
		float: none;
		width: auto;
	}
}
/* 화면 너비 0픽셀 ~ 480픽셀 */
@media screen and (max-width: 480px) {
	#box1 {
		float: none;
		width: auto;
	}
}
</style>


</head>
<body>


	<form action="login" method="post">
		아이디 : <input type="text" name=id /> <br> 비밀번호 : <input
			type="password" name="password" /> <br> <input type="submit"
			value="로그인" /> <input type="reset" value="취소" />
	</form>
	<button onclick="location.href='registrationform'">회원가입</button>
	<br>
	<br>
	<br>
	<br>
	<button onclick="location.href='usermain'">메인으로</button>

	<div id="wrap">
		<div id="box1" >
			<a href="bearsmain">베어스랜드!!</a>
		</div>
		<div id="box2">
			<a href="eaglesmain">이글스랜드~~</a>
		</div>
		<div id="box3">
			<a href="giantsmain">자이언츠랜드~!</a>
		</div>
	</div>




</body>
</html>



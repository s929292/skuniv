<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/creative.min.css" rel="stylesheet">
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

	<div class="menubar">
		<ul>
			<li><a href="#">이용정보</a>
				<ul>
					<li><a href="1use">이용 방법</a></li>
					<li><a href="1fee">이용 요금</a></li>
					<li><a href="1traffic">교통편</a></li>
					<li><a href="1food">먹거리</a></li>
				</ul></li>

			<li><a href="#" id="current">기구정보</a>
				<ul>
					<li><a href="1indoor">기구별 운행정보(실내)</a></li>
					<li><a href="1outdoor">기구별 운행정보(실외)</a></li>
				</ul></li>

			<li><a href="#">행사</a>
				<ul>
					<li><a href="1eventlist">행사 정보</a></li>
					<li><a href="1eventlist">할인 정보</a></li>
				</ul></li>
			<li><a href="#">게시판</a>
				<ul>
					<li><a href="1freetalklist">잡담</a></li>
					<li><a href="1reviewlist">이용후기</a></li>
					<li><a href="1qnalist">QnA</a></li>
					<li><a href="1complainlist">불만</a></li>
				</ul></li>
		</ul>
	</div>

	<ul>
		<a>실시간 운행정보</a>
		<li><a href="1waittime">대기시간</a></li>
		<li><a href="1recommendmain">추천코스</a></li>
	</ul>


</body>
</html>



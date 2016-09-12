<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.menubar {
	border: none;
	border: 0px;
	margin: 0px;
	padding: 0px;
	font: 67.5% "Lucida Sans Unicode", "Bitstream Vera Sans",
		"Trebuchet Unicode MS", "Lucida Grande", Verdana, Helvetica,
		sans-serif;
	font-size: 14px;
	font-weight: bold;
}

.menubar ul {
	background: rgb(109, 109, 109);
	height: 50px;
	list-style: none;
	margin: 0;
	padding: 0;
}

.menubar li {
	float: left;
	padding: 0px;
}

.menubar li a {
	background: rgb(109, 109, 109);
	color: #cccccc;
	display: block;
	font-weight: normal;
	line-height: 50px;
	margin: 0px;
	padding: 0px 25px;
	text-align: center;
	text-decoration: none;
}

.menubar li a:hover, .menubar ul li:hover a {
	background: rgb(71, 71, 71);
	color: #FFFFFF;
	text-decoration: none;
}

.menubar li ul {
	background: rgb(109, 109, 109);
	display: none; /* 평상시에는 드랍메뉴가 안보이게 하기 */
	height: auto;
	padding: 0px;
	margin: 0px;
	border: 0px;
	position: absolute;
	width: 200px;
	z-index: 200;
	/*top:1em;
/*left:0;*/
}

.menubar li:hover ul {
	display: block; /* 마우스 커서 올리면 드랍메뉴 보이게 하기 */
}

.menubar li li {
	background: rgb(109, 109, 109);
	display: block;
	float: none;
	margin: 0px;
	padding: 0px;
	width: 200px;
}

.menubar li:hover li a {
	background: none;
}

.menubar li ul a {
	display: block;
	height: 50px;
	font-size: 12px;
	font-style: normal;
	margin: 0px;
	padding: 0px 10px 0px 15px;
	text-align: left;
}

.menubar li ul a:hover, .menubar li ul li:hover a {
	background: rgb(71, 71, 71);
	border: 0px;
	color: #ffffff;
	text-decoration: none;
}

.menubar p {
	clear: left;
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



<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
글작성하는 폼이 나오고 완료 누르면 다시 리스트로 보여줌
	<form action="1freetalkwrite" method="post">
<%-- 		<input type="hidden" name="no" value = <%=request.getParameter("no")%>></input><br> --%>
<%-- 		아이디 : <input type="text" name="id" value =<%=request.getParameter("id") %>></input><br>  --%>
<!-- 		이름 : <input type=text name="name" ></input><br> -->
<!-- 		비밀번호 : <input type="text" name="password" ></input><br>  -->
<!-- 		내용 : <input type="text" name="content" /> <br>   -->
		<input type = "submit" value ="작성하기"></input>
	</form>
</body>
</html>
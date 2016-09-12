<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%
	String[] checks = request.getParameterValues("checkbox");

	int checklen = 0;
	checklen = checks.length;
%>

<script language="JavaScript">
	//var checks=request.getParameterValues("checkbox"); 
	
	function layer1(num,i) {
		var point = [];
		point[0] = mark0.style;
		point[1] = mark1.style;
		point[2] = mark2.style;
		point[3] = mark3.style;
		point[4] = mark4.style;
		if(num == 1) {
				point[i].display='block';
				point[i].top = '260px';
				point[i].left = '290px';
			}
			else if (num == 2) {
				point[i].display='block';
				point[i].top = '100px';
				point[i].left = '250px';
			} 
			else if (num == 3) {
				point[i].display='block';
				point[i].top = '350px';
				point[i].left = '700px';
			} 
			else if (num == 4) {
				point[i].display='block';
				point[i].top = '50px';
				point[i].left = '675px';
			}
			else if (num == 5) {
				point[i].display='block';
				point[i].top = '20px';
				point[i].left = '460px';
			}
			else if (num == 6) {
	            point[i].display='block';
	            point[i].top = '130px';
	            point[i].left = '680px';
	         } 
	         else if (num == 7) {
	            point[i].display='block';
	            point[i].top = '110px';
	            point[i].left = '730px';
	         } 
	         else if (num == 8) {
	            point[i].display='block';
	            point[i].top = '200px';
	            point[i].left = '45px';
	         }
	         else if (num == 9) {
	            point[i].display='block';
	            point[i].top = '120px';
	            point[i].left = '380px';
	         }
	         else if (num == 10) {
	            point[i].display='block';
	            point[i].top = '200px';
	            point[i].left = '200px';
	         } 
	         else if (num == 11) {
	            point[i].display='block';
	            point[i].top = '160px';
	            point[i].left = '550px';
	         } 
	         else if (num == 12) {
	            point[i].display='block';
	            point[i].top = '380px';
	            point[i].left = '505px';
	         }
	         else if (num == 13) {
	            point[i].display='block';
	            point[i].top = '420px';
	            point[i].left = '320px';
	         }
	         else if (num == 14) {
	            point[i].display='block';
	            point[i].top = '100px';
	            point[i].left = '110px';
	         } 
	         else if (num == 15) {
	            point[i].display='block';
	            point[i].top = '360px';
	            point[i].left = '425px';
	         } 
	         else if (num == 16) {
	            point[i].display='block';
	            point[i].top = '350px';
	            point[i].left = '120px';
	         }
	}
	function first() {
		//checks에는 기구넘버가들어감
		var chks=new Array();
		
	<%for (int i = 0; i < 5; i++) {%>
		chks[<%=i%>]='<%=checks[i]%>';
	<%}%>
	
	<%for (int i = 0; i < 5; i++) {%>
	layer1(chks[<%=i%>],<%=i%>);
	<%}%>
	}
</script>
</head>

<body onload="first()">
	<img src="img/1bears/1map.jpg" width="800" height="500">
	<div id="mark0" style="position: absolute; top: 0px; left: 0px;">
		<img src="img/point.png">
	</div>
	<div id="mark1" style="position: absolute; top: 0px; left: 0px;">
		<img src="img/point.png">
	</div>
	<div id="mark2" style="position: absolute; top: 0px; left: 0px;">
		<img src="img/point.png">
	</div>
	<div id="mark3" style="position: absolute; top: 0px; left: 0px;">
		<img src="img/point.png">
	</div>
	<div id="mark4" style="position: absolute; top: 0px; left: 0px;">
		<img src="img/point.png">
	</div>
	<br>
	<!-- 기다리는 시간 뽑아줌 -->
	<table border=1 cellpadding="5px">
		<tr  align="center"><td>이미지</td><c:forEach items="${anum}" var="anum"><td><img src="img/1bears/attraction/1_${anum }.jpg" width="200"></td></c:forEach></tr>
	<tr align="center"><td><strong>대기시간</strong></td><c:forEach items="${awaittime}" var="num"><td>
${num }분</td></c:forEach></tr>
	<tr align="center"><td><strong>기구이름</strong></td><c:forEach items="${aname}" var="name"><td>
${name }</td> <br></c:forEach></tr>

</table>
<!-- 기구 이름 뽑아줌 -->

	
</body>
</html>
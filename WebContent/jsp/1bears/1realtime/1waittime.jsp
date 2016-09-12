<%@page import="java.util.List"%>
<%@page import="kr.capa.acip.dao.attraction.AttractionDAO"%>
<%@page import="kr.capa.acip.dao.attraction.AttractionDAOImpl"%>
<%@page import="kr.capa.acip.vo.attraction.AttractionVO"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>베어스랜드 BEARS LAND</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
   rel="stylesheet" type="text/css">
<link
   href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
   rel='stylesheet' type='text/css'>
<link
   href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
   rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

<!-- Theme CSS -->
<link href="css/waittime.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

   <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">

      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed"
            data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span> Menu <i
               class="fa fa-bars"></i>
         </button>
         <a class="navbar-brand page-scroll" href="#page-top">acip 로고
            넣어야함1</a>
         <!--                수정한곳  -->
         <a class="navbar-brand page-scroll" href="#page-top">랜드1 로고 넣어야함
         </a>

      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="menubar">
         <ul>
            <li><a href="#">이용정보</a>
               <ul>
                  <li><a href="1bears/mainsoon">이용 방법</a></li>
                  <li><a href="1fee">이용 요금</a></li>
                  <li><a href="1traffic">교통편</a></li>
                  <li><a href="1food">먹거리</a></li>
               </ul></li>

            <li><a href="#" id="#">기구정보</a>
               <ul>
                  <li><a href="1indoor">실내 기구</a></li>
                  <li><a href="1outdoor">실외 기구</a></li>
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
            <div style="margin-right: 50px; float: right">
               <ul class="log">
                  <form action="login" method="post">
                     <li><input type="text" placeholder="ID" class="focus"
                        name="id" size="8"></li>
                     <li><input type="password" placeholder="PASSWORD"
                        name="password" class="focus" size="8"></li>
                     <li><input style="margin-left: 30px" type="submit"
                        value="login"></li>
                  </form>
                  <li><button onClick="joinPopupOpen()"
                        style="margin-left: 30px">join</button></li>
               </ul>
            </div>
         </ul>



      </div>
      <!-- /.container-fluid -->
   </nav>

   <header background-image=url(../img/1bears/2pic.jpg)>
      <div class="header-content">
         <div class="header-content-inner">
            <h1 id="homeHeading">기구별 대기시간</h1>
            <hr>

         </div>
      </div>
      <div class="container">
         <div class="row">
            <div class="col-lg-3 col-md-6 text-center">
               <div class="service-box">
                  <i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
                  <c:forEach items="${waittime }" var="time">
                     <h3>${time.aname }</h3>
                     <p class="text-muted">${time.awaittime }</p>
                  </c:forEach>
               </div>
            </div>
         </div>
      </div>
   </header>

   <!-- jQuery -->
   <script src="vendor/jquery/jquery.min.js"></script>

   <!-- Bootstrap Core JavaScript -->
   <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

   <!-- Plugin JavaScript -->
   <script
      src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
   <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
   <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

   <!-- Theme JavaScript -->
   <script src="js/creative.min.js"></script>

</body>

</html>
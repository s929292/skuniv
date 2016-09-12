<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="description" content="그누보드 영카트 웹표준 홈페이지제작" />
<meta name="keywords" content="홈페이지,homepage,홈페이지제작,쇼핑몰제작,그누보드5,그누보드4,영카트5,영카트4,웹표준,웹접근성" /> 
<meta http-equiv="imagetoolbar" content="no">
<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">

<title>자유게시판 1 페이지 | 지아이티 (GIT) - 테스트 사이트</title>
<link rel="stylesheet" href="http://test.g-it.kr/theme/git_001/css/default.css">
<link rel="stylesheet" href="http://test.g-it.kr/theme/git_001/skin/connect/basic/style.css">
<link rel="stylesheet" href="http://test.g-it.kr/theme/git_001/skin/outlogin/basic/style.css">
<link rel="stylesheet" href="http://test.g-it.kr/skin/board/basic/style.css">
<link rel="stylesheet" href="http://test.g-it.kr/skin/visit/basic2/style.css">
<!-- link href="http://test.g-it.kr/add/font-awesome/css/font-awesome.css" rel="stylesheet" -->
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<!--[if lte IE 8]>
<script src="http://test.g-it.kr/js/html5.js"></script>
<![endif]-->
<script>
// 자바스크립트에서 사용하는 전역변수 선언
var g5_url       = "http://test.g-it.kr";
var g5_bbs_url   = "http://test.g-it.kr/bbs";
var g5_is_member = "";
var g5_is_admin  = "";
var g5_is_mobile = "";
var g5_bo_table  = "freeboard";
var g5_sca       = "";
var g5_editor    = "smarteditor2";
var g5_cookie_domain = "";
</script>
<script src="http://test.g-it.kr/js/jquery-1.8.3.min.js"></script>
<!-- script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script -->
<script src="http://test.g-it.kr/js/jquery.menu.js"></script>
<script src="http://test.g-it.kr/js/common.js"></script>
<script src="http://test.g-it.kr/js/wrest.js"></script>

<!-- fancbox -->
<!-- examples: <a class="fancybox" href="http://test.co.kr/test.jpg" title="test">test</a> -->
<script src="http://test.g-it.kr/add/jquery/fancybox-2.1.5/jquery.fancybox.pack.js?v=2.1.5"></script> 
<link rel="stylesheet" type="text/css" href="http://test.g-it.kr/add/jquery/fancybox-2.1.5/jquery.fancybox.css?v=2.1.5" media="screen" />
<script>
	$(document).ready(function() {
		$(".fancybox").fancybox({
		   	openEffect	: 'elastic',   /* 시작,종료효과: none, elastic */
    		closeEffect	: 'none',
			helpers: {
				title : {
					type : 'float'    /* title 글자효과: float, elastic, inside, outside, over */
				}
			}
		});
	});
</script>
<!-- fancbox end -->

<!-- totop -->
<script src="http://test.g-it.kr/add/jquery/jquery.totop/jquery.ui.totop.js"></script> 
<script>
	$(document).ready(function() {
		/*
		var defaults = {
  			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
 		};
		*/
		$().UItoTop({ easingType: 'easeOutQuart' });
	});
</script>
<!-- totop end -->


</head>
<body>

<!-- 상단 시작 { -->
<div id="hd">
    <h1 id="hd_h1">자유게시판 1 페이지</h1>

    <div id="skip_to_container"><a href="#container">본문 바로가기</a></div>

    
    <div id="hd_wrapper">

        <div id="logo">
            <!-- a href="http://test.g-it.kr"><img src="http://test.g-it.kr/img/logo.jpg" alt="지아이티 (GIT) - 테스트 사이트"></a -->
			<a href="http://test.g-it.kr"><img src="http://test.g-it.kr/theme/git_001/img/logo-test.png" alt="지아이티 (GIT) - 테스트 사이트"></a>
        </div>

        <fieldset id="hd_sch">
            <legend>사이트 내 전체검색</legend>
            <form name="fsearchbox" method="get" action="http://test.g-it.kr/bbs/search.php" onsubmit="return fsearchbox_submit(this);">
            <input type="hidden" name="sfl" value="wr_subject||wr_content">
            <input type="hidden" name="sop" value="and">
            <label for="sch_stx" class="sound_only">검색어<strong class="sound_only"> 필수</strong></label>
            <input type="text" name="stx" id="sch_stx" maxlength="20">
            <!-- input type="submit" id="sch_submit" value="검색" -->
			<input type="image" id="sch_submit" src="http://test.g-it.kr/img/btn_search.jpg" width="24" height="24" alt="검색">
            </form>

            <script>
            function fsearchbox_submit(f)
            {
                if (f.stx.value.length < 2) {
                    alert("검색어는 두글자 이상 입력하십시오.");
                    f.stx.select();
                    f.stx.focus();
                    return false;
                }

                // 검색에 많은 부하가 걸리는 경우 이 주석을 제거하세요.
                var cnt = 0;
                for (var i=0; i<f.stx.value.length; i++) {
                    if (f.stx.value.charAt(i) == ' ')
                        cnt++;
                }

                if (cnt > 1) {
                    alert("빠른 검색을 위하여 검색어에 공백은 한개만 입력할 수 있습니다.");
                    f.stx.select();
                    f.stx.focus();
                    return false;
                }

                return true;
            }
            </script>
        </fieldset>

        <!-- div id="text_size" -->
            <!-- font_resize('엘리먼트id', '제거할 class', '추가할 class'); -->
            <!-- button id="size_down" onclick="font_resize('container', 'ts_up ts_up2', '');"><img src="http://test.g-it.kr/img/ts01.gif" alt="기본"></button>
            <button id="size_def" onclick="font_resize('container', 'ts_up ts_up2', 'ts_up');"><img src="http://test.g-it.kr/img/ts02.gif" alt="크게"></button>
            <button id="size_up" onclick="font_resize('container', 'ts_up ts_up2', 'ts_up2');"><img src="http://test.g-it.kr/img/ts03.gif" alt="더크게"></button>
        </div -->

        <ul id="tnb">
                        <li><a href="http://test.g-it.kr/bbs/register.php">회원가입</a></li>
            <li><a href="http://test.g-it.kr/bbs/login.php"><b>로그인</b></a></li>
			<!-- li><a class="fancybox fancybox.ajax" href="http://test.g-it.kr/bbs/login.php"><b>로그인</b></a></li -->
                        <li><a href="http://test.g-it.kr/bbs/faq.php">FAQ</a></li>
            <li><a href="http://test.g-it.kr/bbs/qalist.php">1:1문의</a></li>
            <li><a href="http://test.g-it.kr/bbs/current_connect.php">접속자 
1</a></li>
            <li><a href="http://test.g-it.kr/bbs/new.php">새글</a></li>
        </ul>

			
    </div>

    <hr>


<!-- 메인메뉴 선택 jq-panel -->
<script type="text/javascript" src="http://test.g-it.kr/add/jquery/jq-panel/js/jquery.slidePanel.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#panel1').slidePanel({
		triggerName: '#trigger1',
		position: 'fixed',
		triggerTopPos: '10px',  /* 닫힘 위치 */
		panelTopPos: '10px',    /* 펼침 위치 */
	});
/*	
	$('#panel2').slidePanel({
		triggerName: '#trigger2',
		position: 'fixed',
		triggerTopPos: '200px',
		panelTopPos: '210px',
	});
*/
});
</script>
<!--
<a href="#" id="trigger1" class="trigger left">panel</a>
<div id="panel1" class="panel left">
	<p>Here is some static content for Panel 1.</p>
</div>
-->

<!-- jq-panel css -->
<style type="text/css">
a.trigger{
	position: absolute;
	background:#88bbd4 url(/add/jquery/jq-panel/images/plus.png) 6% 55% no-repeat;
	text-decoration: none;
	font-size: 16px;
	letter-spacing:-1px;
	font-family: verdana, helvetica, arial, sans-serif;
	color:#fff;
	padding:4px 12px 6px 24px;
	font-weight: bold;
	z-index:999992;
}
a.trigger.left {
	left: 0;
	border-top-right-radius: 5px;
	-moz-border-radius-topright: 5px;
	-webkit-border-top-right-radius: 5px;
	-moz-border-radius-bottomright: 5px;
	-webkit-border-bottom-right-radius: 5px;
	border-bottom-right-radius: 5px;
}
a.trigger.right {
	right: 0;
	border-bottom-left-radius: 5px;
	border-top-left-radius: 5px;
	-moz-border-radius-bottomleft: 5px;
	-moz-border-radius-topleft: 5px;
	-webkit-border-bottom-left-radius: 5px;
	-webkit-border-top-left-radius: 5px;
}
a.trigger:hover {
	background-color:#59B;
}
a.active.trigger {
	background:#666 url(/add/jquery/jq-panel/images/minus.png) 6% 55% no-repeat;
}
.panel {
	color:#CCC;
	position: absolute;
	display: none;
	background: #000000;
	width: 150px;   /* 패널 폭 지정 */
	height: auto;
	z-index:999991;
}
.panel.left {
	left: 0;
	padding: 50px 20px 20px 20px; /* padding: 20px 30px 20px 100px; */
	border-top-right-radius: 15px;
	-moz-border-radius-topright: 15px;
	-webkit-border-top-right-radius: 15px;
	-moz-border-radius-bottomright: 15px;
	-webkit-border-bottom-right-radius: 15px;
	border-bottom-right-radius: 15px;
}
.panel.right {
	right: 0;
	padding: 50px 20px 20px 20px;  /* 	padding: 20px 100px 20px 30px; */
	border-bottom-left-radius: 15px;
	border-top-left-radius: 15px;
	-moz-border-radius-bottomleft: 15px;
	-moz-border-radius-topleft: 15px;
	-webkit-border-bottom-left-radius: 15px;
	-webkit-border-top-left-radius: 15px;
}

.panel p {font-size:11px;}
.panel ul {margin:0; padding:0;}
.panel li {list-style-type:none; line-height:25px; text-align:left;}
.panel li a{color:#fff;}
</style>


		<!-- 메인메뉴 선택 end -->


	<!-- 메인메뉴 불러오기 -->
	<style type="text/css">
@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
#gnb {font-family:'Nanum Gothic','Malgun Gothic','맑은 고딕',dotum,sans-serif;}

/* 메인메뉴 */
/* main01_basic1 - GIT수정(www.g-it.kr) */
#gnb {position:relative;margin:0;border-top:0px dotted #dde4e9;border-bottom:0px solid #dde4e9;background:#383a3f}
#gnb h2 {position:absolute;font-size:0;line-height:0;overflow:hidden}
#gnb_1dul {margin:0 auto !important;padding:0;width:980px;zoom:1}
#gnb_1dul:after {display:block;visibility:hidden;clear:both;content:""}
#gnb_1dul .active {background:#dd4868;}       /* 메뉴선택(active)시 배경색 */
#gnb_1dul .active {color:#fff !important;}    /* 메뉴선택(active)시 글자색 */
.gnb_1dli {z-index:10;position:relative;float:left;margin:0 0 0 -1px;border:1px solid #222;border-top:0;border-bottom:0} /* 메뉴경계선: border:1px */
.gnb_1da {display:inline-block;padding:0 5px;width:120px;height:45px;color:#f4f4f4 !important;font-weight:700; font-size:14px; line-height:3.1em;letter-spacing:1px;text-decoration:none;text-align:center}  /* 넓이,높이,line-height, 1차메뉴 색상, 폰트크기, 1차메뉴글자위치(line-height)  */
.gnb_1da:focus, .gnb_1da:hover {text-decoration:none}
/* .gnb_1dli_air .gnb_1da {background-color:#333;color:#fff} */
.gnb_1dli_on .gnb_1da {background-color:#fff;color:#000 !important} /* 1차메뉴 오버시 배경색, 글자색  */

.gnb_2dul {display:none;position:absolute;top:45px;width:180px}  /* top값: 2차메뉴시작위치, 메뉴높이와 동일하게 */
.gnb_2da {display:block;padding:10px 10px;text-align:left;text-decoration:none}  /* 2차메뉴 간격(padding) */
/* .gnb_1dli_air .gnb_2da {background-color:#333;color:#fff} */
.gnb_1dli_on .gnb_2da {background-color:#fff;color:#000}  /* 2차메뉴 배경색, 색상 */
.gnb_2da:focus, .gnb_2da:hover {background:#ddd;text-decoration:none}  /* 2차메뉴 마우스 오버시 배경색 */
.gnb_1dli_over .gnb_2dul {display:block;left:0;background:#fff;left:-1px;border:1px solid #c3c7c5;border-top:0;} /* 2차메뉴 전체 테두리 */
.gnb_1dli_over2 .gnb_2dul {display:block;right:0;background:#fff;left:-1px;border:1px solid #c3c7c5;border-top:0;}

#gnb_empty {padding:10px 0;width:100%;text-align:center;line-height:2em}
#gnb_empty a {text-decoration:underline}
</style>

	
    <nav id="gnb">
        <h2>메인메뉴</h2>
        <ul id="gnb_1dul">
            			<li class="gnb_1dli" style="z-index:999"> 
				<a href="/?me_code=10" target="_self" class="gnb_1da ">HOME</a> <!-- 메뉴선택 active -->
                            </li>
            			<li class="gnb_1dli" style="z-index:998"> 
				<a href="/bbs/board.php?bo_table=m11&me_code=20" target="_self" class="gnb_1da ">회사소개</a> <!-- 메뉴선택 active -->
                <ul class="gnb_2dul">
                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=m11&me_code=2010" target="_self" class="gnb_2da">인사말</a></li>
                                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=m12&me_code=2020" target="_self" class="gnb_2da">조직도</a></li>
                                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=map&me_code=2030" target="_self" class="gnb_2da">찾아오시는길</a></li>
                </ul>
            </li>
            			<li class="gnb_1dli" style="z-index:997"> 
				<a href="/bbs/board.php?bo_table=m21&me_code=30" target="_self" class="gnb_1da ">제품소개</a> <!-- 메뉴선택 active -->
                <ul class="gnb_2dul">
                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=m21&me_code=3010" target="_self" class="gnb_2da">제품소개1</a></li>
                                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=m22&me_code=3020" target="_self" class="gnb_2da">제품소개2</a></li>
                </ul>
            </li>
            			<li class="gnb_1dli" style="z-index:996"> 
				<a href="/bbs/board.php?bo_table=freeboard&me_code=40" target="_self" class="gnb_1da ">커뮤니티</a> <!-- 메뉴선택 active -->
                <ul class="gnb_2dul">
                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=freeboard&me_code=4010" target="_self" class="gnb_2da">자유게시판1</a></li>
                                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=freeboard2&me_code=4020" target="_self" class="gnb_2da">자유게시판2</a></li>
                </ul>
            </li>
            			<li class="gnb_1dli" style="z-index:995"> 
				<a href="/bbs/board.php?bo_table=gallery&me_code=50" target="_self" class="gnb_1da ">포토갤러리</a> <!-- 메뉴선택 active -->
                <ul class="gnb_2dul">
                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=gallery&me_code=5010" target="_self" class="gnb_2da">포토갤러리</a></li>
                </ul>
            </li>
            			<li class="gnb_1dli" style="z-index:994"> 
				<a href="/bbs/board.php?bo_table=notice&me_code=60" target="_self" class="gnb_1da ">고객센터</a> <!-- 메뉴선택 active -->
                <ul class="gnb_2dul">
                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=notice&me_code=6010" target="_self" class="gnb_2da">공지사항</a></li>
                                    <li class="gnb_2dli"><a href="/bbs/board.php?bo_table=faq&me_code=6020" target="_self" class="gnb_2da">자주하는질문</a></li>
                </ul>
            </li>
                    </ul>
    </nav>
</div> <!-- id="hd" end -->
<!-- } 상단 끝 -->

<hr>

<!-- 콘텐츠 시작 { -->
<div id="wrapper">
    <div id="aside">
		<div style="margin:5px 0 0 0; text-align:center;">
			<a href="http://www.g-it.kr" target="_blank"><img src="http://test.g-it.kr/theme/git_001/img/git-home.png" alt="GIT홈페이지 이동"></a>
		</div>
        
<!-- 로그인 전 아웃로그인 시작 { -->
<section id="ol_before" class="ol">
    <h2>회원로그인</h2>
    <form name="foutlogin" action="http://test.g-it.kr/bbs/login_check.php" onsubmit="return fhead_submit(this);" method="post" autocomplete="off">
    <fieldset>
        <input type="hidden" name="url" value="%2Fbbs%2Fboard.php%3Fbo_table%3Dfreeboard">
        <label for="ol_id" id="ol_idlabel">회원아이디<strong class="sound_only">필수</strong></label>
        <input type="text" id="ol_id" name="mb_id" required class="required" maxlength="20">
        <label for="ol_pw" id="ol_pwlabel">비밀번호<strong class="sound_only">필수</strong></label>
        <input type="password" name="mb_password" id="ol_pw" required class="required" maxlength="20">
        <input type="submit" id="ol_submit" value="로그인">
        <div id="ol_svc">
            <a href="http://test.g-it.kr/bbs/register.php"><b>회원가입</b></a>
            <a href="http://test.g-it.kr/bbs/password_lost.php" id="ol_password_lost">정보찾기</a>
        </div>
        <div id="ol_auto">
            <input type="checkbox" name="auto_login" value="1" id="auto_login">
            <label for="auto_login" id="auto_login_label">자동로그인</label>
        </div>
    </fieldset>
    </form>
</section>

<script>
$omi = $('#ol_id');
$omp = $('#ol_pw');
$omp.css('display','inline-block').css('width',104);
$omi_label = $('#ol_idlabel');
$omi_label.addClass('ol_idlabel');
$omp_label = $('#ol_pwlabel');
$omp_label.addClass('ol_pwlabel');

$(function() {
    $omi.focus(function() {
        $omi_label.css('visibility','hidden');
    });
    $omp.focus(function() {
        $omp_label.css('visibility','hidden');
    });
    $omi.blur(function() {
        $this = $(this);
        if($this.attr('id') == "ol_id" && $this.attr('value') == "") $omi_label.css('visibility','visible');
    });
    $omp.blur(function() {
        $this = $(this);
        if($this.attr('id') == "ol_pw" && $this.attr('value') == "") $omp_label.css('visibility','visible');
    });

    $("#auto_login").click(function(){
        if ($(this).is(":checked")) {
            if(!confirm("자동로그인을 사용하시면 다음부터 회원아이디와 비밀번호를 입력하실 필요가 없습니다.\n\n공공장소에서는 개인정보가 유출될 수 있으니 사용을 자제하여 주십시오.\n\n자동로그인을 사용하시겠습니까?"))
                return false;
        }
    });
});

function fhead_submit(f)
{
    return true;
}
</script>
<!-- } 로그인 전 아웃로그인 끝 -->
        
		<!-- 서브메뉴 -->
		<div style=" margin:15px 0 15px 0; padding:0;">
			
<style type="text/css">
/* red
#menu_tit {margin:0; padding:10px 0; color:#fff; font-weight:bold; font-size:12px; background-color:#E8180C; border:1px solid #C2150B; text-align:center;}
#aside_nav {margin-bottom:10px; font-size:12px;}
#aside_nav h2 {margin-bottom:10px; padding:7px 9px; line-height:160%; color:#444; font-size:14px; border-bottom:1px solid #aaa;}
#aside_nav ul {border:1px solid #e0e0e0; margin:0; padding:0; list-style:none; text-align:left;}
#aside_nav li {line-height:130%; border-bottom:1px solid #ccc; background:#eee;}
#aside_nav li a {display:block; padding:8px 9px 8px 19px; color:#444; background:url(/menu/sub_01/dot-nav.gif) no-repeat 9px 14px; text-decoration:none;}
#aside_nav li a:hover {background-color:#f5f5f5;}
#aside_nav li.current a {font-weight:bold; color:#d33b98; background-color:#ccc; background-image:url(/menu/sub_01/dot-nav-current-black.gif);}
*/

#menu_tit {margin:0; padding:25px 0; color:#eee; font-weight:bold; font-size:15px; background:#546799; border:1px solid #405079; text-align:center;}
#aside_nav {margin-bottom:10px; font-size:12px;}
#aside_nav h2 {margin-bottom:10px; padding:7px 9px; line-height:160%; color:#444; font-size:14px; border-bottom:1px solid #aaa;}
#aside_nav ul {border:1px solid #e0e0e0; margin:0; padding:0; list-style:none; text-align:left;}
#aside_nav li {line-height:130%; border-bottom:1px solid #ccc; background:#eee;}
#aside_nav li a {display:block; padding:8px 9px 8px 19px; color:#444; background:url(/menu/sub_01/dot-nav.gif) no-repeat 9px 14px; text-decoration:none;}
#aside_nav li a:hover {background-color:#f5f5f5;}
#aside_nav li.current a {font-weight:bold; color:#d33b98; background-color:#ccc; background-image:url(/menu/sub_01/dot-nav-current-black.gif);}
</style>


<div id='menu_tit'>커뮤니티 </div>
<div id="aside_nav">
<ul>
			<li class="current"><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard">자유게시판</a></li>
	

			<li><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard2">자유게시판2</a></li>
	
 
</ul>

</div>
					</div>

		<div style="border-top:0px solid #e7f1ed; padding:10px 0 0 0; text-align:center;">
			<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- git 200*200 -->
<ins class="adsbygoogle"
     style="display:inline-block;width:200px;height:200px"
     data-ad-client="ca-pub-9092974196339065"
     data-ad-slot="9874543812"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>		</div>

		    </div>

    <div id="container">
        
<h2 id="container_title">자유게시판<span class="sound_only"> 목록</span></h2>

<!-- 게시판 목록 시작 { -->
<div id="bo_list" style="width:100%">

    <!-- 게시판 카테고리 시작 { -->
        <nav id="bo_cate">
        <h2>자유게시판 카테고리</h2>
        <ul id="bo_cate_ul">
            <li><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard" id="bo_cate_on">전체</a></li><li><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%981">분류1</a></li><li><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%982">분류2</a></li><li><a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%983">분류3</a></li>        </ul>
    </nav>
        <!-- } 게시판 카테고리 끝 -->

    <!-- 게시판 페이지 정보 및 버튼 시작 { -->
    <div class="bo_fx">
        <div id="bo_list_total">
            <span>Total 5건</span>
            1 페이지
        </div>

            </div>
    <!-- } 게시판 페이지 정보 및 버튼 끝 -->

    <form name="fboardlist" id="fboardlist" action="./board_list_update.php" onsubmit="return fboardlist_submit(this);" method="post">
    <input type="hidden" name="bo_table" value="freeboard">
    <input type="hidden" name="sfl" value="">
    <input type="hidden" name="stx" value="">
    <input type="hidden" name="spt" value="">
    <input type="hidden" name="sca" value="">
    <input type="hidden" name="sst" value="wr_num, wr_reply">
    <input type="hidden" name="sod" value="">
    <input type="hidden" name="page" value="1">
    <input type="hidden" name="sw" value="">

    <div class="tbl_head01 tbl_wrap">
        <table>
        <caption>자유게시판 목록</caption>
        <thead>
        <tr>
            <th scope="col">번호</th>
                        <th scope="col">제목</th>
            <th scope="col">글쓴이</th>
            <th scope="col"><a href="/bbs/board.php?bo_table=freeboard&amp;sop=and&amp;sst=wr_datetime&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">날짜</a></th>
            <th scope="col"><a href="/bbs/board.php?bo_table=freeboard&amp;sop=and&amp;sst=wr_hit&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">조회</a></th>
                                </tr>
        </thead>
        <tbody>
                <tr class="">
            <td class="td_num">
            5            </td>
                        <td class="td_subject">
                                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%982" class="bo_cate_link">분류2</a>
                
                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;wr_id=11">
                    자유게시판 입니다 22                                    </a>

                <img src="http://test.g-it.kr/skin/board/basic/img/icon_hot.gif" alt="인기글">            </td>
            <td class="td_name sv_use"><span class="sv_member">GIT</span></td>
            <td class="td_date">02-12</td>
            <td class="td_num">338</td>
                                </tr>
                <tr class="">
            <td class="td_num">
            4            </td>
                        <td class="td_subject">
                                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%982" class="bo_cate_link">분류2</a>
                
                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;wr_id=10">
                    자유게시판 입니다 21                                    </a>

                <img src="http://test.g-it.kr/skin/board/basic/img/icon_hot.gif" alt="인기글">            </td>
            <td class="td_name sv_use"><span class="sv_member">GIT</span></td>
            <td class="td_date">02-12</td>
            <td class="td_num">293</td>
                                </tr>
                <tr class="">
            <td class="td_num">
            3            </td>
                        <td class="td_subject">
                                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%981" class="bo_cate_link">분류1</a>
                
                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;wr_id=9">
                    자유게시판 입니다 13                                    </a>

                <img src="http://test.g-it.kr/skin/board/basic/img/icon_hot.gif" alt="인기글">            </td>
            <td class="td_name sv_use"><span class="sv_member">GIT</span></td>
            <td class="td_date">02-12</td>
            <td class="td_num">297</td>
                                </tr>
                <tr class="">
            <td class="td_num">
            2            </td>
                        <td class="td_subject">
                                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%981" class="bo_cate_link">분류1</a>
                
                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;wr_id=8">
                    자유게시판 입니다 12                                    </a>

                <img src="http://test.g-it.kr/skin/board/basic/img/icon_hot.gif" alt="인기글">            </td>
            <td class="td_name sv_use"><span class="sv_member">GIT</span></td>
            <td class="td_date">02-12</td>
            <td class="td_num">317</td>
                                </tr>
                <tr class="">
            <td class="td_num">
            1            </td>
                        <td class="td_subject">
                                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;sca=%EB%B6%84%EB%A5%981" class="bo_cate_link">분류1</a>
                
                <a href="http://test.g-it.kr/bbs/board.php?bo_table=freeboard&amp;wr_id=7">
                    자유게시판 입니다 11                                    </a>

                <img src="http://test.g-it.kr/skin/board/basic/img/icon_hot.gif" alt="인기글">            </td>
            <td class="td_name sv_use"><span class="sv_member">GIT</span></td>
            <td class="td_date">02-12</td>
            <td class="td_num">137</td>
                                </tr>
                        </tbody>
        </table>
    </div>

        </form>
</div>


<!-- 페이지 -->

<!-- 게시판 검색 시작 { -->
<fieldset id="bo_sch">
    <legend>게시물 검색</legend>

    <form name="fsearch" method="get">
    <input type="hidden" name="bo_table" value="freeboard">
    <input type="hidden" name="sca" value="">
    <input type="hidden" name="sop" value="and">
    <label for="sfl" class="sound_only">검색대상</label>
    <select name="sfl" id="sfl">
        <option value="wr_subject">제목</option>
        <option value="wr_content">내용</option>
        <option value="wr_subject||wr_content">제목+내용</option>
        <option value="mb_id,1">회원아이디</option>
        <option value="mb_id,0">회원아이디(코)</option>
        <option value="wr_name,1">글쓴이</option>
        <option value="wr_name,0">글쓴이(코)</option>
    </select>
    <label for="stx" class="sound_only">검색어<strong class="sound_only"> 필수</strong></label>
    <input type="text" name="stx" value="" required id="stx" class="frm_input required" size="15" maxlength="20">
    <input type="submit" value="검색" class="btn_submit">
    </form>
</fieldset>
<!-- } 게시판 검색 끝 -->

<!-- } 게시판 목록 끝 -->

    </div>
</div>

<!-- } 콘텐츠 끝 -->

<hr>

<!-- 하단 시작 { -->
<div id="ft">
            <div style="padding-top:3px;">
		
<!-- 접속자집계 시작 { -->
<section id="visit">
    <div>
        <h2>접속자집계</h2>
        <dl>
            <dt>오늘</dt>
            <dd>23</dd>
            <dt>어제</dt>
            <dd>46</dd>
            <dt>최대</dt>
            <dd>62</dd>
            <dt>전체</dt>
            <dd>9,142</dd>
        </dl>
            </div>
</section>
<!-- } 접속자집계 끝 -->	</div>
    <div id="ft_catch"><img src="http://test.g-it.kr/theme/git_001/img/ft.png" alt="그누보드5"></div>
    <div id="ft_company">
    </div>
    <div id="ft_copy">
        <div>
            <a href="http://test.g-it.kr/bbs/content.php?co_id=company">회사소개</a>
            <a href="http://test.g-it.kr/bbs/content.php?co_id=privacy">개인정보취급방침</a>
            <a href="http://test.g-it.kr/bbs/content.php?co_id=provision">서비스이용약관</a>&nbsp;&nbsp;&nbsp;
			Copyright &copy; <b style="color:#4a9ab8;">www.g-it.kr.</b> All rights reserved.<br>
			<a href="#hd" id="ft_totop"><i class="fa fa-angle-double-up fa-2x"></i><!--상단으로--></a>
        </div>
    </div>
</div>


<!-- } 하단 끝 -->

<script>
$(function() {
    // 폰트 리사이즈 쿠키있으면 실행
    font_resize("container", get_cookie("ck_font_resize_rmv_class"), get_cookie("ck_font_resize_add_class"));
});
</script>



<!-- ie6,7에서 사이드뷰가 게시판 목록에서 아래 사이드뷰에 가려지는 현상 수정 -->
<!--[if lte IE 7]>
<script>
$(function() {
    var $sv_use = $(".sv_use");
    var count = $sv_use.length;

    $sv_use.each(function() {
        $(this).css("z-index", count);
        $(this).css("position", "relative");
        count = count - 1;
    });
});
</script>
<![endif]-->

</body>
</html>

<!-- 사용스킨 : basic -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<scRIPT LANGUAGE="Javascript">
function choise_chk(chk) {
  var target = document.getElementsByName('checkbox');
  var num = 0;
  var ropNum = 5; // 개수 임의지정
  for(var i=0; i < target.length; i++) {
    if(target[i].checked == true) {
      num++;
    }
  }

  if(num > ropNum) {
    chk.checked = false;
    return alert(ropNum + "개까지 선택할 수 있습니다." );
  }
}

</scRIPT>



</head>
<body>
<h2>확인하고 싶은 기구 5가지 선택</h2>
<form name="form1" method="post" action="1recommendmain" onSubmit="return chkval(this)"> 
<input type="checkbox" name="checkbox" value="1" onclick="choise_chk(this)"> 
1. 4D 깜짝모험관<br>
<input type="checkbox" name="checkbox" value="2" onclick="choise_chk(this)"> 
2. 급류타기<br>
<input type="checkbox" name="checkbox" value="3"  onclick="choise_chk(this)"> 
3. 달나라열차<br>
<input type="checkbox" name="checkbox" value="4" onclick="choise_chk(this)"> 
4. 도깨비바람<br>
<input type="checkbox" name="checkbox" value="5" onclick="choise_chk(this)"> 
5. 라바트위스터<br>
<input type="checkbox" name="checkbox" value="6" onclick="choise_chk(this)"> 
6. 록카페<br>
<input type="checkbox" name="checkbox" value="7" onclick="choise_chk(this)"	> 
7. 베스트키즈<br>
<input type="checkbox" name="checkbox" value="8" onclick="choise_chk(this)"	> 
8. 블랙홀 2000<br>
<input type="checkbox" name="checkbox" value="9" onclick="choise_chk(this)"	> 
9. 빅회전목마<br>
<input type="checkbox" name="checkbox" value="10" onclick="choise_chk(this)"	> 
10. 알포스윙<br>
<input type="checkbox" name="checkbox" value="11" onclick="choise_chk(this)"	> 
11. 은하열차888<br>
<input type="checkbox" name="checkbox" value="12" onclick="choise_chk(this)"	> 
12. 춤추는 요술집<br>
<input type="checkbox" name="checkbox" value="13" onclick="choise_chk(this)"	> 
13. 캐니멀서커스<br>
<input type="checkbox" name="checkbox" value="14" onclick="choise_chk(this)"	> 
14. 킹바이킹<br>
<input type="checkbox" name="checkbox" value="15" onclick="choise_chk(this)"	> 
15. 터닝메카드 고! 범퍼카<br>
<input type="checkbox" name="checkbox" value="16" onclick="choise_chk(this)"	> 
16. 해적소굴<br>
<input type="submit" value="전송"> 
</form>



</body>
</html>
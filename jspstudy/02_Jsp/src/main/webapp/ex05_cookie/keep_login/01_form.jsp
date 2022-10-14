<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../../assets/js/jquery-3.6.1.min.js"></script>
</head>
<body>
	
	<%
		// rememberId 쿠키가 있으면 해당 쿠키값을 id="id" 입력 요소에 표시
		
		String rememberId = "";
		Cookie[] cookies = request.getCookies();
		if(cookies !=null){
			for(int i = 0; i <cookies.length; i++ ){
				if( cookies[i].getName().equals("rememberId") ){
					rememberId =cookies[i].getValue();
					break;
				}
			}
		}
	%>
	
	
	<div>
		<form method="POST" action="02_login.jsp">
			<div>
				<input type="text" name="id" id="id" placeholder="아이디">
			
			</div>
			<div>
				<input type="password" name="pwd" placeholder="비밀번호">
			</div>
			<div>
				<button>로그인</button>
			</div>
		</div>
		
		<div>
		<label for="chk_keep_login">
			<input type="checkBox" name="chk_keep_login" id="chk_keep_login">
			로그인 유지하기
		</label>
		
		</form>
	</div>
	
	
</body>
</html>
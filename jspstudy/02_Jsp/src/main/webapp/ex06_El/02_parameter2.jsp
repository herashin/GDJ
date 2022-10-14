<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	
		pageContext.setAttribute("a", 7);
		pageContext.setAttribute("b", 2);
		
		
	%>
	<%--
		EL의 파라미터 처리
		1. EL 내장객체 parm을 사용(parm,paraValues)
		2. 모든 파라미터는 String이므로 크기 비교가 정상이 아님
			예시)
			
			"10","5"중  누가 큰가? "5가 크다(문자열의크기는 사전 편찬 순
		
	 --%>
	<div>${param.a+param.b }</div>
	<div>${param.a-param.b }</div>
	<div>${param.a*param.b }</div>
	<div>${param.a/param.b }, ${param.a div param.b }</div>
	<div>${param.a%param.b }, ${param.a mod param.b }</div>
	
	<div>${param.a<param.b },${param.a lt param.b} }</div>
	<div>${param.a<=param.b },${param.a le param.b} }</div>
	<div>${param.a>param.b },${param.a gt param.b} }</div>
	<div>${param.a>=param.b },${param.a ge param.b} }</div>
	<div>${param.a==param.b },${param.a eq param.b} }</div>
	<div>${param.a!=param.b },${param.a ne param.b} }</div>
	
	
	<div>${param.a==7 && b==2 },${a eq 7 and b eq 2 }</div>
	<div>${param.a==7 || b==2 },${a eq 7 or b eq 2 }</div>
	<div>${!(param.a==7)},${not (param.a eq 7) }</div>
	
	<div>${param.a==7 ? "a는 7이다" : 'a는 7이 아니다' }</div>


</body>
</html>
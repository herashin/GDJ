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
		application.setAttribute("a", 1);	// 애플리케이션 종료 전까지 유지
		session.setAttribute("b", 2);		// 브라우저 닫기 전까지 유지
		request.setAttribute("c", 3);		// 하나의 요청&응답 사이클 내에서 유지
		pageContext.setAttribute("d", 4);	// 현재 페이지 내에서만 유지
	%>
		
	<div>a: ${a}</div>
	<div>b: ${b}</div>
	<div>c: ${c}</div>
	<div>d: ${d}</div>
	
	<%-- 포워드 : request 정보를 전달하는 이동 방식 --%>
	<%--
		request.getRequestDispatcher("02_scope2.JSP").forward(request, response);
	
	--%>
	
	<jsp:forward page="02_scope2.jsp"></jsp:forward>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>
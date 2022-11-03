<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>연락처 등록</title>
</head>
<body>
	
	
	
	<form action="${contextPAth}/board/add" method="post"  style="width:500px; margin:0 auto;">
	<h1>연락처 등록</h1>
		<div>
			<label for="userName">이름*</label><br/>
			<input type="text"  name="userName"  id="userName">
		</div>
		
		<div>
			<label for="userPhon">전화*</label><br/>
			<input type="text"  name="userPhon"  id="userPhon">
		</div>
		
		<div>
			<label for="userAdress">주소*</label><br/>
			<input type="text"  name="userAdress"  id="userAdress">
		</div>
		
		
		<div>
			<label for="userEmail">이메일*</label><br/>
			<input type="text"  name="userEmail"  id="userEmail">
		</div>
		
		
		<div>
			<label for="userText">비고</label><br/>
			<input type="text"  name="userText"  id="userText">
		</div>
		
		<br/>
		<div>
			<button>연락처 저장하기</button>
			<input type="button" value="전체연락처" id="btn_list">
		</div>
		
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${contextPath}/resources/js/jquery-3.6.1.min.js"></script> 
</head>
<body>
	갤러리임쿸쿠리핏퐁
	
	<h1>예쁜 주노 보고 가세요</h1>
	<div id="gallerise">
	<!-- 
		절대 경로의 이미지를 img 태그로 표시하기
		1. 요청
			1) 경로 + 이미지를 파라미터로 전송
			
		2. 응답
			이미지의 byte[]
	 -->
		
	</div>
	<script>
//	$(document).ready(function(){
	//	$('#image').attr('src', '${contextPath}/image/display?path=' + encodeURIComponent('C:\\GDJ\\images') + "&filename=onesoju1.jpg")        
	//	$('#image').attr('src', '${contextPath}/image/display?path=' + encodeURIComponent('C:\\GDJ\\images') + '&filename=onesoju1.jpg');
	//});
	for( let n = 1; n <= 10; n++ ){
		$('<div>')
		.append($('<img>')		
		.attr('src', '${contextPath}/image/display?path=' + encodeURIComponent('C:\\GDJ\\images') + '&filename=animal'+n+'.jpg')
		.attr('width','200px'))
		.appendTo('#gallerise')
	}
	

	
	//$('#image').attr('src', '${contextPath}/image/display?path=' + encodeURIComponent('C:\\GDJ\\images') + '&filename=onesoju1.jpg');
	</script>
	
</body>
</html>
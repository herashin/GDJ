<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style>
	* {
		box-sizing: border-box;
		padding: 0;
		margin: 0;
		color: #333;
	}
	a {
		text-decoration: none;
	}
	h1 {
		text-align: center;
	}
	ul {
		list-style: none;
		display: flex;
		flex-wrap: wrap;
		width: 630px;
		margin: 30px auto;
	}
	ul > li {
		width: 200px;
		height: 200px;
		padding-top: 10px;
		margin-top: 10px;
		margin-right: 10px;
		text-align: center;
		border: 1px solid gray;
		border-radius: 5px;
	}
	ul > li > a {
		display: block;
		width: 100%;
		height: 100%;
	}
	/*
	ul > li > a:hover {
		background-color: orange;
	}
	*/
	#btn_write{
		padding:40px; 
		margin-top:50px;
	}
	
	
	
	.button {
	-webkit-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-moz-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-ms-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	-o-transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	transition: all 200ms cubic-bezier(0.390, 0.500, 0.150, 1.360);
	display: block;
	margin: 20px auto;
	max-width: 180px;
	text-decoration: none;
	border-radius: 4px;
	padding: 20px 30px;
}

.button {
	color: rgba(30, 22, 54, 0.6);
	box-shadow: rgba(30, 22, 54, 0.4) 0 0px 0px 2px inset;
}

.button:hover {
	color: rgba(255, 255, 255, 0.85);
	box-shadow: rgba(30, 22, 54, 0.7) 0 0px 0px 40px inset;
}


</style>
<script src="../assets/js/jquery-3.6.1.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#btn_write").click(function(event){
			
			location.href= '${contextPath}/board/write.do';
			
		});
		
	});

</script>
</head>
<body>

	<h1>게시글 목록 보기</h1>
	
	<div style="text-align:center">
		<button id="btn_write">추가</button>		
	</div>
	
	<ul>
		<c:forEach items="${boards}" var="b">
			<li class="button">
				<a href="${contextPath}/board/detail.do?boardNo=${b.boardNo}">
					<div>${b.title}</div>
					<div>${b.createDate}</div>
				</a>
			</li>
		</c:forEach>
	</ul>

</body>
</html>
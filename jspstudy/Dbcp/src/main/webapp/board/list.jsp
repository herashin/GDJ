<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 목록화면</h1>
	
	<a href="">새글작성하러가기</a><br/>
	<form id=""  method="POST" action="">
		<p>전체게시글 <span class=""></span></p>
		<table border="1">
			
			<thead>
				<tr>
					<td>게시글번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>조회수</td>
					<td>작성일자</td>
					<td>삭제</td>
				</tr>
			</thead>
			<c:if test="${count == 0}">
				<tbody>
					<tr>
						<td colspan="6">작성된 게시글이 없습니다.</td>						
					</tr>
				</tbody>
			</c:if>
			
			
			<c:if test="${count == 0}">
				<tbody>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</c:if>
			
			
		</table>
		
	
	</form>
	
	
</body>
</html>
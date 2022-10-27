<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../assets/js/jquery-3.6.1.min.js"></script>
<script>
	$(document).ready(function(){
		
		$(".board_write_go").click(function(event){
			
			location.href= '${contextPath}/board/write.do';
			
		});
		
	});

</script>
</head>
<body>
	<div>
		<form id=""  method="POST" action="">
			<div>총 게시글 <span class="boardListCount">${count}</span>개</div>	
			<table border="1">				
				<thead>
				
					<tr>
						<td>순번</td>
						<td>작성자</td>
						<td>제목</td>
						<td>작성일</td>				
					</tr>
				
				</thead>				
				<tbody>
					<c:if test="${count eq 0}">
						<tr>
							<td colspan="6">작성된 게시글이 없습니다.</td>									
						</tr>
					</c:if>
					<c:if test="${count ne 0}">
					<c:forEach items="${boards}" var="b">
						<tr>
							<td>${b.boardNo}</td>
							<td>${b.users}</td>
							<td>${b.title}</td>
							<td>${BOARD_DAY}</td>				
						</tr>	
					</c:forEach>				
					</c:if>
					<tr>
						<td colspan="6"><input type="button"  value="새글작성"  name="new_board" class="board_write_go"></td>									
					</tr>
				</tbody>
			</table>		
		</form>
	</div>
</body>
</html>
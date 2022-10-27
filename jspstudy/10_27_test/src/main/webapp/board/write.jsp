<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../assets/js/jquery-3.6.1.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#frm_write").submit(function(event){
			
			if($('#users').val()== '' || $('#title').val()== ''   )
			{
				alert('작성자와 제목은 필수입니다.');
				$("#users"),focus();
				event.preventDefault();
				return;
			}		
		});
		
		$('#btn_list').click(function(){
			
			location.href= '${contextPath}/board/list.do';
			
		});
		
	});

</script>
</head>
<body>
	<div>
		<form id="frm_write" action="${contextPath}/board/add.do" method="post" >
			<table border="1">				
				<thead>
					<tr>
						<td><label for="users" >작성자</label></td>
						<td><input type="text" id="users" name="users" ></td>									
					</tr>
				</thead>				
				<tbody>
					<tr>
						<td><label for="title" >제목</label></td>	
						<td><input type="text" id="title" name="title" ></td>									
					</tr>
					<tr>
						<td><label for="content" >내용</label></td>		
						<td>
							<textarea id="content" name="content" rows="20" cols="50">
								공지사항입니다.
							
							</textarea>
						</td>		
					</tr>
					<tr>
						<td><input type="submit" value="등록"></td>
						<td><input type="button" value="목록"  id="btn_list"></td>
					</tr>
				</tbody>
			</table>		
		
		
		</form>
		
	</div>
</body>
</html>
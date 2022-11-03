<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연락처 리스트</title>
</head>
<body>
	
	<table border="1" style=" margin:0 auto;">
		<thead>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>전화</td>
				<td>주소</td>
				<td>이메일</td>
			</tr>			
		</thead>
		
		<tbody>
			<tr>
				<td colspan="5">없음</td>
			</tr>		
		</tbody>
		
		<tfoot>
			<tr>
				<td colspan="5"><a href="brd/insert">신규연락처 등록하기</a></td>
			</tr>		
		</tfoot>
	
	</table>

</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@page import="domain.student"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<%-- 4. 배열 --%>
   <%
   String[] menues = {"김밥","떡볶이","순대"};
         pageContext.setAttribute("menues", menues);
   %>
   <c:forEach var="menu" items="${menues}" varStatus="vs">         <%-- 인덱스를 꺼낼때 쓸 값을 정하는것 : varStatus --%>
      인덱스 : ${vs.index}, 순번 : ${vs.count}, 배열요소 : ${menu} <br>
   </c:forEach>
	<hr>
	<%
	List<String> seasons = Arrays.asList("봄","여름","가을","겨울");
			pageContext.setAttribute("seasons", seasons);
	%>
	<c:forEach var="season" items="${seasons}" varStatus="k">
		인덱스 : ${k.index}, 순번 : ${k.count}, 배열요소 : ${menu}<br>
	
	</c:forEach>
	<hr>
	<%
	Map<String, Integer> map = new HashMap<>();
			map.put("begin",1);
			map.put("end",10);
			pageContext.setAttribute("map", map);
	%>
	${map.begin} ~ ${map.end}<br>
	
	
	<%-- 7. 객체 (반복이 필요한 건 아님) --%>
   <%
   student board = new student();
         board.setBoardNo(1);
         board.setTitle("도대체 언제까지 ...");
         board.setHit(100);
         pageContext.setAttribute("board", board);
   %>
   ${board.boardNo},${board.title}, ${board.hit}<br>
   ${board.getBoardNo()}, ${board.getTitle()}, ${board.getHit()}<br>
	
	   <%
		   List<student> boards = new ArrayList<>();
		         boards.add(new student(100, "질문입니다", 2));
		         boards.add(new student(100, "질문입니다", 2));
		         boards.add(new student(100, "질문입니다123", 2));
		         pageContext.setAttribute("boards", boards);
		   %>
	<table border="1">
		<thead>
			<tr>
				<td>순번</td>
				<td>게시글번호</td>
				<td>제목</td>
				<td>조회수</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${ boards}" varStatus="vs">
				<tr>
					<td>${vs.count }</td>
					<td>${board.boardNo }</td>
					<td>${board.title }</td>
					<td>${board.hit }</td>				
				</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
	
</body>
</html>
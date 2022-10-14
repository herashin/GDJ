<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session에 저장된 cart제거하기
	session.removeAttribute("cart");
	


	// 장바귀 목록으로 이동
	response.sendRedirect("03_cart_list.jsp");

%>
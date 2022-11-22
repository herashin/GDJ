<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<c:set  var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${contextPatg}/resources/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">


</script>
<style>
	.close_ul_area{display:none;}

</style>
</head>
<body>
	we are best team
	
	<div class="wrap" >
		<div class="head_area" >
			
			<ul>
				<li>
					회원
					<ul class="close_ul_area">
						<li>- 가입/탈퇴/로그인/로그아웃</li>
						<li> - 아이디찾기/비밀번호찾기</li>
						<li> - 정보변경/비밀번호변경</li>
						<li> - 네이버로그인/카카오로그인</li>
					</ul>
				</li>
				<li>
					자유 게시판
					<ul class="close_ul_area">
						<li>- 다단 계층 게시판</li>
						<li>- 로그인한 유저만 작성 가능</li>
						<li>- 작성자만 삭제 가능</li>
						<li>- 작성자만 내용 수정 가능</li>
					</ul>
				</li>

				<li>
					갤러리 게시판
					<ul class="close_ul_area">
						<li>- 게시글에 사진을 올릴 수 있는 게시판</li>
						<li>- 댓글 작성 가능</li>
						<li>- 좋아요 기능</li>
						<li>- 글 작성 시 포인트 지급</li>
					</ul>
				</li>

				<li>
					업로드/다운게시판
					<ul class="close_ul_area">
						<li>- 로그인한 유저만 작성 가능</li>
						<li> - 작성자는 파일 업로드 가능</li>
						<li>- 작성자만 삭제 가능</li>
						<li>- 작성자만 내용/첨부 수정 가능</li>
						<li>- 상세보기에서 다운로드 지원</li>
						<li>- 글 작성 시 포인트 지급</li>
					</ul>
				</li>
				<li>
					관리자
					<ul class="close_ul_area">
						<li>admin</li>
						
					</ul>
				</li>


			</ul>


		</div>


		<div class="container">




		</div>


		<div class="fotter" >



		</div>


	</div>
	
		
</body>
</html>
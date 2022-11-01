<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${contextPath}/resources/css/jquery-ui.min.css" />


<script src="${contextPath}/resources/js/jquery-3.6.1.min.js"></script>      <!--  순서 주의 -->
<script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
<script>
	$(document).ready(function(){
		$('#targetDt').datepicker({
			dateFormat: 'yymmdd'
		});
		
		$('#btn').click(function(){
		var dayday = $('#targetDt').val();
		$.ajax({
			type: 'get',
			data: 'targetDt=' + $('#targetDt').val(),
			url: 'http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=58d4344c17fc0c06989263d0f1d2da2f&targetDt='+dayday,
			dateType: 'json',
			success: function(resData){
				$('#boxOfficeList').empty();
				
				$.each(resData.boxOfficeResult.dailyBoxOfficeList,function(i,movie){
					var tr = '<tr>';
					tr += '<td>' + resData.rank + '</td>';
					tr += '<td>' + resData.movieNm + '</td>';
					tr += '<td>' + resData.openDt + '</td>';
					tr += '<td>' + resData.audiCnt + '</td>';
					tr += '<td>' + resData.audiAcc + '</td>';
									
					tr += '</tr>';
					$('#boxOfficeList').html(tr);
				
				});
			}
		});
		
		});
		
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<div>
		<label for="targetDt">조회날짜</label>
		<input type="text" id="targetDt">
		<input type="button" id="btn" value="조회">
	</div>
	
	<hr>
	
	<div>
		<table border="1">
			<thead>
				<tr>
					<td>순위</td>
					<td>영화제목</td>
					<td>개봉일</td>
					<td>일일관객수</td>
					<td>누적관객수</td>
				</tr>
			</thead>
			<tbody id="boxOfficeList">
				
			</tbody>
		</table>
	</div>
</body>
</html>
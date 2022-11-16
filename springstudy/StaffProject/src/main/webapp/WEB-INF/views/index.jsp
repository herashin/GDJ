<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		fn_staff_list();
		insert_staff();
		find();
	});
	
	   function fn_staff_list(){
		      $.ajax({
		         type : 'get',
		         url : '${contextPath}/list.json',
		         dataType : 'json',
		         success : function(resData){
		        	 $('#staff_list').empty();
		            $.each(resData, function(i, staff){		               
		               $('<tr>')
		               .append( $('<td>').text(staff.sno))
		               .append( $('<td>').text(staff.name))
		               .append( $('<td>').text(staff.dept))
		               .append( $('<td>').text(staff.salary))
		               .appendTo('#staff_list');
		               
		            })
		         }
		      });
		   }
	
	function insert_staff(){
		$('#insert_staff_btn').click(function(){
			if(/^[0-9]{5}$/.test($('#sno').val()) == false ){
				alert('사원번호는 5자리 숫자입니다.');
				return;
			}
			$.ajax({
				type:'post',
				url :'${contextPath}/add',
			//	data: $('insert_staff').serialize(),
				data: 'sno='+ $('#sno').val()+ '&name=' + $('#name').val() + '&dept=' + $('#dept').val(),
				dataType: 'text',
				success: function(resData){
					alert(resData);
					fn_staff_list();
					$('#sno').val('');			
				},
				error: function(jqXHR){
					alert(jqXHR.responseText);
					
				}
				
			});
			
		});
	}
	
	   function find() {
		      $('#btn_sno_select').click(function(){
		         $.ajax({
		            type: 'get',
		            url: '${contextPath}/query',
		            data: 'sno=' + $('#query').val(),
		            dataType: 'json',
		            success: function(resData){
		               $('#staff_list').empty();
		               var tr = '<tr>';
		               tr += '<td>' + resData.sno + '</td>';
		               tr += '<td>' + resData.name + '</td>';
		               tr += '<td>' + resData.dept + '</td>';
		               tr += '<td>' + resData.salary + '</td>';
		               tr += '</tr>';
		               $('#staff_list').append(tr);
		            },
		            error: function(jqXHR){
		               alert('조회된 사원 정보가 없습니다.')
		            }
		         })
		         
		      })
		   }

	
	
	
	   
		
		
		
	
</script>
</head>
<body>
	<h3>사원 등록</h3>
	<form  id="insert_staff" >
		<input type="text"  id="sno"  name="sno"  placeholder="사원번호" >
		<input type="text"  id="name"  name="name"  placeholder="사원명" >
		<input type="text"  id="dept"  name="dept"  placeholder="부서명" >
		<input type="button"  value="등록"  id="insert_staff_btn">
	</form>
	
	<div>
		<h3>사원 조회</h3>
		<form id="sno_select_area">
			<input type="text" id="query" name="query"  placeholder="사원번호">
			<input type="button"  value="조회"  id="btn_sno_select" >
			<input type="button" value="전체" id="btn_sno_all" >
		</form>
		
	</div>
	<hr>
	
	<h3>사원 목록</h3>
	<table border="1">
		<thead>
			<tr>
				<td>사원번호</td>
				<td>사원명</td>
				<td>부서명</td>
				<td>연봉</td>
			</tr>
		</thead>
		
		<tbody id="staff_list">
			
		</tbody>
	
	</table>
</body>
</html>
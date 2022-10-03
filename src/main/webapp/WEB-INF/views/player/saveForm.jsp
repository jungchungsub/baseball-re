<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">

	<h2>선수등록페이지</h2>
	<form id="form">

		팀이름 : <select id="teamId">
			<c:forEach var="team" items="${teamList}">
				<option value="${team.id}">${team.name}</option>
			</c:forEach>
		</select> 선수 이름 : <input id="name" type="text" placeholder="Enter name">


		포지션 이름 : <input id="position" type="text" placeholder="Enter position">


		<button id="btnInsert" type="button" class="btn btn-primary">선수등록완료</button>
	</form>
</div>

<script>
	$("#btnInsert").click(()=>{
		insert();
	});
	
	function insert(){
		let data = {
				name: $("#name").val(),
				position: $("#position").val(),
				teamId: $("#teamId").val()
		}
		console.log(data)
		$.ajax("/player",{
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data), // http body에 들고갈 요청 데이터
			headers: { // http header에 들고갈 요청 데이터
				"Content-Type": "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code == 1){ // 성공
				location.href="/player";
			}else{ // 실패
				alert("선수등록에 실패하였습니다.");
			}
		});
	}
</script>



<%@ include file="../layout/footer.jsp"%>


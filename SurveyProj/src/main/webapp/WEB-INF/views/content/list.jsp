<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" type="text/css"
	href="/resources/css/style_list.css">
<div id="container" class="sub">

	<!--컨텐츠영역-->
	<div id="contents" style="width: 1100px;">
		<!--인쇄영역-->
		<div id="print_wrap">
			<!--내용영역-->
			<div id="cont_wrap">


				<link rel="stylesheet" type="text/css"
					href="http://www.panel-queen.com/content/board/nninc_poll/css/common.css">
				<link rel="stylesheet" type="text/css"
					href="http://www.panel-queen.com/content/board/nninc_photo/css/lightbox.css">
				<script type="text/javascript"
					src="http://www.panel-queen.com/content/board/nninc_poll/js/common.js"></script>
				<script type="text/javascript"
					src="http://www.panel-queen.com/content/board/nninc_poll/js/board.js"></script>
				<script type="text/javascript"
					src="http://www.panel-queen.com/content/board/nninc_photo/js/spica.js"></script>
				<script type="text/javascript"
					src="http://www.panel-queen.com/contentf/board/nninc_photo/js/lightbox.js"></script>



				<!-- 리스트nninc_poll -->
				<div id="board" style="width: 100%;">



					<table summary="설문조사참여 리스트입니다." class="table1">
						<caption>설문조사참여</caption>
						<colgroup>
							<col width="5%">
							<col width="*">
							<col width="13%">
							<col width="13%">
							<col width="13%">
						</colgroup>
						<thead>
							<tr>
								<th scope="col">설문조사 번호</th>
								<th scope="col">설문조사 제목</th>
								<th scope="col">설문조사 작성자</th>
								<th scope="col">설문조사 시작일</th>
								<th scope="col">설문조사 종료일</th>
								<th scope="col">설문조사 조회수</th>
								<th scope="col">설문조사 참여수</th>
								<th scope="col">설문조사 상태</th>
							</tr>
						</thead>
						<tbody>
							<c:set var="now" value="<%=new java.util.Date()%>" />
							<c:forEach items="${list }" var="surveyVO">
								<tr class="">
									<td>${surveyVO.sv_id }</td>
									<td><a href="/content/read/${surveyVO.sv_id }">${surveyVO.sv_title }</a></td>
									<td><span>${surveyVO.sv_writer }</span></td>
									<td><span><fmt:formatDate
												value="${surveyVO.sv_startdate }" pattern="yy/MM/dd" /></span></td>
									<td><span><fmt:formatDate
												value="${surveyVO.sv_enddate }" pattern="yy/MM/dd" /></span></td>
									<td><span class="pt c_green">${surveyVO.sv_hits }</span></td>
									<td><span class="pt c_yellow">${surveyVO.sv_count }</span></td>

									<c:if test="${surveyVO.sv_enddate >= now  }">
										<td><span class="pt c_blue">${surveyVO.sv_state }</span></td>
									</c:if>
									<c:if test="${surveyVO.sv_enddate < now  }">
										<td><span class="pt c_blue">종료 ㅋㅋ</span></td>
									</c:if>
									<!-- 				<td>3999<br></td> -->
									<!-- 				<td><a style="" href="/content/read/1"  id='title'>당신은 어떤 과일을 좋아 하시나요?</a></td> -->
									<!-- 				<td><span class="">운영자</span></td> -->
									<!-- 				<td><span class="">2018-04-10</span></td> -->
									<!-- 				<td><span class="">2018-04-25</span></td> -->
									<!-- 				<td><span class="pt c_green">100</span></td> -->
									<!-- 				<td><span class="pt c_yellow">30</span></td> -->
									<!-- 				<td><span class="pt c_blue">진행중</span></td> -->
								</tr>
							</c:forEach>
							<tr class="empty">
								<td colspan="5"></td>
							</tr>
						</tbody>
					</table>






	<c:if test="${ authUser.m_kind eq '관리자' }">
					<!-- 버튼 -->
					<div class="board_button">
						<div class="fr"></div>
						<button class="board pt c_green">글쓰기</button>
					</div>
					<!-- //버튼 -->
</c:if>
					<!-- 페이징 -->
					<div class="board_paginate">
						<a>&lt;</a>&nbsp; <strong>1</strong>&nbsp; <a>2</a>&nbsp; <a>3</a>&nbsp;
						<a>&gt;</a>&nbsp;
					</div>
					<!-- //페이징 -->

					<!-- 게시물 검색 -->



				</div>
				<!-- //리스트 -->

				<script type="text/javascript">
				
					$(".jsTemp7").each(
							function() {
								$(this).children("td").css("background-color",
										"#eaeaea");
							});

					$(function() {
						$('#title').click(function(e) {
							alert("타이틀 눌럿엉")
							// 		e.preventDefault();
							// 		var addr = $(this).children("a").attr("href");
							// 		location.href(addr);
						})
						$('.board_button').click(function(){
							$(location).attr('href', "/admin/register");

						})
					})
				</script>



			</div>
			<!--//내용영역-->

		</div>
	</div>
	<!--//컨텐츠영역-->
</div>
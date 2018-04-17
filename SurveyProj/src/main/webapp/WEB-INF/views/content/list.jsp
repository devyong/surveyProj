<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
								<th scope="col">Bno</th>
								<th scope="col">Title</th>
								<th scope="col">writer</th>
								<th scope="col">StartDate</th>
								<th scope="col">EndDate</th>
								<th scope="col">Hits</th>
								<th scope="col">Count</th>
								<th scope="col">State</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list }" var="surveyVO">
								<tr class="">
									<td>${surveyVO.sv_id }<br></td>
									<td><a style=""
										href="?proc_type=view&amp;a_num=16234053&amp;b_num=178&amp;rtn_url=%2Fcontent%2F01_01.php">${surveyVO.sv_title }</a></td>
									<td><span class="">${surveyVO.sv_writer }</span></td>
									<td><span class="">${surveyVO.sv_startdate }</span></td>
									<td><span class="">${surveyVO.sv_enddate }</span></td>
									<td><span class="pt c_green">${surveyVO.sv_hits }</span></td>
									<td><span class="pt c_yellow">${surveyVO.sv_count }</span></td>
									<td><span class="pt c_blue">${surveyVO.sv_state }</span></td>
								</tr>
							</c:forEach>
							<tr class="empty">
								<td colspan="5"></td>
							</tr>
						</tbody>
					</table>







					<!-- 버튼 -->
					<div class="board_button">
						<div class="fr"></div>
						<button class="board pt c_green">글쓰기</button>
					</div>
					<!-- //버튼 -->
				</div>
				<!-- 페이징 -->
				<div class="board_paginate">
					<ul>
						<c:if test="${pageMaker.prev }">
							<li><a href="list?page=${pageMaker.startPage - 1 }">&laquo;</a></li>
						</c:if>

						<c:forEach begin="${pageMaker.startPage }"
							end="${pageMaker.endPage }" var="idx">
							<li style="display: inline;"
								<%-- <c:out value="${pageMaker.cri.page == idx?'class=active':'' }"/>> --%>
								>
								<c:choose>
								
								<c:when test="${pageMaker.cri.page eq idx}">
								<a href="list?page=${idx }"><b>${idx }</b></a>
								</c:when>
								<c:otherwise>
								<a href="list?page=${idx }">${idx }</a>
								</c:otherwise>
								</c:choose>
							
								
							</li>
						</c:forEach>

						<c:if test="${pageMaker.next && pageMaker.endPage > 0  }">
							<li><a href="list?page=${pageMaker.endPage +1 }">&raquo;</a></li>
						</c:if>
					</ul>
				</div>
				<!-- //페이징 -->

				<!-- 게시물 검색 -->




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
							e.preventDefault();
							var addr = $(this).children("a").attr("href");
							location.href(addr);
						})
					})
				</script>



			</div>
			<!--//내용영역-->

		</div>
	</div>
	<!--//컨텐츠영역-->
</div>
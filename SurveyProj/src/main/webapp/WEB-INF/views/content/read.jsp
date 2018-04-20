<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/all.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/head_layout.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/foot_layout.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/main_layout.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/menu_bubble.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/menu_bubble_r.css">
<link rel="stylesheet" type="text/css"
	href="http://www.panel-queen.com/common/css/owl.carousel.min.css">
<script>
	$(function (){
		if(${isParticipate != null}){
			$(".start").hide();
			$('.modify').show();
			
		}
	});
</script>
<div id="container" class="sub">

	<!--컨텐츠영역-->
	<div id="contents">
		<!--인쇄영역-->
		<div id="print_wrap">
			<!--내용영역-->
			<div id="cont_wrap">


				<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/content/board/nninc_poll/css/common.css" />
				<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/content/board/nninc_photo/css/lightbox.css" />
				<script type="text/javascript"
					src="/content/board/nninc_poll/js/common.js"></script>
				<script type="text/javascript"
					src="/content/board/nninc_poll/js/board.js"></script>
				<script type="text/javascript"
					src="/content/board/nninc_photo/js/spica.js"></script>
				<script type="text/javascript"
					src="/content/board/nninc_photo/js/lightbox.js"></script>

				
				<!-- 보기 -->
				<div id="board" style="width: 100%;">

					<div class="s0102">
						<ul class="tip">
							<!-- 			<li class="bu01">조사완료포인트</li> -->
							<!-- 			<li class="bu02">탈락포인트</li> -->
							<!-- 			<li class="bu03">마감포인트</li> -->
						</ul>
						<table summary="설문조사참여 가이드입니다." class="table2">
							<caption>설문조사참여가이드</caption>
							<thead>
								<tr>
									<th scope="col">
										<dl class="title">
											<dt>${surveyVO.sv_id }</dt>
											<dd>${surveyVO.sv_title}</dd>
											<dd class="code"></dd>
										</dl>
										<ul class="pt">
											<li class="pt02">${surveyVO.sv_writer }</li>
											<li class="pt01 pt_none"><fmt:formatDate
													value="${surveyVO.sv_startdate }" pattern="yy/MM/dd" /></li>
											<li class="pt03"><fmt:formatDate
													value="${surveyVO.sv_enddate }" pattern="yy/MM/dd" /></li>
											<li class="pt02">조회 : ${surveyVO.sv_hits }</li>
											<li class="pt03">참여 : ${surveyVO.sv_count}</li>

										</ul>
									</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										<p>
											<span style="font-size: 10pt;"></span>&nbsp;
										</p>
										<div class="btn_w">
										
											<a href="/content/enter?sv_id=${ surveyVO.sv_id }" target="" class="con_btn navy start">설문시작하기</a>
											<a href="/content/modify?sv_id=${ surveyVO.sv_id }" target="" class="con_btn navy modify" style="display: none;">설문수정하기</a>
										</div>

									</td>
								</tr>
							</tbody>
						</table>


					</div>



					<!-- 버튼 -->
					<div class="board_button">
						<!-- <div class="fl pt10">
						<a href="?proc_type=view&amp;b_num=179" ><img src="/content/board/nninc_poll/img/listup_bt.gif" alt="다음글" /></a>
								</div> -->
						<div class="fr pt10">





							<span><a href="/content/list" class="cbtn cbtn_g">설문리스트</a></span>
							<span><a href="/content/result/${ surveyVO.sv_id }" class="cbtn cbtn_g">결과보기</a></span>
							<c:if test="${ authUser.m_kind eq '관리자'}">
							<span><a href="/admin/modify?sv_id=${ surveyVO.sv_id }" class="cbtn cbtn_g">설문내용수정하기</a></span>
							</c:if>
						</div>
					</div>
					<!-- //버튼 -->


					<!-- 설문조사 가이드 -->
					<div class="topbox s0102_icon">
						<p class="btxt">패널퀸 설문조사 가이드</p>
					</div>
					<div class="guide">
						<ul>
							<li><span class="num">01</span>
								<div class="desc">
									<p>아래 내용과 같이 설문조사에 참여했을 경우, 포인트를 지급하지 않고, 통보 없이 회원 탈퇴 처리가
										되므로 주의하시기 바랍니다.</p>
									<ul class="list">
										<li>응답 내용이 패널 가입 및 기본 조사 응답 내용과 다른 경우</li>
										<li>응답 내용 중 동일한 문항에 대해서 응답이 다를 경우</li>
										<li>설문 문항을 자세히 읽지 않고, 빠르게 응답하여 평균 응답시간보다 응답시간이 매우 짧은 경우</li>
										<li>주관식 기입 문항에 “ㅋㅋㅋ”, 욕설와 같이 불성실 답변으로 판단될 경우</li>
										<li>동일인이 여러 아이피로 중복 활동을 하는 경우</li>
									</ul>
								</div></li>
							<li><span class="num">02</span>
								<div class="desc">
									<p>설문조사 참여 중 주의사항</p>
									<ul class="list">
										<li>설문조사 참여 도중에 <span class="st">뒤로가기</span> 혹은 <span
											class="st">새로 고침</span>을 누르시면 설문이 중단되거나 포인트가 정상적으로 지급되지 않으며,
											설문조사 페이지가 인터넷 연결 상태에 따라 늦게 로딩될 수도 있사오니 조금만 기다려주시기바랍니다.
										</li>
									</ul>
								</div></li>
							<li><span class="num">03</span>
								<div class="desc">
									<p>본 조사의 내용을 캡쳐하거나 사진을 찍어서 제3자에게 유출시키면 안됩니다.</p>
								</div></li>
							<li><span class="num">04</span>
								<div class="desc">
									<p>회원님께서 응답하신 내용은 통계데이터로만 활용되며, 개인정보를 설문조사를 통하여 입력 받거나 제공하지
										않습니다.</p>
								</div></li>
							<li><span class="num">05</span>
								<div class="desc">
									<p>설문조사 완료 후 회원님의 설문응답지를 다시 검증하여, 응답하신 결과에 따라 확인과정이 있을 수
										있습니다.</p>
								</div></li>
						</ul>
					</div>
					<!--// 설문조사 가이드 -->


					<!-- 댓글 -->
					<!-- //댓글 -->

				</div>
				<!-- //보기 -->

			</div>
			<!--//내용영역-->

		</div>
	</div>
	<!--//컨텐츠영역-->
</div>
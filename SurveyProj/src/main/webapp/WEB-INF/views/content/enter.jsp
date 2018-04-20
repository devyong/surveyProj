<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<title></title>

<link rel="stylesheet" type="text/css" href="/resources/css/style_enter.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body class="translate survey-body modern-browser" id="patas">
	<!--<![endif]-->

	<!-- Textured Paper, Seamless Paper Texture and Escheresque are from subtlepatterns.com. Made available under CC BY-SA 3.0 License: http://creativecommons.org/licenses/by-sa/3.0/legalcode. -->
	<!-- You cannot remove or modify any notice of copyright, trademark or other proprietary right, or any other copyright management information or metadata from wherever it is embedded in the content. -->
	<article class="survey-page survey-page-white">

		<header class="survey-page-header"> </header>
		<section class="survey-page-body">

			<form name="surveyForm" action="" method="post">
				<input type="hidden" value="${ enterTitleVO.sv_id }">
				
				<div class="questions clearfix">
				
					<div class="question-row clearfix &#10;">
						<div
							class="question-container&#10;    &#10;        &#10;        &#10;    &#10;    "
							data-question-type="single_choice_vertical">

							<div
								class=" question-single-choice-radio qn question vertical question-required"
								id="question-field-291390016" data-question-id="291390016"
								data-qnumber="1">


								<h4 class="question-title-container"
									id="question-title-291390016">
									<!--  설문 제목  -->
									 <span class="user-generated notranslate">[ 설문 번호 ${ enterTitleVO.sv_id }] ${ enterTitleVO.sv_title } </span>
									 
								</h4>
								<div class="question-body clearfix notranslate ">
									<div>
										<div class="answer-option-cell">

											<div class="radio-button-container " data-sm-radio-button="">
											<c:forEach items="${ enterListVO }" var="enterList">
											<div><label><input type="radio" name="list_id" value="${ enterList.list_id }">${ enterList.list_content }</label></div>
											
											</c:forEach>
											</div>

										</div>

									</div>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="survey-submit-actions center-text clearfix">
					<button class="btn okbtn btn-outline-primary" type="submit">확인</button>
				</div>	
			</form>
			
			<div class="center-text">
			
			<button class="btn"
			onclick="location='/content/list'">목록</button>
			
			</div>
				
		</section>

	</article>
	<div class="survey-under-footer-ie-buffer"></div>



	<div style="display: none;">
		<script>
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'https://www.google-analytics.com/analytics.js', 'ga');

			ga('create', 'UA-56526-1', 'auto');
			ga('send', 'pageview');
		</script>
	</div>


	<noscript>&amp;lt;style type="text/css"
		media="all"&amp;gt;form {display:none;}
		&amp;lt;/style&amp;gt;&amp;lt;div
		style="text-align:center;"&amp;gt;Javascript is required for this site
		to function, please enable.&amp;lt;/div&amp;gt;</noscript>
		
<script>

$('.okbtn').click(function(){
	alert("설문 참여 완료 !! ");
})

</script>
	
</body>
</html>

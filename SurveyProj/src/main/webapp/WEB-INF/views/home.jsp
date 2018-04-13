<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/style_home.css">
<div id="container" class="sub">
			<!--컨텐츠영역-->
			<div id="contents_wide">
				<!--인쇄영역-->
				<div id="print_wrap">


<!--내용영역-->
<div id="cont_wrap">
	<div class="headline">
		<h2 class="tit">로그인</h2>
		<p class="txt">쉽고 간단한 회원가입만 해도 500포인트 즉시 지급</p>
	</div>
	<div class="s0901">

<form name="loginFrm" id="loginFrm" method="post" action="https://www.panel-queen.com:7458/content/member/login_ok.php" onsubmit="javascript: return login_ok();">
<input type="hidden" name="prepage" value="/content/01_01.php">
		<table summary="설문조사를 받을 이메일 입력 폼 테이블 입니다." class="table3">
			<caption>설문조사 이메일 입력</caption>
			<colgroup>
				<col width="50%">
				<col width="50%">
			</colgroup>
			<tbody>
				<tr>
					<td colspan="2">
						<dl>	
							<dt><label for="m_id">아이디</label></dt>
							<dd><input id="m_id" name="m_id" type="text" class="input_box" style="ime-mode :disabled;"></dd>
						</dl>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<dl>
							<dt><label for="m_pwd">비밀번호</label></dt>
							<dd><input id="m_pwd" name="m_pwd" type="password" class="input_box"></dd>
						</dl>
					</td>
				</tr>
			</tbody>
		</table>

		<div class="btn_w">
			<input type="submit" value="로그인" class="con_btn sky fl">
			<a href="/content/09_01.php" class="con_btn red fr">회원가입</a>
		</div>
</form>
	</div>
</div>
<!--//내용영역-->

				</div>
			</div>
			<!--//컨텐츠영역-->
		</div>
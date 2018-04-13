<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/style_join.css">
<div id="container" class="sub">
			<!--컨텐츠영역-->
			<div id="contents_wide">
				<!--인쇄영역-->
				<div id="print_wrap">

<!--내용영역-->
<div id="cont_wrap">
	<div class="con_tab tab_b">

	</div>
	<div class="headline" id="jsTop">
		<h2 class="tit">회원가입</h2>
		<p class="txt">쉽고 간단한 회원가입만 해도 500포인트 즉시 지급<br>회원님의 기본정보를 입력해주세요.</p>
	</div>
	<div class="s0901">


<form id="frm" method="post" action="https://www.panel-queen.com:7458/content/member/regist_ok.php" onsubmit="javascript: return sendit();">
<input type="hidden" name="m_recom_id" value="">

<div class="jsMember" style="">

		<table summary="회원 아이디, 비밀번호 입력 폼 테이블입니다." class="table3">
			<caption>회원 아이디, 비밀번호 설정</caption>
			<colgroup>
				<col width="50%">
				<col width="50%">
			</colgroup>
			<tbody>
				<tr>
					<td colspan="2">
						<dl>
							<dt><label for="m_id">아이디</label></dt>
							<dd>
								<input id="m_id" name="m_id" type="text" class="input_box" style="ime-mode :disabled;">
								<input type="hidden" name="idchk" value="N">
								<button type="button" id="jsBtnIdChk" class="con_sbtn navy mt10">중복확인</button>
							</dd>
						</dl>
						<p class="notice" id="jsNoticeMid"></p>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<dl>
							<dt><label for="m_pwd">비밀번호 입력</label></dt>
							<dd><input id="m_pwd" name="m_pwd" type="password" class="input_box" maxlength="20"></dd>
						</dl>
						<p class="notice">비밀번호는 8자 이상 영문,숫자,특수문자 조합만 가능합니다.</p>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<dl>
							<dt><label for="m_pwdchk">비밀번호 확인</label></dt>
							<dd><input id="m_pwdchk" name="m_pwdchk" type="password" class="input_box" maxlength="20"></dd>
						</dl>
						<p class="notice" id="jsNoticeMpwd"><!-- 비밀번호가 일치하지 않습니다. 다시  입력해주세요. --></p>
					</td>
				</tr>
			</tbody>
		</table>

		<div class="btn_w">
			<input type="button" value="다음단계" class="con_btn sky fr" id="jsBtnNext2">
			<input type="button" value="이전단계" class="con_btn mint fl jsBtnPrev">
		</div>
</div>




<div class="jsMember" style="display:none;">


	<table summary="회원 성별 입력 폼 테이블입니다." class="table3">
		<caption>회원 성별 지정</caption>
		<colgroup>
			<col width="50%">
			<col width="50%">
		</colgroup>
		<tbody>
			<tr>
				<td colspan="2">
						<div class="custom-radiobtn-sprite">
							<input id="m_sex_1" name="m_sex" type="radio" value="1"><label class="male" for="m_sex_1">Male</label>
							<input id="m_sex_2" name="m_sex" type="radio" value="2"><label class="female" for="m_sex_2">Female</label>
						</div>
				</td>
			</tr>
		</tbody>
	</table>

	<div class="btn_w">
		<input type="button" value="다음단계" class="con_btn sky fr" id="jsBtnNext3">
		<input type="button" value="이전단계" class="con_btn mint fl jsBtnPrev">
	</div>


</div>


<div class="jsMember" style="display:none;">


	<table summary="회원 출생년도, 월, 일 입력 폼 테이블입니다." class="table3">
	<caption>회원 출생년도, 월, 일 입력</caption>
	<colgroup>
		<col width="50%">
		<col width="50%">
	</colgroup>
	<tbody>
		<tr>
			<td colspan="2">
				<div class="birth">
					<ul>
						<li>
							<p class="select_tit">출생년도</p>
							<select name="m_birth_Y" id="m_birth_Y" title="년도" class="select_box">
														<option value="1900">1900</option>
														<option value="1901">1901</option>
														<option value="1902">1902</option>
														<option value="1903">1903</option>
														<option value="1904">1904</option>
														<option value="1905">1905</option>
														<option value="1906">1906</option>
														<option value="1907">1907</option>
														<option value="1908">1908</option>
														<option value="1909">1909</option>
														<option value="1910">1910</option>
														<option value="1911">1911</option>
														<option value="1912">1912</option>
														<option value="1913">1913</option>
														<option value="1914">1914</option>
														<option value="1915">1915</option>
														<option value="1916">1916</option>
														<option value="1917">1917</option>
														<option value="1918">1918</option>
														<option value="1919">1919</option>
														<option value="1920">1920</option>
														<option value="1921">1921</option>
														<option value="1922">1922</option>
														<option value="1923">1923</option>
														<option value="1924">1924</option>
														<option value="1925">1925</option>
														<option value="1926">1926</option>
														<option value="1927">1927</option>
														<option value="1928">1928</option>
														<option value="1929">1929</option>
														<option value="1930">1930</option>
														<option value="1931">1931</option>
														<option value="1932">1932</option>
														<option value="1933">1933</option>
														<option value="1934">1934</option>
														<option value="1935">1935</option>
														<option value="1936">1936</option>
														<option value="1937">1937</option>
														<option value="1938">1938</option>
														<option value="1939">1939</option>
														<option value="1940">1940</option>
														<option value="1941">1941</option>
														<option value="1942">1942</option>
														<option value="1943">1943</option>
														<option value="1944">1944</option>
														<option value="1945">1945</option>
														<option value="1946">1946</option>
														<option value="1947">1947</option>
														<option value="1948">1948</option>
														<option value="1949">1949</option>
														<option value="1950">1950</option>
														<option value="1951">1951</option>
														<option value="1952">1952</option>
														<option value="1953">1953</option>
														<option value="1954">1954</option>
														<option value="1955">1955</option>
														<option value="1956">1956</option>
														<option value="1957">1957</option>
														<option value="1958">1958</option>
														<option value="1959">1959</option>
														<option value="1960">1960</option>
														<option value="1961">1961</option>
														<option value="1962">1962</option>
														<option value="1963">1963</option>
														<option value="1964">1964</option>
														<option value="1965">1965</option>
														<option value="1966">1966</option>
														<option value="1967">1967</option>
														<option value="1968">1968</option>
														<option value="1969">1969</option>
														<option value="1970">1970</option>
														<option value="1971">1971</option>
														<option value="1972">1972</option>
														<option value="1973">1973</option>
														<option value="1974">1974</option>
														<option value="1975">1975</option>
														<option value="1976">1976</option>
														<option value="1977">1977</option>
														<option value="1978">1978</option>
														<option value="1979">1979</option>
														<option value="1980">1980</option>
														<option value="1981">1981</option>
														<option value="1982">1982</option>
														<option value="1983">1983</option>
														<option value="1984">1984</option>
														<option value="1985">1985</option>
														<option value="1986">1986</option>
														<option value="1987">1987</option>
														<option value="1988">1988</option>
														<option value="1989">1989</option>
														<option value="1990">1990</option>
														<option value="1991">1991</option>
														<option value="1992">1992</option>
														<option value="1993">1993</option>
														<option value="1994">1994</option>
														<option value="1995">1995</option>
														<option value="1996">1996</option>
														<option value="1997">1997</option>
														<option value="1998" selected="selected">1998</option>
														<option value="1999">1999</option>
														<option value="2000">2000</option>
														<option value="2001">2001</option>
														<option value="2002">2002</option>
														<option value="2003">2003</option>
														<option value="2004">2004</option>
													</select>
						</li>
						<li class="sec">
							<p class="select_tit">월</p>
							<select name="m_birth_M" id="m_birth_M" title="월" class="select_box">
														<option value="1">1</option>
														<option value="2">2</option>
														<option value="3">3</option>
														<option value="4">4</option>
														<option value="5">5</option>
														<option value="6">6</option>
														<option value="7">7</option>
														<option value="8">8</option>
														<option value="9">9</option>
														<option value="10">10</option>
														<option value="11">11</option>
														<option value="12">12</option>
													</select>
						</li>
						<li>
							<p class="select_tit">일</p>
							<select name="m_birth_D" id="m_birth_D" title="일" class="select_box">
																<option value="1">1</option>
														<option value="2">2</option>
														<option value="3">3</option>
														<option value="4">4</option>
														<option value="5">5</option>
														<option value="6">6</option>
														<option value="7">7</option>
														<option value="8">8</option>
														<option value="9">9</option>
														<option value="10">10</option>
														<option value="11">11</option>
														<option value="12">12</option>
														<option value="13">13</option>
														<option value="14">14</option>
														<option value="15">15</option>
														<option value="16">16</option>
														<option value="17">17</option>
														<option value="18">18</option>
														<option value="19">19</option>
														<option value="20">20</option>
														<option value="21">21</option>
														<option value="22">22</option>
														<option value="23">23</option>
														<option value="24">24</option>
														<option value="25">25</option>
														<option value="26">26</option>
														<option value="27">27</option>
														<option value="28">28</option>
														<option value="29">29</option>
														<option value="30">30</option>
														<option value="31">31</option>
													</select>
						</li>
					</ul>
				</div>
			</td>
		</tr>
	</tbody>
	</table>

	<div class="btn_w">
		<input type="button" value="다음단계" class="con_btn sky fr" id="jsBtnNext4">
		<input type="button" value="이전단계" class="con_btn mint fl jsBtnPrev">
	</div>


</div>

<div class="jsMember" style="display:none;">

	<table summary="회원 국가, 시/도, 구/군 입력 폼 테이블입니다." class="table3">
	<caption>회원 국가, 시/도, 구/군 입력</caption>
	<colgroup>
		<col width="50%">
		<col width="50%">
	</colgroup>
	<tbody>
		<tr>
			<td colspan="2">
				<dl>
					<dt><label for="m_area1">국가</label></dt>
					<dd>
						<select name="m_area1" id="m_area1" title="국가" class="select_box">
							<option value="">::선택하세요::</option>
													<option value="대한민국">대한민국</option>
												</select>
					</dd>
				</dl>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<dl>
					<dt><label for="m_area2">시/도</label></dt>
					<dd>
						<select name="m_area2" id="m_area2" title="시/도" class="select_box">
							<option value="">::선택하세요::</option>
						</select>
					</dd>
				</dl>
			</td>
		</tr>		
	</tbody>
	</table>

	<div class="btn_w">
		<input type="button" value="다음단계" class="con_btn sky fr" id="jsBtnNext5">
		<input type="button" value="이전단계" class="con_btn mint fl jsBtnPrev">
	</div>


</div>



<div class="jsMember" style="display:none;">
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
					<dt><label for="m_email1">이메일주소</label></dt>
					<dd>
						<div class="email">
							<ul>
								<li><input id="m_email1" name="m_email1" type="text" class="input_box"></li>
								<li class="hyphen">@</li>
								<li>
									<select name="m_email2" id="m_email2" title="이메일 주소" class="select_box">
										<option value="">직접입력</option>
										<option value="naver.com">naver.com</option>
										<option value="daum.net">daum.net</option>
										<option value="hanmail.net">hanmail.net</option>
										<option value="nate.com">nate.com</option>
										<option value="empas.com">empas.com</option>
										<option value="gmail.com">gmail.com</option>

									</select>
								</li>
							</ul>
						</div>
					</dd>
				</dl>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<dl>
					<dt><label for="m_email">이메일 주소 확인</label><span style="font-size:11px; color:#b33336;" id="jsNoticeEmail">&nbsp;&nbsp;(이메일 도메인을 직접입력하세요.)</span></dt>
					<dd><input id="m_email" name="m_email" type="text" class="input_box"></dd>
				</dl>
			</td>
		</tr>
	</tbody>
	</table>

	<div class="btn_w">
		<input type="submit" value="회원가입완료" class="con_btn sky fr">
		<input type="button" value="이전단계" class="con_btn mint fl jsBtnPrev">
	</div>
</div>





</form>

	</div>
</div>
<!--//내용영역-->

				</div>
			</div>
			<!--//컨텐츠영역-->
		</div>
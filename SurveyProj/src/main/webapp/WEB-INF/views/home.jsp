<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/style_home.css">
<!--중간영역-->
        <div id="container" class="main">

            <div class="main_top">                
                <div class="top_roll">
                    <div class="main_roll owl-carousel owl-theme owl-loaded owl-drag">
                        
                        
                        
                       
                    <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-444px, 0px, 0px); transition: 0s; width: 1554px;"><div class="owl-item cloned" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=2&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/main_banner_01.jpg" alt="30일 연속 출석 이벤트" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=10&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/main_banner_02.jpg" alt="친구 추천 이벤트" width="100%"></a></div></div><div class="owl-item active" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=8&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/roll_img01.jpg" alt="회원가입만 해도 500포인트 바로증정" width="100%"></a></div></div><div class="owl-item" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=2&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/main_banner_01.jpg" alt="30일 연속 출석 이벤트" width="100%"></a></div></div><div class="owl-item" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=10&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/main_banner_02.jpg" alt="친구 추천 이벤트" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=8&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/roll_img01.jpg" alt="회원가입만 해도 500포인트 바로증정" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px;"><div><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=2&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner3/main_banner_01.jpg" alt="30일 연속 출석 이벤트" width="100%"></a></div></div></div></div><div class="owl-nav"><div class="owl-prev">prev</div><div class="owl-next">next</div></div><div class="owl-dots" style="margin-left: 11px;"><div class="owl-dot active"><span></span></div><div class="owl-dot"><span></span></div><div class="owl-dot"><span></span></div></div></div>
					<div class="control" style="margin-left: -9px;">
						<span class="stop"></span> 
						<span class="play" style="display:none;"></span>
					</div>
                </div>
				<script>
					$(document).ready(function() {
					  var owl = $('.main_roll');
					  owl.owlCarousel({
						margin: 0,
						nav: true,
						loop: true,
						autoplay: true,
						autoplayTimeout: 3000,
						autoplayHoverPause: true,
						responsive: {
						  0: {
							items: 1
						  },
						  600: {
							items: 1
						  },
						  1000: {
							items: 1
						  }
						}
					  });
					  $('.play').on('click',function(){
							$('.stop').css('display','block');
							$('.play').css('display','none');
							owl.trigger('play.owl.autoplay',[1000])
						})
						$('.stop').on('click',function(){
							$('.play').css('display','block');
							$('.stop').css('display','none');
							owl.trigger('stop.owl.autoplay')
						})
					})
				  </script>

				


                                        <!-- 로그인 전 -->
                        <div class="top_login">

                            <script type="text/javascript">
                                function main_login_ok() {
                                    with(document.getElementById("main_login")) {
                                        if (CheckSpaces(m_id, "아이디")) {
                                        return false;
                                        } else if (CheckSpaces(m_pwd, "비밀번호")) {
                                       return false;
                                        }
                                    }


                                }
                            </script>

                            
                                <form name="main_login" id="main_login" method="post" action="https://www.panel-queen.com:7458/content/member/login_ok.php" onsubmit="javascript: return main_login_ok();">
                                <div class="log_wrap">

                                    <div class="log_write">
                                        <ul>
                                            <li><input type="text" class="log_id txt_input" title="아이디를 입력하세요" id="log_id" name="m_id" value=""><label for="log_id" style="display: block;">아이디를 입력하세요</label></li>
                                            <li><input type="password" class="log_pw txt_input" title="비밀번호를 입력하세요" id="log_pw" name="m_pwd"><label for="log_pw">비밀번호를 입력하세요</label></li>
                                        </ul>
                                    </div>
                                    <div class="log_btn">
                                        <button type="submit" class="log_btn">로그인</button>
                                    </div>

                                </div>
                                <div class="log_info">
                                    <input type="checkbox" name="chk_save" id="saveid" value="Y"><label for="saveid">아이디 저장</label>
                                </div>
                                </form>

                                <div class="log_link">
                                    <p class="link01"><a href="http://www.panel-queen.com/content/10_01.php">아이디/비밀번호찾기</a></p>
                                    <p class="link02"><a href="http://www.panel-queen.com/content/09_01.php">회원가입</a></p>
                                </div>
                        </div>

                        <script type="text/javascript">
                            $(function() {
                                $(".txt_input").each(function() {
                                    if ($(this).val() != "") $("label[for='" + $(this).attr("id") + "']").hide();
                                }).focus(function() {
                                    $("label[for='" + $(this).attr("id") + "']").hide();
                                }).blur(function() {
                                    if ($(this).val() == "") $("label[for='" + $(this).attr("id") + "']").show();
                                });
                            });
                        </script>

                        <!--// 로그인 전 -->
                        

            </div>


            <!--조사 영역-->
            <div class="mservice">
                <div class="mservice_wrap">
                    <div class="mservice_list">
                        <div class="mservice_owl owl-carousel owl-theme owl-loaded owl-drag">


                            

                            

                            

                            

                            

                            

                            
                        <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-2240px, 0px, 0px); transition: 0s; width: 4800px;"><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=209" class="icon03">
                                    <p class="tit">지역 생활환경에 관한 설문조사<!-- <span></span> --></p>
                                    <p class="point">50P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=208" class="icon03">
                                    <p class="tit">블로그 사용에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">50P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=207" class="icon31">
                                    <p class="tit">생활방식에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">150P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=180" class="icon29">
                                    <p class="tit">건강상태에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">220P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=178" class="icon03">
                                    <p class="tit">기본속성조사<!-- <span></span> --></p>
                                    <p class="point">210P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=212" class="icon03">
                                    <p class="tit">택배에 대한 설문조사<!-- <span></span> --></p>
                                    <p class="point">100P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=211" class="icon03">
                                    <p class="tit">브랜드에 관한 설문조사<!-- <span></span> --></p>
                                    <p class="point">120P</p>
                                </a>
                            </div></div><div class="owl-item active" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=209" class="icon03">
                                    <p class="tit">지역 생활환경에 관한 설문조사<!-- <span></span> --></p>
                                    <p class="point">50P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=208" class="icon03">
                                    <p class="tit">블로그 사용에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">50P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=207" class="icon31">
                                    <p class="tit">생활방식에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">150P</p>
                                </a>
                            </div></div><div class="owl-item" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=180" class="icon29">
                                    <p class="tit">건강상태에 관한 조사<!-- <span></span> --></p>
                                    <p class="point">220P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=178" class="icon03">
                                    <p class="tit">기본속성조사<!-- <span></span> --></p>
                                    <p class="point">210P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=212" class="icon03">
                                    <p class="tit">택배에 대한 설문조사<!-- <span></span> --></p>
                                    <p class="point">100P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=211" class="icon03">
                                    <p class="tit">브랜드에 관한 설문조사<!-- <span></span> --></p>
                                    <p class="point">120P</p>
                                </a>
                            </div></div><div class="owl-item cloned" style="width: 295px; margin-right: 25px;"><div class="item">
                                <a href="http://www.panel-queen.com/content/01_01.php?proc_type=view&amp;b_num=209" class="icon03">
                                    <p class="tit">지역 생활환경에 관한 설문조사<!-- <span></span> --></p>
                                    <p class="point">50P</p>
                                </a>
                            </div></div></div></div><div class="owl-nav"><div class="owl-prev">prev</div><div class="owl-next">next</div></div><div class="owl-dots" style="margin-left: 11px;"><div class="owl-dot"><span></span></div><div class="owl-dot"><span></span></div><div class="owl-dot"><span></span></div><div class="owl-dot active"><span></span></div><div class="owl-dot"><span></span></div><div class="owl-dot"><span></span></div><div class="owl-dot"><span></span></div></div></div>
                    </div>
                </div>
            </div>

            <script>
			$(document).ready(function() {
			  var owl = $('.mservice_owl');
			  owl.owlCarousel({
				margin: 25,
				nav: true,
				loop: true,
				autoplay: true,
				autoplayTimeout: 3000,
				autoplayHoverPause: true,
				responsive: {
				  0: {
					items: 1
				  },
				  767: {
					items: 3
				  },
				  1000: {
					items: 3
				  }
				}
			  });
			  
			})
		  </script>
            <!--//조사 영역-->

            <!--베너 영역-->
            <div class="bottom_roll">
                <div class="roll_wrap">
                    <div class="roll_list">
                        <div class="bottom_ban owl-carousel owl-theme owl-loaded owl-drag">

                        
                        
                            


                        <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-756px, 0px, 0px); transition: 0s; width: 1512px;"><div class="owl-item cloned" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=4&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner01.jpg" alt="행운왕" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=10&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner02.jpg" alt="친구추천왕" width="100%"></a></div></div><div class="owl-item" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=4&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner01.jpg" alt="행운왕" width="100%"></a></div></div><div class="owl-item active" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=10&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner02.jpg" alt="친구추천왕" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=4&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner01.jpg" alt="행운왕" width="100%"></a></div></div><div class="owl-item cloned" style="width: 222px; margin-right: 30px;"><div class="item"><a href="http://www.panel-queen.com/content/06_01.php?proc_type=view&amp;a_num=11553123&amp;b_num=10&amp;rtn_url=%2Fcontent%2F06_01.php" target="_blank"><img src="http://www.panel-queen.com/data/banner/banner02.jpg" alt="친구추천왕" width="100%"></a></div></div></div></div><div class="owl-nav"><div class="owl-prev">prev</div><div class="owl-next">next</div></div><div class="owl-dots" style="margin-left: 11px;"><div class="owl-dot"><span></span></div><div class="owl-dot active"><span></span></div></div></div>
						<div class="control" style="margin-left: -9px;">
							<span class="stop"></span> 
							<span class="play" style="display:none;"></span>
						</div>
                    </div>
                </div>
            </div>

            <script>
				$(document).ready(function() {
				  var owl = $('.bottom_ban');
				  owl.owlCarousel({
					margin: 30,
					nav: true,
					loop: true,
					autoplay: true,
					autoplayTimeout: 3000,
					autoplayHoverPause: true,
					responsive: {
					  0: {
						items: 1
					  },
					  600: {
						items: 2
					  },
					  1000: {
						items: 2
					  }
					}
				  });
				  $('.play').on('click',function(){
						$('.stop').css('display','block');
						$('.play').css('display','none');
						owl.trigger('play.owl.autoplay',[1000])
					})
					$('.stop').on('click',function(){
						$('.play').css('display','block');
						$('.stop').css('display','none');
						owl.trigger('stop.owl.autoplay')
					});
					//갯수
					var obj = $('.bottom_ban').children('.owl-dots').offset();
					var owl_width = $('.bottom_ban').children('.owl-dots').innerWidth();
					var docu_width = $('body').innerWidth();

					$(".control").css("margin-left", -(owl_width/2));
					$(".owl-dots").css("margin-left", -(owl_width/2)+20);

				})
			  </script>
            <!--//베너 영역-->



        </div>
        <!--//중간영역-->


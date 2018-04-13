<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko"><head>

	<title>설문조사사이트 패널퀸</title>
	
	

<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/all.css"> -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/head_layout.css"> -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/foot_layout.css"> -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/main_layout.css"> -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/menu_bubble.css"> -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/menu_bubble_r.css">	 -->
<!-- 	<link rel="stylesheet" type="text/css" href="http://www.panel-queen.com/common/css/owl.carousel.min.css"> -->

	
	
	
	
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>



	<div id="wrapper">
	<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="content" />
<tiles:insertAttribute name="footer" />
	</div>



<!-- AceCounter Log Gathering Script V.7.5.2017020801 -->
<script language="javascript">
	var _AceGID=(function(){var Inf=['gtp9.acecounter.com','8080','AH4A42062872508','AW','0','NaPm,Ncisy','ALL','0']; var _CI=(!_AceGID)?[]:_AceGID.val;var _N=0;var _T=new Image(0,0);if(_CI.join('.').indexOf(Inf[3])<0){ _T.src =( location.protocol=="https:"?"https://"+Inf[0]:"http://"+Inf[0]+":"+Inf[1]) +'/?cookie'; _CI.push(Inf);  _N=_CI.length; } return {o: _N,val:_CI}; })();
	var _AceCounter=(function(){var G=_AceGID;var _sc=document.createElement('script');var _sm=document.getElementsByTagName('script')[0];if(G.o!=0){var _A=G.val[G.o-1];var _G=(_A[0]).substr(0,_A[0].indexOf('.'));var _C=(_A[7]!='0')?(_A[2]):_A[3];var _U=(_A[5]).replace(/\,/g,'_');_sc.src=(location.protocol.indexOf('http')==0?location.protocol:'http:')+'//cr.acecounter.com/Web/AceCounter_'+_C+'.js?gc='+_A[2]+'&py='+_A[4]+'&gd='+_G+'&gp='+_A[1]+'&up='+_U+'&rd='+(new Date().getTime());_sm.parentNode.insertBefore(_sc,_sm);return _sc.src;}})();
</script>
<noscript>&lt;img src='http://gtp9.acecounter.com:8080/?uid=AH4A42062872508&amp;je=n&amp;' border='0' width='0' height='0' alt=''&gt;</noscript>	
<!-- AceCounter Log Gathering Script End -->






</body></html>
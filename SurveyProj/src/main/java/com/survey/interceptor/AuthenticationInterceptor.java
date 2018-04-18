package com.survey.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter{

	
	// 而⑦듃濡ㅻ윭�뿉 �젒洹쇳븯湲� �쟾�뿉 癒쇱� �떎�뻾�릺�뒗 硫붿꽌�뱶
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("authUser");
//		System.out.println(obj.toString());
		boolean auth = true;
		
//		if (obj == null) {
//			System.out.println("무조건 널이징?");
//			auth = false;
//			response.sendRedirect("/");
//		}
		
		return auth;
	}

	// 而⑦듃濡ㅻ윭 �닔�뻾 �썑 �솕硫댁뿉 寃곌낵媛� 肉뚮젮吏�湲곗쟾�뿉 嫄곗퀜媛��뒗 硫붿꽌
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	
}



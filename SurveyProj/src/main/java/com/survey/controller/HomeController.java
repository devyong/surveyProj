package com.survey.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.survey.domain.MemberVO;
import com.survey.service.MemberService;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	MemberService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
				
		return "home.home";
	}
	
//	@RequestMapping(value = "/login", method=RequestMethod.GET)
//	public void loginGET(@ModelAttribute("member") MemberVO member) {
//	
//	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String loginPOST(MemberVO member, HttpSession session, Model model) {
		
		MemberVO user = service.login(member);
		logger.info("결과 : " + user.toString());
		if( user == null) {
			return "redirect:/";
		}
		
		session.setAttribute("memberVO", user);
		
		return "redirect:/content/list";
	}
	
	@RequestMapping(value="/logout", method= {RequestMethod.GET, RequestMethod.POST})
	public String logout(MemberVO member, HttpSession session) {
		
		session.removeAttribute("memberVO");
				
		return "redirect:/";
		
		/*
		MemberVO user = service.login(member);
		
		if( user != null) {
			session.removeAttribute("memberVO");
			return "redirect:/";
		}
		
		return "redirect:/content/list";
		*/
	}
}

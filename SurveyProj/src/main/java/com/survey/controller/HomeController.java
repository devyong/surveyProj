package com.survey.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.survey.domain.MemberVO;
import com.survey.service.MemberService;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "home.home";
	}
	
	
	@RequestMapping(value = "/", method=RequestMethod.POST)
	public String login(MemberVO member, Model model, HttpSession session) {
		String returnURL = "";
		
		MemberVO user = service.login(member);
		
		if (user == null) {
			logger.info("fail... return home");
			returnURL = "home.home";
		} else {
			session.setAttribute("authUser", user);
			returnURL = "redirect:/content/list";
		}
		
		return returnURL;
	}
	

	

}

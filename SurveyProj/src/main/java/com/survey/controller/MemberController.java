package com.survey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	private final static Logger logger = LoggerFactory.getLogger(MemberController.class);
	

	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinPage(Model model) {
		logger.info("Member Join Page..........");
		
		
		return "member.join";
	}
}

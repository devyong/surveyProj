package com.survey.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.survey.domain.MemberVO;
import com.survey.service.MemberService;

@Controller
public class MemberController {

	private final static Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;

	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinPage(Model model) {
		logger.info("Member Join Page..........");
		
		
		return "member.join";
	}

	
	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String join(Model model, MemberVO member) {
		service.join(member);
		
		// ?öå?õêÍ∞??ûÖ ?õÑ Î°úÍ∑∏?ù∏ ?éò?ù¥Ïß?Î°?
		return "redirect:/";
	}
}

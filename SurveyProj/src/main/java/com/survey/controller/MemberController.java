package com.survey.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.util.JSONPObject;
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
		logger.info("member join ~");
		service.join(member);
		
		// 회원가입 후 로그인 페이지로
		return "redirect:/";
	}
	
	@RequestMapping(value = "/member/checkid", method = RequestMethod.GET)
	public String checkid(Model model,@RequestParam("id") String id) {
		logger.info("member id checking...! check_id : " + id);
		
		String result = "";
		// 아이디 있는지 비교
		MemberVO member = service.checkid(id);
		if (member == null) {
			result = "가능";
		} else {
			result = "불가";
		}
		// 결과값 모델에 적용
		
		
		model.addAttribute("data", result);
		
		
		return "ajax.ajax";
	}
}

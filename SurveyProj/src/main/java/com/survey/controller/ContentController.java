package com.survey.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;
import com.survey.domain.MemberVO;
import com.survey.persistence.SurveyService;
import com.survey.service.EnterTitleService;

@Controller
public class ContentController {
	
	@Inject
	private SurveyService service;
	

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	

	@RequestMapping(value="/content/list", method = RequestMethod.GET)
	public String listPage(Model model) {
		logger.info("Content List Page..........");
		
		
		return "content.list";
	}
	
	

	@RequestMapping(value="/content/read/{sv_id}", method=RequestMethod.GET)
	public String readPage(@PathVariable("sv_id") int sv_id, Model model) throws Exception {
		logger.info("Content Read Page..........");
		model.addAttribute(service.read(sv_id));
		
		return "content.read";
	}
	

	@Autowired
	EnterTitleService etservice;
	
	@RequestMapping(value = "/content/enter", method = RequestMethod.GET)
	public String enterPage(Model model, EnterTitleVO enter
			, EnterListVO enterList,HttpSession session
			) throws Exception {
		
		MemberVO memberVO = (MemberVO) session.getAttribute("authUser");
		memberVO.getM_id();
		
		
		logger.info("Content Enter Page.........."+enter.getSv_id());
		
		EnterTitleVO enterTitleVO = etservice.enterTitle(enter);
		model.addAttribute("enterTitleVO",enterTitleVO);
		
		List<EnterListVO> enterListVO =  etservice.enterList(enter.getSv_id());
		model.addAttribute("enterListVO",enterListVO);
		
		return "content.enter";
	}
	
	@RequestMapping(value = "/content/enter", method = RequestMethod.POST)
	public String postEnterpage(Model model, EnterTitleVO enter,EnterListVO enterList,HttpSession session ) throws Exception{
		
		MemberVO memberVO = (MemberVO) session.getAttribute("authUser");
		memberVO.getM_id();
		
		EnterTitleVO enterTitleVO = etservice.enterTitle(enter);
		model.addAttribute("enterTitleVO",enterTitleVO);
		
		List<EnterListVO> enterListVO =  etservice.enterList(enter.getSv_id());
		model.addAttribute("enterListVO",enterListVO);
		
		return "content.enter";
	}
	
	
	@RequestMapping(value="/content/modify", method=RequestMethod.GET)
	public String modifyPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.modify";
	}
}

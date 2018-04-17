package com.survey.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.survey.service.SurveyResultService;
import com.survey.service.SurveyService;

@Controller
public class ContentController {
	
	@Inject
	private SurveyService sService;
	
	@Inject
	private SurveyResultService sRService;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	

	@RequestMapping(value="/content/list", method=RequestMethod.GET)
	public String listPage(Model model) {
		logger.info("Content List Page..........");
		
		
		return "content.list";
	}
	
	

	@RequestMapping(value="/content/read/{sv_id}", method=RequestMethod.GET)
	public String readPage(@PathVariable("sv_id") int sv_id, Model model) throws Exception {
		logger.info("Content Read Page..........");
				
//		String m_id = "kim@naver.com";
		String m_id = "han@naver.com";
		
//		String m_id = session.Member.getM_id();
		
		model.addAttribute(sService.read(sv_id));
		
//		logger.info("srservice 들가기전");
		
		
		Integer isParticipate = sRService.isParticipate(sv_id, m_id);
		if (isParticipate != null) {
			model.addAttribute("isParticipate", isParticipate);
		} 
		
//		logger.info("srservice 나옴");
//		
//		logger.info("isparticipate 저장전");
//		logger.info("isparticipate 저장");
		
		return "content.read";
	}
	

	@RequestMapping(value="/content/enter", method=RequestMethod.GET)
	public String enterPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.enter";
	}
}

package com.survey.controller;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		try {
			model.addAttribute("list", sService.listSurvey());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return "content.list";
	}
	
	

	@RequestMapping(value="/content/read/{sv_id}", method=RequestMethod.GET)
	public String readPage(@PathVariable("sv_id") int sv_id, Model model) throws Exception {
		logger.info("Content Read Page..........");
				
		String m_id = "han@naver.com";
		
//		String m_id = session.Member.getM_id();
		sService.addCount(sv_id);
		model.addAttribute(sService.read(sv_id));
		
		Integer isParticipate = sRService.isParticipate(sv_id, m_id);
		if (isParticipate != null) {
			model.addAttribute("isParticipate", isParticipate);
		} 
		
		return "content.read";
	}
	

	@RequestMapping(value="/content/enter", method=RequestMethod.GET)
	public String enterPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.enter";
	}

	@RequestMapping(value="/content/result/{sv_id}", method=RequestMethod.GET)
	public String resultPage(@PathVariable("sv_id") int sv_id, Model model) {
		logger.info("Content Result Page..........");
		try {
			model.addAttribute(sService.read(sv_id));
			
			model.addAttribute("total", sRService.listTotal(sv_id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "content.result";
	}	
	
}

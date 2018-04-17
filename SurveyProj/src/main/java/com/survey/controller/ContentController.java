package com.survey.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.survey.persistence.SurveyService;

@Controller
public class ContentController {
	
	@Inject
	private SurveyService service;
	

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	

	@RequestMapping(value="/content/list", method=RequestMethod.GET)
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
	

	@RequestMapping(value="/content/enter", method=RequestMethod.GET)
	public String enterPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.enter";
	}
}

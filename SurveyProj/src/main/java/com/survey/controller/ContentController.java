package com.survey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContentController {

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	

	@RequestMapping(value="/content/list", method=RequestMethod.GET)
	public String listPage(Model model) {
		logger.info("Content List Page..........");
		
		
		return "content.list";
	}
	
	

	@RequestMapping(value="/content/read", method=RequestMethod.GET)
	public String readPage(@RequestParam("sv_id") int sv_id, Model model) {
		logger.info("Content Read Page..........");
		
		
		return "content.read";
	}
	

	@RequestMapping(value="/content/enter", method=RequestMethod.GET)
	public String enterPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.enter";
	}
}

package com.survey.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home.home";
	}
	
	
	// Test
	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinPage(Model model) {
		logger.info("Member Join Page..........");
		
		
		return "member.join";
	}
	
	// Test
	@RequestMapping(value="/content/list", method=RequestMethod.GET)
	public String listPage(Model model) {
		logger.info("Content List Page..........");
		
		
		return "content.list";
	}
	
	
	// Test
	@RequestMapping(value="/content/read", method=RequestMethod.GET)
	public String readPage(Model model) {
		logger.info("Content Read Page..........");
		
		
		return "content.read";
	}
	
	// Test
	@RequestMapping(value="/content/enter", method=RequestMethod.GET)
	public String enterPage(Model model) {
		logger.info("Content Enter Page..........");
		
		
		return "content.enter";
	}
}

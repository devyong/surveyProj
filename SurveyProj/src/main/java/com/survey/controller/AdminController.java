package com.survey.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.survey.domain.SurveyListVO;
import com.survey.domain.SurveyVO;
import com.survey.service.AdminService;

@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Inject
	AdminService service;
	
	
	@RequestMapping(value = "/admin/register", method = RequestMethod.GET)
	public String register(Model model) {
		logger.info("admin register !!!!");
		
		return "admin.register";
	}
	
	@RequestMapping(value = "/admin/register", method = RequestMethod.POST)
	public String registerSubmit(RedirectAttributes rttr , String sv_title
			, @RequestParam("list_content") String[] list_content
			, @RequestParam("sv_enddate") String sv_enddate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		SurveyVO survey = new SurveyVO();
		
		try {
			survey.setSv_title(sv_title);
			survey.setSv_enddate(sdf.parse(sv_enddate));
		} catch (ParseException e) {
			logger.info("enddate error !!!!");
			e.printStackTrace();
		}
		
		
		List<SurveyListVO> list = new ArrayList<>();
		for (int i = 0; i < list_content.length; i++) {
			SurveyListVO svList = new SurveyListVO();
			svList.setList_content(list_content[i]);
			list.add(svList);
		}
		
		
		service.addSurvey(survey, list);
		
		rttr.addFlashAttribute("result", "success");
		
		return "redirect:/content/list";
	}
}

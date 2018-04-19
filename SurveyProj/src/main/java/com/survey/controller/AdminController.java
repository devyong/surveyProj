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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.survey.domain.SurveyAndListVO;
import com.survey.domain.SurveyListVO;
import com.survey.domain.SurveyVO;
import com.survey.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Inject
	AdminService service;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		logger.info("admin register !!!!");
		
		return "admin.register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerSubmit(RedirectAttributes rttr ,@RequestParam("sv_title") String sv_title
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
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String adminModify(int sv_id, Model model) {
		// sv_id에 해당하는 타이틀 및 값 불러오기
		logger.info("관리자가 수정 페이지 불러오기");
		
		
		List<SurveyAndListVO> andList =  service.getSurveyContent(sv_id);
		
		model.addAttribute("andList", andList);
		
		return "admin.modify";
	}
}

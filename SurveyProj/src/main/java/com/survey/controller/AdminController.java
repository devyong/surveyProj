package com.survey.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	
	
	// 수정하기 버튼 눌렀을 때
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String adminModifyPost(@RequestParam("list_content") String[] list_content, @RequestParam("list_id") int[] list_id
			, String sv_title, String sv_enddate, int sv_id
			, Model model) {

		System.out.println(sv_id);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = sdf.parse(sv_enddate);
		} catch (ParseException e) {
			System.out.println("날짜 변환중 오류@@");
			e.printStackTrace();
		}
		
		List<SurveyAndListVO> andList = new ArrayList<>();
		for (int i = 0; i < list_content.length; i++) {
			SurveyAndListVO vo = new SurveyAndListVO();
			vo.setSv_title(sv_title);
			vo.setSv_enddate(date);
			vo.setList_content(list_content[i]);
			vo.setSv_id(sv_id);
			vo.setList_id(list_id[i]);
			
			andList.add(vo);
		}
		
		service.modifySurveyAndList(andList);

		return "redirect:/content/list";
	}
}

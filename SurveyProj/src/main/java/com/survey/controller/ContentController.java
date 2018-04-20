package com.survey.controller;


import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;
import com.survey.domain.MemberVO;
import com.survey.domain.SurveyResultVO;
import com.survey.service.EnterTitleService;
import com.survey.service.SurveyResultService;
import com.survey.service.SurveyService;

@Controller
public class ContentController {

	@Inject
	private SurveyService sService;
	
	@Inject
	private SurveyResultService sRService;
	

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	

	@RequestMapping(value="/content/list", method = RequestMethod.GET)
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
	public String readPage(@PathVariable("sv_id") int sv_id, Model model, HttpSession session) throws Exception {
		
		MemberVO member = (MemberVO) session.getAttribute("authUser");
		String m_id = member.getM_id();

		logger.info("Content Read Page.........." + m_id + sv_id);
		sService.addCount(sv_id);
		model.addAttribute(sService.read(sv_id));
		
		
		Integer isParticipate = sRService.isParticipate(sv_id, m_id);
		if (isParticipate != null) {
			model.addAttribute("isParticipate", isParticipate);
		} 

			
		return "content.read";
	}	
	
	@Autowired
	EnterTitleService etservice;
	
	@RequestMapping(value = "/content/enter", method = RequestMethod.GET)
	public String enterPage(Model model, EnterTitleVO enter
			, EnterListVO enterList, HttpSession session
			) throws Exception {

		//MemberVO memberVO = (MemberVO) session.getAttribute("authUser");
		//memberVO.getM_id();
		
		logger.info("Content Enter Page.........."+enter.getSv_id());
		
		EnterTitleVO enterTitleVO = etservice.enterTitle(enter);
		model.addAttribute("enterTitleVO",enterTitleVO);
		
		List<EnterListVO> enterListVO =  etservice.enterList(enter.getSv_id());
		model.addAttribute("enterListVO",enterListVO);
		
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
	
	@RequestMapping(value = "/content/enter", method = RequestMethod.POST)
	public String postEnterpage(Model model, SurveyResultVO srvo, HttpSession session, int sv_id) throws Exception{
		MemberVO member = (MemberVO) session.getAttribute("authUser");
		srvo.setM_id(member.getM_id());
		etservice.resultInsert(srvo);
		
		
		return "redirect:/content/result/" + sv_id;
	}
	
	
	@RequestMapping(value="/content/modify", method=RequestMethod.GET)
	public String modifyPage(Model model, EnterTitleVO enter
			, EnterListVO enterList, SurveyResultVO srvo, HttpSession session) throws Exception {
		logger.info("Content Enter Page..........");
		
		EnterTitleVO enterTitleVO = etservice.enterTitle(enter);
		model.addAttribute("enterTitleVO",enterTitleVO);
		
		List<EnterListVO> enterListVO =  etservice.enterList(enter.getSv_id());
		model.addAttribute("enterListVO",enterListVO);
		
		SurveyResultVO srvovo = etservice.selectEList(srvo);
		model.addAttribute("srvovo",srvovo);
		
		return "content.modify";
	}
	
	@RequestMapping(value="/content/modify", method=RequestMethod.POST)
	public String modifyPOST(Model model, SurveyResultVO srvo, int sv_id ) throws Exception {
		
		logger.info("modify POST  list_id : " + srvo.getList_id());
		
		logger.info("modify POST  result_id : " + srvo.getResult_id());
		
		
		etservice.resultUpdate(srvo);
		
		return "redirect:/content/result/" + sv_id;
	}
}

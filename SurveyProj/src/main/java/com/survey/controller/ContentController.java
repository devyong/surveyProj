package com.survey.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

	@RequestMapping(value = "/content/enter", method = RequestMethod.POST)
	public String postEnterpage(Model model, SurveyResultVO srvo ) throws Exception{
		
		etservice.resultInsert(srvo);
		
		
		return "redirect:list";
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
	public String modifyPOST(Model model, SurveyResultVO srvo ) throws Exception {
		
		logger.info("modify POST  list_id : " + srvo.getList_id());
		
		logger.info("modify POST  result_id : " + srvo.getResult_id());
		
		
		etservice.resultUpdate(srvo);
		
		return "redirect:list";
	}
	
}

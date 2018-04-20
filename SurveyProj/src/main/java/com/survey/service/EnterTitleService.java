package com.survey.service;

import java.util.List;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;
import com.survey.domain.SurveyResultVO;

public interface EnterTitleService {
	public EnterTitleVO enterTitle(EnterTitleVO enterTitle) throws Exception;
	
	public List<EnterListVO> enterList(int sv_id) throws Exception;
	
	public void resultInsert(SurveyResultVO srvo ) throws Exception;
	
	public SurveyResultVO resultUpdate(SurveyResultVO srvo)throws Exception;
	
	public SurveyResultVO selectEList(SurveyResultVO srvo) throws Exception;
	
}

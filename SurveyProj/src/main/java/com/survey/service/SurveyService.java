package com.survey.service;

import java.util.List;

import com.survey.domain.SurveyVO;

public interface SurveyService {
	public SurveyVO read(Integer sv_id) throws Exception;
	
	public List<SurveyVO> listSurvey() throws Exception;
	
	public void addCount(Integer sv_id) throws Exception;
}

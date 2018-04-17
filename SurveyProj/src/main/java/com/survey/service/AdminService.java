package com.survey.service;

import java.util.List;

import com.survey.domain.SurveyListVO;
import com.survey.domain.SurveyVO;

public interface AdminService {
	public void addSurvey(SurveyVO survey, List<SurveyListVO> list);
	
}

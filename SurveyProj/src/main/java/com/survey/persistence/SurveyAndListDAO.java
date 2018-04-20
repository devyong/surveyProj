package com.survey.persistence;

import java.util.List;

import com.survey.domain.SurveyAndListVO;

public interface SurveyAndListDAO {

	public List<SurveyAndListVO> selectSurveyAndList(int sv_id);
	
	public void updateSurveyAndList(List<SurveyAndListVO> andList);
}

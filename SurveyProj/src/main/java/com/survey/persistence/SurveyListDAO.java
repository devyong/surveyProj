package com.survey.persistence;

import java.util.List;

import com.survey.domain.SurveyListVO;

public interface SurveyListDAO {
	public void insertList(List<SurveyListVO> list);
}

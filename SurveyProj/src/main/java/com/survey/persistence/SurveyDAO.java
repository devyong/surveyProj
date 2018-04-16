package com.survey.persistence;

import com.survey.domain.SurveyVO;

public interface SurveyDAO {
	public void insertSurvey(SurveyVO survey);
	
	public int selectLastSv_id();
}

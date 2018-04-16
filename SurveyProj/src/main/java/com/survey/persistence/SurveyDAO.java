package com.survey.persistence;

import com.survey.domain.SurveyVO;

public interface SurveyDAO {

	public SurveyVO read(Integer sv_id) throws Exception;

	public void insertSurvey(SurveyVO survey);
	
	public int selectLastSv_id();

}

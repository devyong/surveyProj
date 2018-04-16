package com.survey.persistence;

import com.survey.domain.SurveyVO;

public interface SurveyDAO {
<<<<<<< HEAD
	public SurveyVO read(Integer sv_id) throws Exception;
=======
	public void insertSurvey(SurveyVO survey);
	
	public int selectLastSv_id();
>>>>>>> branch 'master' of https://github.com/devyong/surveyProj.git
}

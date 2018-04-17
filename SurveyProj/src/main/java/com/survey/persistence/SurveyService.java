package com.survey.persistence;

import com.survey.domain.SurveyVO;

public interface SurveyService {
	public SurveyVO read(Integer sv_id) throws Exception;
}

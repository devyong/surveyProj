package com.survey.persistence;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.survey.domain.SurveyVO;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Inject
	private SurveyDAO dao;
	public SurveyVO read(Integer sv_id) throws Exception {
		return dao.read(sv_id);
	}

}


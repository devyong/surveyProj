package com.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.survey.persistence.SurveyResultDAO;

@Service
public class SurveyResultServiceImpl implements SurveyResultService {

	@Inject
	private SurveyResultDAO dao;
	
	@Override
	public Integer isParticipate(int sv_id, String m_id) throws Exception {
		
		return dao.isParticipate(sv_id, m_id);
	}

}

package com.survey.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.survey.domain.ResultVO;
import com.survey.persistence.SurveyResultDAO;

@Service
public class SurveyResultServiceImpl implements SurveyResultService {

	@Inject
	private SurveyResultDAO dao;
	
	@Override
	public Integer isParticipate(int sv_id, String m_id) throws Exception {
		
		return dao.isParticipate(sv_id, m_id);
	}

	@Override
	public List<ResultVO> listResult(int sv_id) throws Exception {
		return dao.listResult(sv_id);
	}

	@Override
	public Integer listTotal(int sv_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.listTotal(sv_id);
	}
	
	

}

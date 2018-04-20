package com.survey.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.survey.domain.Criteria;
import com.survey.domain.SurveyVO;
import com.survey.persistence.SurveyDAO;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Inject
	private SurveyDAO dao;
	
	public SurveyVO read(Integer sv_id) throws Exception {
		
		
		return dao.read(sv_id);
	}

	@Override
	public List<SurveyVO> listSurvey() throws Exception {
		return dao.listSurvey();
	}

	@Override
	public void addCount(Integer sv_id) throws Exception {
		dao.addCount(sv_id);
		
	}
	
	@Override
	public List<SurveyVO> listPage(Criteria cri) throws Exception {

		return dao.listPage(cri);
	}

	@Override
	public int listCount(Criteria cri) throws Exception {
	
		return dao.countPaging(cri);
	}

}


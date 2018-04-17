package com.survey.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.domain.SurveyListVO;
import com.survey.domain.SurveyVO;
import com.survey.persistence.SurveyDAO;
import com.survey.persistence.SurveyListDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	SurveyDAO sv_dao;
	
	@Inject
	SurveyListDAO list_dao;
	
	@Override
	public void addSurvey(SurveyVO survey, List<SurveyListVO> list) {
		sv_dao.insertSurvey(survey);
		int sv_id = sv_dao.selectLastSv_id();
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setSv_id(sv_id);
		}
		
		
		list_dao.insertList(list);

	}

}

package com.survey.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.survey.domain.SurveyAndListVO;
import com.survey.domain.SurveyVO;

@Service
public class SurveyAndListDAOImpl implements SurveyAndListDAO {

	
	@Inject
	SqlSession session;
	
	private final String adminNamespace = "com.survey.mapper.AdminMapper";
	
	
	@Override
	public List<SurveyAndListVO> selectSurveyAndList(int sv_id) {
		
		return session.selectList(adminNamespace + ".selectSurveyAndList", sv_id);
	}


	@Override
	public void updateSurveyAndList(List<SurveyAndListVO> andList) {
		SurveyVO survey = new SurveyVO();
		survey.setSv_title(andList.get(0).getSv_title());
		survey.setSv_enddate(andList.get(0).getSv_enddate());
		
		session.update(adminNamespace + ".updateSurvey", survey);
		
		for (SurveyAndListVO list : andList) 
			session.update(adminNamespace + ".updateSurveyList", list);
		
	}

}

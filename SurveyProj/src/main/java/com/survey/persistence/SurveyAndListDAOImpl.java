package com.survey.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.survey.domain.SurveyAndListVO;

@Service
public class SurveyAndListDAOImpl implements SurveyAndListDAO {

	
	@Inject
	SqlSession session;
	
	private final String adminNamespace = "com.survey.mapper.AdminMapper";
	
	
	@Override
	public List<SurveyAndListVO> selectSurveyAndList(int sv_id) {
		
		return session.selectList(adminNamespace + ".selectSurveyAndList", sv_id);
	}

}

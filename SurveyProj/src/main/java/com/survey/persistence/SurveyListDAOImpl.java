package com.survey.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.SurveyListVO;

@Repository
public class SurveyListDAOImpl implements SurveyListDAO {

	private final String namespace = "com.survey.mapper.AdminMapper";
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertList(List<SurveyListVO> list) {
		
		//sv_id ?
		for (SurveyListVO surveyListVO : list) {
			sqlSession.insert(namespace + ".insertList", surveyListVO);
		}
	}

}

package com.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.survey.domain.SurveyVO;

@Repository
public class SurveyDAOImpl implements SurveyDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.survey.mapper.ContentMapper";
	
	@Override
	public SurveyVO read(Integer sv_id) throws Exception {
		return session.selectOne(namespace + ".read", sv_id); 
	}
}

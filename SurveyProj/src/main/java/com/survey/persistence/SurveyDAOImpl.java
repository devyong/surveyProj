package com.survey.persistence;

<<<<<<< HEAD
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
=======
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.SurveyVO;

@Repository
public class SurveyDAOImpl implements SurveyDAO {

	private final String namespace = "com.survey.mapper.AdminMapper";
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertSurvey(SurveyVO survey) {
		sqlSession.insert(namespace + ".insertSurvey", survey);
	}

	@Override
	public int selectLastSv_id() {
		SurveyVO sv = sqlSession.selectOne(namespace + ".selectLastSv_id");
		return sv.getSv_id();
	}

>>>>>>> branch 'master' of https://github.com/devyong/surveyProj.git
}

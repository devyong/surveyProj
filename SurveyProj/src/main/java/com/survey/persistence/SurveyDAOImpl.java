package com.survey.persistence;


	
	
	
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.SurveyVO;

@Repository
public class SurveyDAOImpl implements SurveyDAO {

//	private final String namespace = "com.survey.mapper.AdminMapper";
	private static String namespace = "com.survey.mapper.ContentMapper";
	
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
	
	@Override
	public SurveyVO read(Integer sv_id) throws Exception {
		return sqlSession.selectOne(namespace + ".readSurvey", sv_id); 
	}

}

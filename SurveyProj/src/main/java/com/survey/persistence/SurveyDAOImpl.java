package com.survey.persistence;


	
	
	
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.Criteria;
import com.survey.domain.SurveyVO;

@Repository
public class SurveyDAOImpl implements SurveyDAO {

	private final String adminNamespace = "com.survey.mapper.AdminMapper";
	private static String namespace = "com.survey.mapper.ContentMapper";
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertSurvey(SurveyVO survey) {
		sqlSession.insert(adminNamespace + ".insertSurvey", survey);
	}

	@Override
	public int selectLastSv_id() {
		SurveyVO sv = sqlSession.selectOne(adminNamespace + ".selectLastSv_id");
		return sv.getSv_id();
	}
	
	@Override
	public SurveyVO read(Integer sv_id) throws Exception {
		return sqlSession.selectOne(namespace + ".readSurvey", sv_id); 
	}

	@Override
	public List<SurveyVO> listSurvey() throws Exception {
		return sqlSession.selectList(namespace + ".listSurvey");
		
	}

	@Override
	public void addCount(Integer sv_id) throws Exception {
		sqlSession.update(namespace + ".addCount", sv_id);
		
	}
	
	@Override
	public List<SurveyVO> listPage(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace+".listPage",cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace+".countPaging", cri);
	}

}

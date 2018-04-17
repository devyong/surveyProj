package com.survey.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;

@Repository
public class EnterTitleDAOImpl implements EnterTitleDAO{

	@Autowired
	SqlSession session;
	
	private String namespace = "com.survey.mapper.SurveyEnterMapper";
	
	@Override
	public EnterTitleVO Title(EnterTitleVO enter) throws Exception {
		EnterTitleVO enterVO = session.selectOne(namespace+ ".enterTitle", enter);
		
		return enterVO;
	}

	@Override
	public List<EnterListVO> enterList(int sv_id) throws Exception {
		
		return session.selectList(namespace+".enterList",sv_id);
	}

}

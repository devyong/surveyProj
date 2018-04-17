package com.survey.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class SurveyResultDAOImpl implements SurveyResultDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.survey.mapper.SurveyEnterMapper";
	
	@Override
	public Integer isParticipate(int sv_id, String m_id) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("sv_id", (Integer)sv_id);
		result.put("m_id", (String)m_id);
		
		
			
		return session.selectOne(namespace + ".isParticipate", result);
	}

}

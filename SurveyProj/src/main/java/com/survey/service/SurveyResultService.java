package com.survey.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.survey.domain.ResultVO;

public interface SurveyResultService {
	public Integer isParticipate(int sv_id, String m_id) throws Exception;
	
	public List<ResultVO> listResult(int sv_id) throws Exception;
	
	public Integer listTotal(int sv_id) throws Exception;
}

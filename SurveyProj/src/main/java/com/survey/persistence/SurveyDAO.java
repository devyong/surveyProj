package com.survey.persistence;

import java.util.List;

import com.survey.domain.Criteria;
import com.survey.domain.SurveyVO;

public interface SurveyDAO {

	public SurveyVO read(Integer sv_id) throws Exception;

	public void insertSurvey(SurveyVO survey);
	
	public int selectLastSv_id();
	
	public List<SurveyVO> listSurvey() throws Exception;
	
	public void addCount(Integer sv_id) throws Exception;

	public List<SurveyVO> listPage(Criteria cri) throws Exception;
	public int countPaging(Criteria cri) throws Exception;
}

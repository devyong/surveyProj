package com.survey.persistence;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.survey.domain.Criteria;
import com.survey.domain.SurveyVO;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Inject
	private SurveyDAO dao;
	public SurveyVO read(Integer sv_id) throws Exception {
		return dao.read(sv_id);
	}

	@Override
	public List<SurveyVO> listPage(Criteria cri) throws Exception {

		return dao.listPage(cri);
	}

	@Override
	public int listCount(Criteria cri) throws Exception {
	
		return dao.countPaging(cri);
	}
	
}


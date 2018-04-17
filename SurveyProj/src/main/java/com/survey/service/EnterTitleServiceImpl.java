package com.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;
import com.survey.persistence.EnterTitleDAO;


@Service
public class EnterTitleServiceImpl implements EnterTitleService{
	
	@Autowired
	EnterTitleDAO dao;
	
	@Override
	public EnterTitleVO enterTitle(EnterTitleVO enterTitle) throws Exception {
			
		return dao.Title(enterTitle);
	}

	@Override
	public List<EnterListVO> enterList(int sv_id) throws Exception {
		
		return dao.enterList(sv_id);
	}

}

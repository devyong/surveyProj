package com.survey.service;

import java.util.List;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;

public interface EnterTitleService {
	public EnterTitleVO enterTitle(EnterTitleVO enterTitle) throws Exception;
	public List<EnterListVO> enterList(int sv_id) throws Exception;
}

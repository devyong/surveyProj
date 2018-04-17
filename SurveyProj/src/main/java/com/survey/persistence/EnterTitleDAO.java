package com.survey.persistence;

import java.util.List;

import com.survey.domain.EnterListVO;
import com.survey.domain.EnterTitleVO;

public interface EnterTitleDAO {
	public EnterTitleVO Title(EnterTitleVO enter) throws Exception;
	public List<EnterListVO> enterList(int sv_id) throws Exception;
	
}

package com.survey.persistence;

import java.util.List;

import com.survey.domain.Criteria;
import com.survey.domain.MemberVO;
import com.survey.domain.SurveyVO;

public interface MemberDAO {
	
	public MemberVO selectMember(MemberVO member);
	
	public void insertMember(MemberVO member);
}

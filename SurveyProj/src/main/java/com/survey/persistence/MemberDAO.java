package com.survey.persistence;

import com.survey.domain.MemberVO;

public interface MemberDAO {
	public MemberVO selectMember(MemberVO member);
	
	public void insertMember(MemberVO member);
	
	public MemberVO selectId(String m_id);
}

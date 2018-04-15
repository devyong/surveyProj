package com.survey.persistence;

import com.survey.domain.MemberVO;

public interface MemberDAO {
	public MemberVO selectMember(MemberVO member);
}

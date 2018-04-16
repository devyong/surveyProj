package com.survey.service;

import com.survey.domain.MemberVO;

public interface MemberService {

	public MemberVO login(MemberVO member);
	
	public void join(MemberVO member);
}

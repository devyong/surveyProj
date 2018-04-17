package com.survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.domain.MemberVO;
import com.survey.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired	// ByType 형태의 자동주
	MemberDAO dao;
	
	@Override
	public MemberVO login(MemberVO member) {
		
		return dao.selectMember(member);
	}

	@Override
	public void join(MemberVO member) {
		dao.insertMember(member);
	}

	@Override
	public MemberVO checkid(String m_id) {
		return dao.selectId(m_id);

	}

	
}

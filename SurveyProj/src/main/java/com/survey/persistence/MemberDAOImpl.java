package com.survey.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSession session;
	
	private String namespace = "com.survey.mapper.MemberMapper";
	
	@Override
	public MemberVO selectMember(MemberVO member) {
		MemberVO  memberVO = session.selectOne(namespace + ".login", member);
		
		return memberVO;
	}

	@Override
	public void insertMember(MemberVO member) {
		session.insert(namespace + ".join", member);
	}

	@Override
	public MemberVO selectId(String m_id) {
		MemberVO member = session.selectOne(namespace + ".checkid", m_id);
		
		return member;
	}
	
	

}

package com.universal.infra.inMember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InMemberService {
	
	@Autowired
	InMemberDao inMemberDao;
	
	// selectList
	public List<InMemberDto> selectMemberList(InMemberVo inMemberVo) {
		return inMemberDao.selectMemberList(inMemberVo);
	}
	
	// insert
	public int memberInsert(InMemberDto inMemberDto) {
		return inMemberDao.memberInsert(inMemberDto);
	}
	
	// selectOne
	public InMemberDto selectOneMember(InMemberDto inMemberDto) {
		return inMemberDao.selectOneMember(inMemberDto);
	}
	
	// update
	public int memberUpdate(InMemberDto inMemberDto) {
		return inMemberDao.memberUpdate(inMemberDto);
	}
	
	

}

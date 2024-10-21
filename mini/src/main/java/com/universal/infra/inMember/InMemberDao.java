package com.universal.infra.inMember;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InMemberDao {
	
	// selectList
	public List<InMemberDto> selectMemberList(InMemberVo inMemberVo);
	
	// insert
	public int memberInsert(InMemberDto inMemberDto);
	
	// selectOne
	public InMemberDto selectOneMember(InMemberDto inMemberDto);
	
	// update
	public int memberUpdate(InMemberDto inMemberDto);
	
}

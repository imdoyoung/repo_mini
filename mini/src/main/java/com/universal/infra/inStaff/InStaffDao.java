package com.universal.infra.inStaff;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.universal.infra.inMember.InMemberDto;

@Repository
public interface InStaffDao {
	
	// selectList 
	public List<InStaffDto> selectStaffList(InStaffVo inStaffVo);
	
	// insert 
	public int staffInsert(InStaffDto inStaffDto);
	
	// selectOne
	public InStaffDto selectOneStaff(InStaffDto inStaffDto);
	
	// update 
	public int staffUpdate(InStaffDto inStaffDto);
	
	// update delete
	public int stafftUelete(InStaffDto inStaffDto);
	
	// paging
	public int selectOneCount(InStaffVo inStaffVo);

}

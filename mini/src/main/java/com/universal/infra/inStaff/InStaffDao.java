package com.universal.infra.inStaff;

import java.util.List;

import org.springframework.stereotype.Repository;

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

}

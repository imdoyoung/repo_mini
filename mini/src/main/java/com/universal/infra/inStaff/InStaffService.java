package com.universal.infra.inStaff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InStaffService {
	
	@Autowired
	InStaffDao inStaffDao;
	
	// selectList
	public List<InStaffDto> selectStaffList(InStaffVo inStaffVo) {
		return inStaffDao.selectStaffList(inStaffVo);
	}
	
	// insert 
	public int staffInsert(InStaffDto inStaffDto) {
		return inStaffDao.staffInsert(inStaffDto);
	}
	
	// selectOne
	public InStaffDto selectOneStaff(InStaffDto inStaffDto) {
		return inStaffDao.selectOneStaff(inStaffDto);
	}
	
	// update
	public int staffUpdate(InStaffDto inStaffDto) {
		return inStaffDao.staffUpdate(inStaffDto);
	}
}

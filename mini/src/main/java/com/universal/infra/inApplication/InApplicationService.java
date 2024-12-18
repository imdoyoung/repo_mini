package com.universal.infra.inApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class InApplicationService {
	
	@Autowired
	private InApplicationDao inApplicationDao;
	
	// AppselectList
	public List<InApplicationDto> selectList(InApplicationVo inApplicationVo) {
		List<InApplicationDto> inApplications = inApplicationDao.AppselectList(inApplicationVo);
		return inApplications;
		}
	
	// AppInsert
	public int AppInsert(InApplicationDto inApplicationDto) {
		return inApplicationDao.AppInsert(inApplicationDto);
	}
	
	// AppselectOne
	public InApplicationDto AppselectOne(InApplicationDto inApplicationDto) {
		return inApplicationDao.AppselectOne(inApplicationDto);
	}
	
	// AppUpdate
	public int AppUpdate(InApplicationDto inApplicationDto) {
		return inApplicationDao.AppUpdate(inApplicationDto);
	}
	
	// AppSelectOneCount
	public int AppSelectOneCount(InApplicationVo inApplicationVo) {
		return inApplicationDao.AppSelectOneCount(inApplicationVo);
	}
	
	// selectListMember
	public List<InApplicationDto> selectListMember() {
		return inApplicationDao.selectListMember();
	}

}

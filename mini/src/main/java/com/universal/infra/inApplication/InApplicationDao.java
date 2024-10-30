package com.universal.infra.inApplication;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface InApplicationDao {
	
	// AppselectList
	public List<InApplicationDto> AppselectList(InApplicationVo inApplicationVo);
	
	// AppInsert
	public int AppInsert(InApplicationDto inApplicationDto);
	
	// AppselectOne
	public InApplicationDto AppselectOne(InApplicationDto inApplicationDto);
	
	// AppUpdate
	public int AppUpdate(InApplicationDto inApplicationDto);
	
	// AppSelectOneCount
	public int AppSelectOneCount(InApplicationVo inApplicationVo);

}

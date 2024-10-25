package com.universal.infra.inContract;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InContractDao {
	
	// conSelectList
	public List<InContractDto> conSelectList(InContractVo inContractVo);
	
	// conInsert
	public int conInsert(InContractDto inContractDto);
	
	// conSelectOne
	public InContractDto conSelectOne(InContractDto inContractDto);
	
	// conUpdate
	public int conUpdate(InContractDto inContractDto);
	

}

package com.universal.infra.inContract;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InContractDao {
	
	// conSelectList
	public List<InContractDto> conSelectList();
	
	// conInsert
	public int conInsert(InContractDto inContractDto);
	

}

package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InClaimDao {
	
	public List<InClaimDto> inClaimAcceptSelectList();
	
	public int inClaimAcceptInsert(InClaimDto inClaimDto);

}

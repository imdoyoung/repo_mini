package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InClaimService {
	
	@Autowired
	private InClaimDao inClaimDao;
	
	// List
	public List<InClaimDto> inClaimAcceptSelectList(){
		return inClaimDao.inClaimAcceptSelectList();
	}
	
	// Insert
	public int inClaimAcceptInsert(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptInsert(inClaimDto);
	}

}

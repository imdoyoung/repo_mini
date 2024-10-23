package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InClaimService {
	
	@Autowired
	private InClaimDao inClaimDao;

// ==================== inCalimAccept ==================== //
	// ClaimAccept: List
	public List<InClaimDto> inClaimAcceptSelectList(){
		return inClaimDao.inClaimAcceptSelectList();
	}
	
	// ClaimAccept: Insert
	public int inClaimAcceptInsert(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptInsert(inClaimDto);
	}
	
	// ClaimAccept: SelectOne
	public InClaimDto inClaimAcceptSelectOne(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptSelectOne(inClaimDto);
	}
	
	// ClaimAccept: Update
	public int inClaimAcceptUpdate(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptUpdate(inClaimDto);
	}
	
	// ClaimAccept: Uelete
	public int inClaimAcceptUelete(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptUelete(inClaimDto);
	}

	// ClaimAccept: Delete
	public int inClaimAcceptDelete(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAcceptDelete(inClaimDto);
	}
	

// ==================== inCalimProcess ==================== //
	// ClaimProcess: List
	public List<InClaimDto> inClaimProcessSelectList(){
		return inClaimDao.inClaimProcessSelectList();
	}
	
	// ClaimProcess: Insert
	public int inClaimProcessInsert(InClaimDto inClaimDto) {
		return inClaimDao.inClaimProcessInsert(inClaimDto);
	}
	
	// ClaimProcess: SelectOne
	public InClaimDto inClaimProcessSelectOne(InClaimDto inClaimDto) {
		System.out.println();
		return inClaimDao.inClaimProcessSelectOne(inClaimDto);
	}
	
	// ClaimProcess: Update
	public int inClaimProcessUpdate(InClaimDto inClaimDto) {
		return inClaimDao.inClaimProcessUpdate(inClaimDto);
	}
	
	// ClaimProcess: Uelete
	public int inClaimProcessUelete(InClaimDto inClaimDto) {
		return inClaimDao.inClaimProcessUelete(inClaimDto);
	}

	// ClaimProcess: Delete
	public int inClaimProcessDelete(InClaimDto inClaimDto) {
		return inClaimDao.inClaimProcessDelete(inClaimDto);
	}

}

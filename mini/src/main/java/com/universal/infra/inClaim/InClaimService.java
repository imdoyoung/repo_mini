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
	public List<InClaimDto> inClaimAcceptSelectList(InClaimVo inClaimVo){
		return inClaimDao.inClaimAcceptSelectList(inClaimVo);
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
	
	
	
// ==================== inCalimProcess ==================== //
	// ClaimPay: List
	public List<InClaimDto> inClaimPaySelectList(){
		return inClaimDao.inClaimPaySelectList();
	}
	
	// ClaimPay: Insert
	public int inClaimPayInsert(InClaimDto inClaimDto) {
		return inClaimDao.inClaimPayInsert(inClaimDto);
	}
	
	// ClaimPay: SelectOne
	public InClaimDto inClaimPaySelectOne(InClaimDto inClaimDto) {
		System.out.println(inClaimDto.getIncpaySeq());
		return inClaimDao.inClaimPaySelectOne(inClaimDto);
	}
	
	// ClaimPay: Update
	public int inClaimPayUpdate(InClaimDto inClaimDto) {
		return inClaimDao.inClaimPayUpdate(inClaimDto);
	}
	
	
	
// ========== inClaimAssign ========== //
	
	// selectList
	public List<InClaimDto> inClaimAssignSelectList() {
		return inClaimDao.inClaimAssignSelectList();
	}
	
	// insert
	public int inClaimAssignInsert(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAssignInsert(inClaimDto);
	}
	
	// selectOne
	public InClaimDto inClaimAssignSelectOne(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAssignSelectOne(inClaimDto);
	}
	
	// update
	public int inClaimAssignUpdate(InClaimDto inClaimDto) {
		return inClaimDao.inClaimAssignUpdate(inClaimDto);
	}
		


}

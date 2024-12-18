package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.universal.infra.inMember.InMemberDto;
import com.universal.infra.inStaff.InStaffDto;

@Repository
public interface InClaimDao {
// ==================== inCalimAccept ==================== //
	
	// ClaimAccept: List
	public List<InClaimDto> inClaimAcceptSelectList(InClaimVo inClaimVo);
	
	// ClaimAccept: Insert
	public int inClaimAcceptInsert(InClaimDto inClaimDto);
	
	// ClaimAccept: SelectOne
	public InClaimDto inClaimAcceptSelectOne(InClaimDto inClaimDto);
	
	// ClaimAccept: Update
	public int inClaimAcceptUpdate(InClaimDto inClaimDto);
	
	// ClaimAccept: Uelete
	public int inClaimAcceptUelete(InClaimDto inClaimDto);

	// ClaimAccept: Delete
	public int inClaimAcceptDelete(InClaimDto inClaimDto);
	
	// ClaimAccept: paging
	public int inClaimAcceptSelectOneCount(InClaimVo inClaimVo);
	
	// selectListMember
	public List<InMemberDto> selectListMember();
	
	// selectListStaff
	public List<InStaffDto> selectListStaff();
	
	
// ==================== inCalimProcess ==================== //
	
	// ClaimProcess: List
	public List<InClaimDto> inClaimProcessSelectList(InClaimVo inClaimVo);
	
	// ClaimProcess: Insert
	public int inClaimProcessInsert(InClaimDto inClaimDto);
	
	// ClaimProcess: SelectOne
	public InClaimDto inClaimProcessSelectOne(InClaimDto inClaimDto);
	
	// ClaimProcess: Update
	public int inClaimProcessUpdate(InClaimDto inClaimDto);
	
	// ClaimProcess: Uelete
	public int inClaimProcessUelete(InClaimDto inClaimDto);

	// ClaimProcess: Delete
	public int inClaimProcessDelete(InClaimDto inClaimDto);
	
	// ClaimProcess: paging
	public int inClaimProcessSelectOneCount(InClaimVo inClaimVo);
	
	// selectListClaimAccept
	public List<InClaimDto> selectListClaimAccept();

	
// ==================== inCalimPay ==================== //

	// ClaimPay: List
	public List<InClaimDto> inClaimPaySelectList(InClaimVo inClaimVo);
	
	// ClaimPay: Insert
	public int inClaimPayInsert(InClaimDto inClaimDto);
		
	// ClaimPay: SelectOne
	public InClaimDto inClaimPaySelectOne(InClaimDto inClaimDto);
	
	// ClaimPay: Update
	public int inClaimPayUpdate(InClaimDto inClaimDto);
	
	// ClaimPay: paging
	public int inClaimPaySelectOneCount(InClaimVo inClaimVo);
	
	
	// ========== inClaimAssign ========== // 
	
		// selectList
		public List<InClaimDto> inClaimAssignSelectList(InClaimAssignVo inClaimAssignVo);
		
		// insert
		public int inClaimAssignInsert(InClaimDto inClaimDto);
		
		// selectOne
		public InClaimDto inClaimAssignSelectOne(InClaimDto inClaimDto);
		
		// update
		public int inClaimAssignUpdate(InClaimDto inClaimDto);
		
		// paging
		public int selectOneCount(InClaimAssignVo inClaimAssignVo);
	
}

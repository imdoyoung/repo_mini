package com.universal.infra.inClaim;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InClaimDto {

// ========== field =========== //
	// ===== inClaimAccept(클레임관리-접수) ===== //
	private String incaccSeq;			// 클레임관리접수 Seq
	private Integer incaccSubmitNo;		// 클레임관리접수 번호
	private Integer incaccProType;		// 클레임관리접수 보험상품타입
	private Integer incaccGender;		// 클레임관리접수 성별
	private Integer incaccCompleteNy;	// 클레임관리접수 처리완료여부
	private Integer incaccRequType;		// 클레임관리접수 청구유형
	private Integer incaccRequReason;	// 클레임관리접수 청구사유
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date incaccAccDate;			// 클레임관리접수 사고날짜
	private String incaccAccPlace;		// 클레임관리접수 사고장소
	private String incaccAccDesc;		// 클레임관리접수 사고경위
	private String incaccDisease;		// 클레임관리접수 병명
	private Integer incaccSettleRankType;// 클레임관리접수 보험금수령은행
	private String incaccSettleAcNo;	// 클레임관리접수 보험금수령계좌번호
	private Integer incaccTosNy;		// 클레임관리접수 약관
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incaccRegDate;		// 클레임관리접수 등록일(접수일)
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incaccEdiDate;			// 클레임관리접수 수정일
	private Integer incaccDelNy;		// 클레임관리접수 삭제여부
	private String inMember_inmeSeq;	// 클레임관리접수 고객Seq
	private String inStaff_instSeq;		// 클레임관리접수 직원Seq
	
	// ===== inClaimProcess(클레임관리-검토&처리) ===== //
	private String incproSeq;			// 클레임관리검토&처리 Seq
	private Integer incproApproveNy;	// 클레임관리검토&처리 지급승인여부
	private String incproRejectReason;	// 클레임관리검토&처리 지급반려사유
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incproEdiDate;			// 클레임관리검토&처리 수정일
	private Integer incproDelNy;		// 클레임관리검토&처리 삭제여부
	private Integer incproCompleteNy;	// 클레임관리검토&처리 처리완료여부
	private String inClaimAccept_incaccSeq;	// 클레임관리검토&처리-클레임관리접수 Seq
	
//	// ===== inClaimPay(클레임관리-지급) ===== //
//	private String incpaySeq;			// 클레임관리지급 Seq
//	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//	private Date incpaySettleDate;		// 클레임관리지급 최종지급일
//	private Integer incpaySettleNy;		// 클레임관리지급 지급완료여부
	
//	// ===== inClaimAssign(클레임관리-배정) ===== //
	private String incassSeq;			// 클레임관리배정 Seq
	public Integer getIncproCompleteNy() {
		return incproCompleteNy;
	}
	public void setIncproCompleteNy(Integer incproCompleteNy) {
		this.incproCompleteNy = incproCompleteNy;
	}
	private Integer incassRequType;		// 클레임관리배정 청구유형
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incassAssigndate;		// 클레임관리배정 배정일
	private Integer incassAssignNy;		// 클레임관리배정 배정현황(상태)
	private Integer incassCompleteNy;	// 클레임관리배정 클레임완료여부
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incassRegDate;			// 클레임관리배정 등록일
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date incassEdiDate;			// 클레임관리배정 수정일
	private Integer incassDelNy;		// 클레임관리배정 삭제여부
	
	// ===== inMember(고객) ===== //
	private String inmeSeq;				// 고객 Seq
	private String inmeName;			// 고객 이름
	private Integer inmeGender;			// 고객 성별
	private String inmeTel;				// 고객 전화번호
	private String inmeIdNumberFr;		// 고객 주민등록번호앞자리
	private String inmeIdNumberBa;		// 고객 주민등록번호뒷자리
	private String inmeZipCode;			// 고객 우편번호
	private String inmeAddr;			// 고객 주소
	private String inmeAddrDetail;		// 고객 상세주소
	private String inmeEmail;			// 고객 이메일
	private Integer inmeJobNy;			// 고객 직업위험군여부
	private Integer inmeDiseaseNy;		// 고객 의료수급권자여부
	// ===== inStaff(직원) ===== //
	private String instSeq;				// 담당자 Seq
	private String instName;			// 담당자 이름
	private String instId;				// 담당자 이름
	private String instTel;				// 담당자 연락처

	
	
// ========== getter/setter =========== //

	public String getIncaccSeq() {
		return incaccSeq;
	}
	public void setIncaccSeq(String incaccSeq) {
		this.incaccSeq = incaccSeq;
	}
	public Integer getIncaccSubmitNo() {
		return incaccSubmitNo;
	}
	public void setIncaccSubmitNo(Integer incaccSubmitNo) {
		this.incaccSubmitNo = incaccSubmitNo;
	}
	public Integer getIncaccProType() {
		return incaccProType;
	}
	public void setIncaccProType(Integer incaccProType) {
		this.incaccProType = incaccProType;
	}
	public Integer getIncaccGender() {
		return incaccGender;
	}
	public void setIncaccGender(Integer incaccGender) {
		this.incaccGender = incaccGender;
	}
	public Integer getIncaccCompleteNy() {
		return incaccCompleteNy;
	}
	public void setIncaccCompleteNy(Integer incaccCompleteNy) {
		this.incaccCompleteNy = incaccCompleteNy;
	}
	public Integer getIncaccRequType() {
		return incaccRequType;
	}
	public void setIncaccRequType(Integer incaccRequType) {
		this.incaccRequType = incaccRequType;
	}
	public Integer getIncaccRequReason() {
		return incaccRequReason;
	}
	public void setIncaccRequReason(Integer incaccRequReason) {
		this.incaccRequReason = incaccRequReason;
	}
	public Date getIncaccAccDate() {
		return incaccAccDate;
	}
	public void setIncaccAccDate(Date incaccAccDate) {
		this.incaccAccDate = incaccAccDate;
	}
	public String getIncaccAccPlace() {
		return incaccAccPlace;
	}
	public void setIncaccAccPlace(String incaccAccPlace) {
		this.incaccAccPlace = incaccAccPlace;
	}
	public String getIncaccAccDesc() {
		return incaccAccDesc;
	}
	public void setIncaccAccDesc(String incaccAccDesc) {
		this.incaccAccDesc = incaccAccDesc;
	}
	public String getIncaccDisease() {
		return incaccDisease;
	}
	public void setIncaccDisease(String incaccDisease) {
		this.incaccDisease = incaccDisease;
	}
	public Integer getIncaccSettleRankType() {
		return incaccSettleRankType;
	}
	public void setIncaccSettleRankType(Integer incaccSettleRankType) {
		this.incaccSettleRankType = incaccSettleRankType;
	}
	public String getIncaccSettleAcNo() {
		return incaccSettleAcNo;
	}
	public void setIncaccSettleAcNo(String incaccSettleAcNo) {
		this.incaccSettleAcNo = incaccSettleAcNo;
	}
	public Integer getIncaccTosNy() {
		return incaccTosNy;
	}
	public void setIncaccTosNy(Integer incaccTosNy) {
		this.incaccTosNy = incaccTosNy;
	}
	public Date getIncaccRegDate() {
		return incaccRegDate;
	}
	public void setIncaccRegDate(Date incaccRegDate) {
		this.incaccRegDate = incaccRegDate;
	}
	public Date getIncaccEdiDate() {
		return incaccEdiDate;
	}
	public void setIncaccEdiDate(Date incaccEdiDate) {
		this.incaccEdiDate = incaccEdiDate;
	}
	public Integer getIncaccDelNy() {
		return incaccDelNy;
	}
	public void setIncaccDelNy(Integer incaccDelNy) {
		this.incaccDelNy = incaccDelNy;
	}
	public String getInMember_inmeSeq() {
		return inMember_inmeSeq;
	}
	public void setInMember_inmeSeq(String inMember_inmeSeq) {
		this.inMember_inmeSeq = inMember_inmeSeq;
	}
	public String getInStaff_instSeq() {
		return inStaff_instSeq;
	}
	public void setInStaff_instSeq(String inStaff_instSeq) {
		this.inStaff_instSeq = inStaff_instSeq;
	}
	public String getIncproSeq() {
		return incproSeq;
	}
	public void setIncproSeq(String incproSeq) {
		this.incproSeq = incproSeq;
	}
	public Integer getIncproApproveNy() {
		return incproApproveNy;
	}
	public void setIncproApproveNy(Integer incproApproveNy) {
		this.incproApproveNy = incproApproveNy;
	}
	public String getIncproRejectReason() {
		return incproRejectReason;
	}
	public void setIncproRejectReason(String incproRejectReason) {
		this.incproRejectReason = incproRejectReason;
	}
	public Date getIncproEdiDate() {
		return incproEdiDate;
	}
	public void setIncproEdiDate(Date incproEdiDate) {
		this.incproEdiDate = incproEdiDate;
	}
	public Integer getIncproDelNy() {
		return incproDelNy;
	}
	public void setIncproDelNy(Integer incproDelNy) {
		this.incproDelNy = incproDelNy;
	}
	public String getInClaimAccept_incaccSeq() {
		return inClaimAccept_incaccSeq;
	}
	public void setInClaimAccept_incaccSeq(String inClaimAccept_incaccSeq) {
		this.inClaimAccept_incaccSeq = inClaimAccept_incaccSeq;
	}
	public String getIncassSeq() {
		return incassSeq;
	}
	public void setIncassSeq(String incassSeq) {
		this.incassSeq = incassSeq;
	}
	public Integer getIncassRequType() {
		return incassRequType;
	}
	public void setIncassRequType(Integer incassRequType) {
		this.incassRequType = incassRequType;
	}
	public Date getIncassAssigndate() {
		return incassAssigndate;
	}
	public void setIncassAssigndate(Date incassAssigndate) {
		this.incassAssigndate = incassAssigndate;
	}
	public Integer getIncassAssignNy() {
		return incassAssignNy;
	}
	public void setIncassAssignNy(Integer incassAssignNy) {
		this.incassAssignNy = incassAssignNy;
	}
	public Integer getIncassCompleteNy() {
		return incassCompleteNy;
	}
	public void setIncassCompleteNy(Integer incassCompleteNy) {
		this.incassCompleteNy = incassCompleteNy;
	}
	public Date getIncassRegDate() {
		return incassRegDate;
	}
	public void setIncassRegDate(Date incassRegDate) {
		this.incassRegDate = incassRegDate;
	}
	public Date getIncassEdiDate() {
		return incassEdiDate;
	}
	public void setIncassEdiDate(Date incassEdiDate) {
		this.incassEdiDate = incassEdiDate;
	}
	public Integer getIncassDelNy() {
		return incassDelNy;
	}
	public void setIncassDelNy(Integer incassDelNy) {
		this.incassDelNy = incassDelNy;
	}
	public String getInmeSeq() {
		return inmeSeq;
	}
	public void setInmeSeq(String inmeSeq) {
		this.inmeSeq = inmeSeq;
	}
	public String getInmeName() {
		return inmeName;
	}
	public void setInmeName(String inmeName) {
		this.inmeName = inmeName;
	}
	public Integer getInmeGender() {
		return inmeGender;
	}
	public void setInmeGender(Integer inmeGender) {
		this.inmeGender = inmeGender;
	}
	public String getInmeTel() {
		return inmeTel;
	}
	public void setInmeTel(String inmeTel) {
		this.inmeTel = inmeTel;
	}
	public String getInmeIdNumberFr() {
		return inmeIdNumberFr;
	}
	public void setInmeIdNumberFr(String inmeIdNumberFr) {
		this.inmeIdNumberFr = inmeIdNumberFr;
	}
	public String getInmeIdNumberBa() {
		return inmeIdNumberBa;
	}
	public void setInmeIdNumberBa(String inmeIdNumberBa) {
		this.inmeIdNumberBa = inmeIdNumberBa;
	}
	public String getInmeZipCode() {
		return inmeZipCode;
	}
	public void setInmeZipCode(String inmeZipCode) {
		this.inmeZipCode = inmeZipCode;
	}
	public String getInmeAddr() {
		return inmeAddr;
	}
	public void setInmeAddr(String inmeAddr) {
		this.inmeAddr = inmeAddr;
	}
	public String getInmeAddrDetail() {
		return inmeAddrDetail;
	}
	public void setInmeAddrDetail(String inmeAddrDetail) {
		this.inmeAddrDetail = inmeAddrDetail;
	}
	public String getInmeEmail() {
		return inmeEmail;
	}
	public void setInmeEmail(String inmeEmail) {
		this.inmeEmail = inmeEmail;
	}
	public Integer getInmeJobNy() {
		return inmeJobNy;
	}
	public void setInmeJobNy(Integer inmeJobNy) {
		this.inmeJobNy = inmeJobNy;
	}
	public Integer getInmeDiseaseNy() {
		return inmeDiseaseNy;
	}
	public void setInmeDiseaseNy(Integer inmeDiseaseNy) {
		this.inmeDiseaseNy = inmeDiseaseNy;
	}
	public String getInstSeq() {
		return instSeq;
	}
	public void setInstSeq(String instSeq) {
		this.instSeq = instSeq;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstTel() {
		return instTel;
	}
	public void setInstTel(String instTel) {
		this.instTel = instTel;
	}

}

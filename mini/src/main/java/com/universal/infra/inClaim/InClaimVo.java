package com.universal.infra.inClaim;

import java.util.Date;

import com.universal.common.constants.Constants;

public class InClaimVo {

// ---------- filed ---------- //
	// search
	// ===== inClaimAccept ===== //
	private Integer shIncaccProType;	// 보험상품타입 검색
	private Integer shInmeJobNy;		// 위험직군여부 검색
	private Integer shInmeDiseaseNy;	// 의료수급권자여부 검색
	private Integer shIncaccRequType;	// 청구유형 검색
	private Integer shIncaccRequReason;	// 청구사유 검색
	private Integer shIncaccSettleRankType;	// 보험금수령은행 검색
	private Integer shInstId;			// 담당자ID 검색
	private Integer shIncaccCompleteNy;	// 접수처리완료여부 검색
	private Integer shIncaccDelNy;		// 접수 삭제여부 검색
	private Integer shDateOption;		// 날짜 검색
	private String shStartDate;			// 시작 날짜 
	private String shEndDate;			// 마감 날짜
	private Integer shOption;			// 검색 옵션
	private String shValue;				// 검색 값
	
	// ===== inClaimProcess ===== //
	private Integer shIncaccSeq;		// 접수번호 검색
	private Integer shIncproApproveNy;	// 지급승인여부 검색
	private Integer shIncproDelNy;		// 검토 삭제여부 검색
	
	// ===== inClaimPay ===== //
	private Integer shIncpaySettleNy;	// 지급완료여부 검색
	
	
	// paging
	private int thisPage = 1;		// 현재 페이지
	private int rowNumToShow = Constants.ROW_NUM_TO_SHOW;		// 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow = Constants.PAGE_NUM_TO_SHOW;		// 화면에 보여줄 페이징 번호 갯수
	private int totalRows;			// 전체 데이터 갯수
	private int totalPages;			// 전체 페이지 번호
	private int startPage;			// 시작 페이지 번호
	private int endPage;			// 마지막 페이지 번호
	private int startRnumForMySql;	// 쿼리 시작 row

//	----- paging 계산 -----
	public void setParamsPaging(int totalRows) {
		
		setTotalRows(totalRows);
		
		if(getTotalRows() == 0) {	// 입력받은 전체 데이터 갯수가 0이면
			setTotalPages(1);		// 전체 페이지 번호는 1
		} else {	// 입력받은 전체 데이터 갯수가 0이 아니면
			setTotalPages(getTotalRows() / getRowNumToShow());	// 전체 페이지 번호 =  전체 데이터 갯수 / 화면에 보여줄 데이터 줄 갯수
		}
		
		if(getTotalRows() % getRowNumToShow() > 0) {	// 전체 데이터 갯수 % 화면에 보여줄 데이터 줄 갯수 > 0 (나머지가 0 보다 클 때)
			setTotalPages(getTotalPages() + 1);		// 전체 페이지 번호 = 전체 페이지 번호 + 1
		}
		
		if(getTotalPages() < getThisPage()) {	// 전체 페이지 번호 < 현재 페이지
			setThisPage(getTotalPages());		// 현재페이지(전체 페이지 번호)
		}
		
		// 시작 페이지 번호(현재 페이지 - 1) / 화면에 보여줄 페이징 번호 개수 * 화면에 보여줄 페이징 번호 개수 + 1
		setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);

		// 마지막 페이지 번호 = 시작 페이지 번호 + 화면에 보여줄 페이징 번호 개수 -1
		setEndPage(getStartPage() + getPageNumToShow() - 1);

		if (getEndPage() > getTotalPages()) {	// 마지막 페이지 번호 > 전체 페이지 번호
			setEndPage(getTotalPages());	// 마지막 페이지 번호 = 전체 페이지 번호
		}
		
		if (thisPage == 1) {			// 현재 페이지 번호가 1이라면
			setStartRnumForMySql(0);	// 쿼리 시작 row = 0
		} else {						// 현재 페이지 번호가 1이 아니라면
			setStartRnumForMySql((getRowNumToShow() * (getThisPage()-1)));	// 쿼리 시작 row = 화면에 보여줄 데이터 줄 갯수 -1
		}
		
		// 내용 출력
		System.out.println("thisPage : " + getThisPage());
		System.out.println("rowNumToShow : " + getRowNumToShow());
		System.out.println("pageNumToShow : " + getPageNumToShow());
		System.out.println("totalRows : " + getTotalRows());
		System.out.println("totalPages : " + getTotalPages());
		System.out.println("startPage : " + getStartPage());
		System.out.println("endPage : " + getEndPage());
		System.out.println("startRnumForMySql : " + getStartRnumForMySql());
		
	}

// ---------- getter/setter ---------- //

	// ===== inClaimAccept ===== //
	public Integer getShIncaccProType() {
		return shIncaccProType;
	}
	public void setShIncaccProType(Integer shIncaccProType) {
		this.shIncaccProType = shIncaccProType;
	}
	public Integer getShInmeJobNy() {
		return shInmeJobNy;
	}
	public void setShInmeJobNy(Integer shInmeJobNy) {
		this.shInmeJobNy = shInmeJobNy;
	}
	public Integer getShInmeDiseaseNy() {
		return shInmeDiseaseNy;
	}
	public void setShInmeDiseaseNy(Integer shInmeDiseaseNy) {
		this.shInmeDiseaseNy = shInmeDiseaseNy;
	}
	public Integer getShIncaccRequType() {
		return shIncaccRequType;
	}
	public void setShIncaccRequType(Integer shIncaccRequType) {
		this.shIncaccRequType = shIncaccRequType;
	}
	public Integer getShIncaccRequReason() {
		return shIncaccRequReason;
	}
	public void setShIncaccRequReason(Integer shIncaccRequReason) {
		this.shIncaccRequReason = shIncaccRequReason;
	}
	public Integer getShIncaccSettleRankType() {
		return shIncaccSettleRankType;
	}
	public void setShIncaccSettleRankType(Integer shIncaccSettleRankType) {
		this.shIncaccSettleRankType = shIncaccSettleRankType;
	}
	public Integer getShInstId() {
		return shInstId;
	}
	public void setShInstId(Integer shInstId) {
		this.shInstId = shInstId;
	}
	public Integer getShIncaccCompleteNy() {
		return shIncaccCompleteNy;
	}
	public void setShIncaccCompleteNy(Integer shIncaccCompleteNy) {
		this.shIncaccCompleteNy = shIncaccCompleteNy;
	}
	public Integer getShIncaccDelNy() {
		return shIncaccDelNy;
	}
	public void setShIncaccDelNy(Integer shIncaccDelNy) {
		this.shIncaccDelNy = shIncaccDelNy;
	}
	public Integer getShDateOption() {
		return shDateOption;
	}
	public void setShDateOption(Integer shDateOption) {
		this.shDateOption = shDateOption;
	}
	public String getShStartDate() {
		return shStartDate;
	}
	public void setShStartDate(String shStartDate) {
		this.shStartDate = shStartDate;
	}
	public String getShEndDate() {
		return shEndDate;
	}
	public void setShEndDate(String shEndDate) {
		this.shEndDate = shEndDate;
	}
	public Integer getShOption() {
		return shOption;
	}
	public void setShOption(Integer shOption) {
		this.shOption = shOption;
	}
	public String getShValue() {
		return shValue;
	}
	public void setShValue(String shValue) {
		this.shValue = shValue;
	}

	// ===== paging ===== //
	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getRowNumToShow() {
		return rowNumToShow;
	}

	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}

	public int getPageNumToShow() {
		return pageNumToShow;
	}

	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRnumForMySql() {
		return startRnumForMySql;
	}

	public void setStartRnumForMySql(int startRnumForMySql) {
		this.startRnumForMySql = startRnumForMySql;
	}
	
	// ===== inClaimProcess ===== //
	public Integer getShIncaccSeq() {
		return shIncaccSeq;
	}

	public void setShIncaccSeq(Integer shIncaccSeq) {
		this.shIncaccSeq = shIncaccSeq;
	}

	public Integer getShIncproApproveNy() {
		return shIncproApproveNy;
	}

	public void setShIncproApproveNy(Integer shIncproApproveNy) {
		this.shIncproApproveNy = shIncproApproveNy;
	}

	public Integer getShIncproDelNy() {
		return shIncproDelNy;
	}

	public void setShIncproDelNy(Integer shIncproDelNy) {
		this.shIncproDelNy = shIncproDelNy;
	}

	// ===== inClaimPay ===== //
	public Integer getShIncpaySettleNy() {
		return shIncpaySettleNy;
	}
	
	public void setShIncpaySettleNy(Integer shIncpaySettleNy) {
		this.shIncpaySettleNy = shIncpaySettleNy;
	}
	
	
}

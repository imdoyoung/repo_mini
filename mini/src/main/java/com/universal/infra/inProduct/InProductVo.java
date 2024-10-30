package com.universal.infra.inProduct;

import com.universal.common.constants.Constants;

public class InProductVo {
	
	private Integer shproDelNy;
	private Integer shproType;
	private Integer shOptionDate;
	private String shDateStart;
	private String shDateEnd;
	private Integer shOption;
	private String shValue;
	private Integer shproGrade;
	
	// paging
	private int thisPage = 1;									// 현재 페이지
	private int rowNumToShow = Constants.ROW_NUM_TO_SHOW;	// 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow = Constants.PAGE_NUM_TO_SHOW;	// 화면에 보여줄 페이징 번호 갯수

	private int totalRows;										// 전체 데이터 갯수
	private int totalPages;										// 전체 페이지 번호
	private int startPage;										// 시작 페이지 번호
	private int endPage;										// 마지막 페이지 번호

	private int startRnumForMysql = 0;							// 쿼리 시작 row
	
	// ------ getter/setter -------
	public Integer getShproDelNy() {
		return shproDelNy;
	}
	public void setShproDelNy(Integer shproDelNy) {
		this.shproDelNy = shproDelNy;
	}
	public Integer getShproType() {
		return shproType;
	}
	public void setShproType(Integer shproType) {
		this.shproType = shproType;
	}
	public Integer getShOptionDate() {
		return shOptionDate;
	}
	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}
	public String getShDateStart() {
		return shDateStart;
	}
	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart;
	}
	public String getShDateEnd() {
		return shDateEnd;
	}
	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd;
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
	public Integer getShproGrade() {
		return shproGrade;
	}
	public void setShproGrade(Integer shproGrade) {
		this.shproGrade = shproGrade;
	}
	public Integer getRowNumToShow() {
		return rowNumToShow;
	}
	public void setRowNumToShow(Integer rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}
	public int getThisPage() {
		return thisPage;
	}
	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
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
	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}
	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}
	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}
	
//	----- paging 계산 -----
	public void setParamsPaging(int totalRows) {
		
		setTotalRows(totalRows);
		
		if(getTotalRows() == 0) {
			setTotalPages(1);
		} else {
			setTotalPages(getTotalRows() / getRowNumToShow());
		}
		
		if(getTotalRows() % getRowNumToShow() > 0) {
			setTotalPages(getTotalPages() + 1);
		}
		
		if(getTotalPages() < getThisPage()) {
			setThisPage(getTotalPages());
		}
		
		setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);

		setEndPage(getStartPage() + getPageNumToShow() - 1);

		if (getEndPage() > getTotalPages()) {
			setEndPage(getTotalPages());
		}
		
		if (thisPage == 1) {
			setStartRnumForMysql(0);
		} else {
			setStartRnumForMysql((getRowNumToShow() * (getThisPage()-1)));
		}
	}

}

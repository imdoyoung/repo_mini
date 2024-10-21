package com.universal.infra.inQnaBoard;

import com.universal.infra.codeGroup.ConStants;

public class InQnaBoardVo {
	
	private Integer shDelNy;
	private Integer shOption;
	private String shValue;
	private Integer shCompleteNy;
	private String shDateStart;
	private String shDateEnd;
	private Integer shOptionDate;
//	paging
	private int thisPage = 1;									
	private int rowNumToShow = ConStants.ROW_NUM_TO_SHOW;		
	private int pageNumToShow = ConStants.PAGE_NUM_TO_SHOW;		

	private int totalRows;										
	private int totalPages;										
	private int startPage;										
	private int endPage;										

	private int startRnumForMysql;		
	
	public Integer getShDelNy() {
		return shDelNy;
	}

	public void setShDelNy(Integer shDelNy) {
		this.shDelNy = shDelNy;
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

	public Integer getShCompleteNy() {
		return shCompleteNy;
	}

	public void setShCompleteNy(Integer shCompleteNy) {
		this.shCompleteNy = shCompleteNy;
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
	public Integer getShOptionDate() {
		return shOptionDate;
	}
	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}

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

	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}

	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}

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



		System.out.println("this page : "+getThisPage());
		System.out.println("rowNumToShow : "+getRowNumToShow());
		System.out.println("pageNumToShow : "+getPageNumToShow());
		System.out.println("totalPages : "+getTotalPages());
		System.out.println("startPage : "+getStartPage());
		System.out.println("totalRows : "+getTotalRows());
		System.out.println("endPage : "+getEndPage());
		System.out.println("startRnumForMysql : "+getStartRnumForMysql());
	}

}

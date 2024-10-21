package com.universal.infra.codeGroup;

import java.util.Date;

public class CodeGroupDto {
	
	private String incgSeq;
	private String incgName; 
	private Integer incgUseNy; 
	private Integer incgDelNy;
	private String incgDesc; 
	private Date incgRegDate; 
	private Date incgEdiDate;
	private Integer incgOrder;
	
	private Integer XincdCount;
	
	
	
	
	public Integer getXincdCount() {
		return XincdCount;
	}
	public void setXincdCount(Integer xincdCount) {
		XincdCount = xincdCount;
	}
	public String getIncgSeq() {
		return incgSeq;
	}
	public void setIncgSeq(String incgSeq) {
		this.incgSeq = incgSeq;
	}
	public String getIncgName() {
		return incgName;
	}
	public void setIncgName(String incgName) {
		this.incgName = incgName;
	}
	public Integer getIncgUseNy() {
		return incgUseNy;
	}
	public void setIncgUseNy(Integer incgUseNy) {
		this.incgUseNy = incgUseNy;
	}
	public Integer getIncgDelNy() {
		return incgDelNy;
	}
	public void setIncgDelNy(Integer incgDelNy) {
		this.incgDelNy = incgDelNy;
	}
	public String getIncgDesc() {
		return incgDesc;
	}
	public void setIncgDesc(String incgDesc) {
		this.incgDesc = incgDesc;
	}
	public Date getIncgRegDate() {
		return incgRegDate;
	}
	public void setIncgRegDate(Date incgRegDate) {
		this.incgRegDate = incgRegDate;
	}
	public Date getIncgEdiDate() {
		return incgEdiDate;
	}
	public void setIncgEdiDate(Date incgEdiDate) {
		this.incgEdiDate = incgEdiDate;
	}
	public Integer getIncgOrder() {
		return incgOrder;
	}
	public void setIncgOrder(Integer incgOrder) {
		this.incgOrder = incgOrder;
	}
}

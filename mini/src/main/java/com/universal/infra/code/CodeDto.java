package com.universal.infra.code;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeDto {
	
	private String incdSeq;
	private String incdName;
	private Integer incdUseNy;
	private Integer incdDelNy;
	private String incdDesc;
	private Integer incdOrder;
	private Date incdRegDate;
	private Date incdEdiDate;
	private String inCodegroup_incgSeq;
	//codegroup
	private String incgSeq;
	private String incgName;
	
	
	// for cache
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();
	
	
	
	
	public static List<CodeDto> getCachedCodeArrayList() {
		return cachedCodeArrayList;
	}
	public static void setCachedCodeArrayList(List<CodeDto> cachedCodeArrayList) {
		CodeDto.cachedCodeArrayList = cachedCodeArrayList;
	}
	public String getIncdSeq() {
		return incdSeq;
	}
	public void setIncdSeq(String incdSeq) {
		this.incdSeq = incdSeq;
	}
	public String getIncdName() {
		return incdName;
	}
	public void setIncdName(String incdName) {
		this.incdName = incdName;
	}
	public Integer getIncdUseNy() {
		return incdUseNy;
	}
	public void setIncdUseNy(Integer incdUseNy) {
		this.incdUseNy = incdUseNy;
	}
	public Integer getIncdDelNy() {
		return incdDelNy;
	}
	public void setIncdDelNy(Integer incdDelNy) {
		this.incdDelNy = incdDelNy;
	}
	public String getIncdDesc() {
		return incdDesc;
	}
	public void setIncdDesc(String incdDesc) {
		this.incdDesc = incdDesc;
	}
	public Integer getIncdOrder() {
		return incdOrder;
	}
	public void setIncdOrder(Integer incdOrder) {
		this.incdOrder = incdOrder;
	}
	public Date getIncdRegDate() {
		return incdRegDate;
	}
	public void setIncdRegDate(Date incdRegDate) {
		this.incdRegDate = incdRegDate;
	}
	public Date getIncdEdiDate() {
		return incdEdiDate;
	}
	public void setIncdEdiDate(Date incdEdiDate) {
		this.incdEdiDate = incdEdiDate;
	}
	public String getInCodegroup_incgSeq() {
		return inCodegroup_incgSeq;
	}
	public void setInCodegroup_incgSeq(String inCodegroup_incgSeq) {
		this.inCodegroup_incgSeq = inCodegroup_incgSeq;
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
	
	
	
	

}

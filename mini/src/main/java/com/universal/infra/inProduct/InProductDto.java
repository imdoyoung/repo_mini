package com.universal.infra.inProduct;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class InProductDto {
	
	private String inproSeq;
	private Integer inproType;		//code 연결
	private String inproName;
	private String inproContent;
	private String inproPrice;
	private Integer inproTosNy;
	private Integer inproGrade;		//code 연결
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date inproStartDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date inproEndDate;
	private Integer inproDelNy;
	
	// ------ getter/setter ------
	public String getInproSeq() {
		return inproSeq;
	}
	public void setInproSeq(String inproSeq) {
		this.inproSeq = inproSeq;
	}
	public Integer getInproType() {
		return inproType;
	}
	public void setInproType(Integer inproType) {
		this.inproType = inproType;
	}
	public String getInproName() {
		return inproName;
	}
	public void setInproName(String inproName) {
		this.inproName = inproName;
	}
	public String getInproContent() {
		return inproContent;
	}
	public void setInproContent(String inproContent) {
		this.inproContent = inproContent;
	}
	public String getInproPrice() {
		return inproPrice;
	}
	public void setInproPrice(String inproPrice) {
		this.inproPrice = inproPrice;
	}
	public Integer getInproTosNy() {
		return inproTosNy;
	}
	public void setInproTosNy(Integer inproTosNy) {
		this.inproTosNy = inproTosNy;
	}
	public Integer getInproGrade() {
		return inproGrade;
	}
	public void setInproGrade(Integer inproGrade) {
		this.inproGrade = inproGrade;
	}
	public Date getInproStartDate() {
		return inproStartDate;
	}
	public void setInproStartDate(Date inproStartDate) {
		this.inproStartDate = inproStartDate;
	}
	public Date getInproEndDate() {
		return inproEndDate;
	}
	public void setInproEndDate(Date inproEndDate) {
		this.inproEndDate = inproEndDate;
	}
	public Integer getInproDelNy() {
		return inproDelNy;
	}
	public void setInproDelNy(Integer inproDelNy) {
		this.inproDelNy = inproDelNy;
	}
	

}

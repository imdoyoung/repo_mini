package com.universal.infra.inStaff;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InStaffDto {
	
	private String instSeq;
	private String instName;
	private Integer instGender;
	private Integer instposition;
	private String instId;
	private String instPw;
	private String instTel;
	private String instEmail;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date instRegDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date instEdiDate;
	private Integer instDelNy;
	//--
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
	public Integer getInstGender() {
		return instGender;
	}
	public void setInstGender(Integer instGender) {
		this.instGender = instGender;
	}
	public Integer getInstposition() {
		return instposition;
	}
	public void setInstposition(Integer instposition) {
		this.instposition = instposition;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstPw() {
		return instPw;
	}
	public void setInstPw(String instPw) {
		this.instPw = instPw;
	}
	public String getInstTel() {
		return instTel;
	}
	public void setInstTel(String instTel) {
		this.instTel = instTel;
	}
	public String getInstEmail() {
		return instEmail;
	}
	public void setInstEmail(String instEmail) {
		this.instEmail = instEmail;
	}
	public Date getInstRegDate() {
		return instRegDate;
	}
	public void setInstRegDate(Date instRegDate) {
		this.instRegDate = instRegDate;
	}
	public Date getInstEdiDate() {
		return instEdiDate;
	}
	public void setInstEdiDate(Date instEdiDate) {
		this.instEdiDate = instEdiDate;
	}
	public Integer getInstDelNy() {
		return instDelNy;
	}
	public void setInstDelNy(Integer instDelNy) {
		this.instDelNy = instDelNy;
	}
	
	
	
	
	

}

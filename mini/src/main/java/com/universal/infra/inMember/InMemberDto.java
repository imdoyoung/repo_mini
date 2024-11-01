package com.universal.infra.inMember;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class InMemberDto {
	
	private String inmeSeq;
	private String inmeName;
	private Integer inmeGender;
	private String inmeTel;
	private String inmeIdNumberFr;
	private String inmeIdNumberBa;
	private String inmeZipCode;
	private String inmeAddr;
	private String inmeAddrDetail;
	private String inmeId;
	private String inmePw;
	private String inmeEmail;
	private Integer inmeGrade;
	private Integer inmeJobNy;
	private Integer inmeDiseaseNy;
	private Integer inmeBankType;
	private String inmeAccNo;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inmeRegDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inmeEdiDate;
	private Integer inmeTosNy;
	private Integer inmeMktNy;
	private Integer inmeDelNy;
	//--
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
	public String getInmeId() {
		return inmeId;
	}
	public void setInmeId(String inmeId) {
		this.inmeId = inmeId;
	}
	public String getInmePw() {
		return inmePw;
	}
	public void setInmePw(String inmePw) {
		this.inmePw = inmePw;
	}
	public String getInmeEmail() {
		return inmeEmail;
	}
	public void setInmeEmail(String inmeEmail) {
		this.inmeEmail = inmeEmail;
	}
	public Integer getInmeGrade() {
		return inmeGrade;
	}
	public void setInmeGrade(Integer inmeGrade) {
		this.inmeGrade = inmeGrade;
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
	public Integer getInmeBankType() {
		return inmeBankType;
	}
	public void setInmeBankType(Integer inmeBankType) {
		this.inmeBankType = inmeBankType;
	}
	public String getInmeAccNo() {
		return inmeAccNo;
	}
	public void setInmeAccNo(String inmeAccNo) {
		this.inmeAccNo = inmeAccNo;
	}
	public Date getInmeRegDate() {
		return inmeRegDate;
	}
	public void setInmeRegDate(Date inmeRegDate) {
		this.inmeRegDate = inmeRegDate;
	}
	public Date getInmeEdiDate() {
		return inmeEdiDate;
	}
	public void setInmeEdiDate(Date inmeEdiDate) {
		this.inmeEdiDate = inmeEdiDate;
	}
	public Integer getInmeTosNy() {
		return inmeTosNy;
	}
	public void setInmeTosNy(Integer inmeTosNy) {
		this.inmeTosNy = inmeTosNy;
	}
	public Integer getInmeMktNy() {
		return inmeMktNy;
	}
	public void setInmeMktNy(Integer inmeMktNy) {
		this.inmeMktNy = inmeMktNy;
	}
	public Integer getInmeDelNy() {
		return inmeDelNy;
	}
	public void setInmeDelNy(Integer inmeDelNy) {
		this.inmeDelNy = inmeDelNy;
	}

	
	
	
	
	

}

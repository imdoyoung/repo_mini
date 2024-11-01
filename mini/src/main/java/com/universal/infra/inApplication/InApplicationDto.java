package com.universal.infra.inApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class InApplicationDto {
	
	private String inappSeq;
	private Integer inappRequType;		//code 연결
	private Integer inappGender;		//code 연결
	private Integer inappRecBankType; 	//code 연결
	private String inappRecAccNo;
	private Integer inappTosNy;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inappRegDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inappEdiDate;
	private Integer inappDelNy;
	private String inMember_inmeSeq;
	
	// inMember에서 가져올 데이터 추가 및 getter/setter
	private String inmeSeq;
	private String inmeName;
	private String inmeTel;
	private String inmeIdNumberFr;
	private String inmeIdNumberBa;
	private String inmeZipCode;
	private String inmeAddr;
	private String inmeAddrDetail;
	private String inmeEmail;
	private Integer inmeJobNy;
	private Integer inmeDiseaseNy;
	
	
	// ------ getter/setter ------
	public String getInappSeq() {
		return inappSeq;
	}
	public void setInappSeq(String inappSeq) {
		this.inappSeq = inappSeq;
	}
	public Integer getInappRequType() {
		return inappRequType;
	}
	public void setInappRequType(Integer inappRequType) {
		this.inappRequType = inappRequType;
	}
	public Integer getInappGender() {
		return inappGender;
	}
	public void setInappGender(Integer inappGender) {
		this.inappGender = inappGender;
	}
	public Integer getInappRecBankType() {
		return inappRecBankType;
	}
	public void setInappRecBankType(Integer inappRecBankType) {
		this.inappRecBankType = inappRecBankType;
	}
	public String getInappRecAccNo() {
		return inappRecAccNo;
	}
	public void setInappRecAccNo(String inappRecAccNo) {
		this.inappRecAccNo = inappRecAccNo;
	}
	public Integer getInappTosNy() {
		return inappTosNy;
	}
	public void setInappTosNy(Integer inappTosNy) {
		this.inappTosNy = inappTosNy;
	}
	public Date getInappRegDate() {
		return inappRegDate;
	}
	public void setInappRegDate(Date inappRegDate) {
		this.inappRegDate = inappRegDate;
	}
	public Date getInappEdiDate() {
		return inappEdiDate;
	}
	public void setInappEdiDate(Date inappEdiDate) {
		this.inappEdiDate = inappEdiDate;
	}
	public Integer getInappDelNy() {
		return inappDelNy;
	}
	public void setInappDelNy(Integer inappDelNy) {
		this.inappDelNy = inappDelNy;
	}
	public String getInMember_inmeSeq() {
		return inMember_inmeSeq;
	}
	public void setInMember_inmeSeq(String inMember_inmeSeq) {
		this.inMember_inmeSeq = inMember_inmeSeq;
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
	
	
	
}

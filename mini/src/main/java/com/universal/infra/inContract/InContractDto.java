package com.universal.infra.inContract;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InContractDto {
	
	private String inconSeq;
	private Integer inconCondition;
	private String inconSettleDate;
	private String inconRefund;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inconRegDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date inconEdiDate;
	private Integer inconDelNy;
	private String inApplication_inappSeq;
	private String inMember_inmeSeq;
	private String inStaff_instSeq;
	private String inProduct_inproSeq;
	
	// inMember(c)
	private String inmeName;
	private String inmeIdNumberFr;
	private String inmeIdNumberBa;
	private Integer inmeJobNy;
	
	// inApplication(e)
	private Integer inappRequType;
	private Integer inappRecBankType;
	private String inappRecAccNo;
	
	// inProduct(f)
	private String inproName;
	private Integer inproGrade;
	private String inproContent;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date inproStartDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date inproEndDate;
	
	//inStaff(d)
	private String instId;

	// ------- getter/setter ------
	public String getInconSeq() {
		return inconSeq;
	}

	public void setInconSeq(String inconSeq) {
		this.inconSeq = inconSeq;
	}

	public Integer getInconCondition() {
		return inconCondition;
	}

	public void setInconCondition(Integer inconCondition) {
		this.inconCondition = inconCondition;
	}

	public String getInconSettleDate() {
		return inconSettleDate;
	}

	public void setInconSettleDate(String inconSettleDate) {
		this.inconSettleDate = inconSettleDate;
	}

	public String getInconRefund() {
		return inconRefund;
	}

	public void setInconRefund(String inconRefund) {
		this.inconRefund = inconRefund;
	}

	public Date getInconRegDate() {
		return inconRegDate;
	}

	public void setInconRegDate(Date inconRegDate) {
		this.inconRegDate = inconRegDate;
	}

	public Date getInconEdiDate() {
		return inconEdiDate;
	}

	public void setInconEdiDate(Date inconEdiDate) {
		this.inconEdiDate = inconEdiDate;
	}

	public Integer getInconDelNy() {
		return inconDelNy;
	}

	public void setInconDelNy(Integer inconDelNy) {
		this.inconDelNy = inconDelNy;
	}

	public String getInApplication_inappSeq() {
		return inApplication_inappSeq;
	}

	public void setInApplication_inappSeq(String inApplication_inappSeq) {
		this.inApplication_inappSeq = inApplication_inappSeq;
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

	public String getInProduct_inproSeq() {
		return inProduct_inproSeq;
	}

	public void setInProduct_inproSeq(String inProduct_inproSeq) {
		this.inProduct_inproSeq = inProduct_inproSeq;
	}

	public String getInmeName() {
		return inmeName;
	}

	public void setInmeName(String inmeName) {
		this.inmeName = inmeName;
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

	public Integer getInmeJobNy() {
		return inmeJobNy;
	}

	public void setInmeJobNy(Integer inmeJobNy) {
		this.inmeJobNy = inmeJobNy;
	}

	public Integer getInappRequType() {
		return inappRequType;
	}

	public void setInappRequType(Integer inappRequType) {
		this.inappRequType = inappRequType;
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

	public String getInproName() {
		return inproName;
	}

	public void setInproName(String inproName) {
		this.inproName = inproName;
	}

	public Integer getInproGrade() {
		return inproGrade;
	}

	public void setInproGrade(Integer inproGrade) {
		this.inproGrade = inproGrade;
	}

	public String getInproContent() {
		return inproContent;
	}

	public void setInproContent(String inproContent) {
		this.inproContent = inproContent;
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

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	
}

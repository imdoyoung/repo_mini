package com.universal.infra.inQnaBoard;

import java.util.Date;

public class InQnaBoardDto {
	
	private String inqbSeq; 
	private Integer inqbType; 
	private String inqbTitle; 
	private String inqbContent; 
	private Integer inqbCompleteNy; 
	private Integer inqbDelNy; 
	private Date inqbRegDate; 
	private Date inqbEdiDate; 
	private String inMember_inmeSeq; 
	private String inStaff_instSeq;
	private Integer inQnaBoard_inqbSeq;
	
	
	
	public Integer getInQnaBoard_inqbSeq() {
		return inQnaBoard_inqbSeq;
	}
	public void setInQnaBoard_inqbSeq(Integer inQnaBoard_inqbSeq) {
		this.inQnaBoard_inqbSeq = inQnaBoard_inqbSeq;
	}
	public String getInqbSeq() {
		return inqbSeq;
	}
	public void setInqbSeq(String inqbSeq) {
		this.inqbSeq = inqbSeq;
	}
	public Integer getInqbType() {
		return inqbType;
	}
	public void setInqbType(Integer inqbType) {
		this.inqbType = inqbType;
	}
	public String getInqbTitle() {
		return inqbTitle;
	}
	public void setInqbTitle(String inqbTitle) {
		this.inqbTitle = inqbTitle;
	}
	public String getInqbContent() {
		return inqbContent;
	}
	public void setInqbContent(String inqbContent) {
		this.inqbContent = inqbContent;
	}
	public Integer getInqbCompleteNy() {
		return inqbCompleteNy;
	}
	public void setInqbCompleteNy(Integer inqbCompleteNy) {
		this.inqbCompleteNy = inqbCompleteNy;
	}
	public Integer getInqbDelNy() {
		return inqbDelNy;
	}
	public void setInqbDelNy(Integer inqbDelNy) {
		this.inqbDelNy = inqbDelNy;
	}
	public Date getInqbRegDate() {
		return inqbRegDate;
	}
	public void setInqbRegDate(Date inqbRegDate) {
		this.inqbRegDate = inqbRegDate;
	}
	public Date getInqbEdiDate() {
		return inqbEdiDate;
	}
	public void setInqbEdiDate(Date inqbEdiDate) {
		this.inqbEdiDate = inqbEdiDate;
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
	
	
}

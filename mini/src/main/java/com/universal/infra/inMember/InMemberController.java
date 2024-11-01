package com.universal.infra.inMember;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.universal.common.constants.Constants;
import com.universal.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;

@Controller
public class InMemberController { 
	
	@Autowired
	InMemberService inMemberService;  
	
	// selectlist
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmList")
	public String inMemberXdmList(@ModelAttribute("vo") InMemberVo inMemberVo, Model model) {
		
		/* 초기값 세팅이 없는 경우 사용 */
		// shDateStart 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
		inMemberVo.setShDateStart(inMemberVo.getShDateStart() == null || inMemberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inMemberVo.getShDateStart()));
		// shDateEnd 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
		inMemberVo.setShDateEnd(inMemberVo.getShDateEnd() == null || inMemberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inMemberVo.getShDateEnd()));
		
		inMemberVo.setParamsPaging(inMemberService.selectOneCount(inMemberVo)); // paging 
		
		if(inMemberVo.getTotalRows() > 0) {
			model.addAttribute("memberList", inMemberService.selectMemberList(inMemberVo));
		}
		
		return "/xdm/v1/infra/inMember/inMemberXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmForm")
	public String inMemberXdmForm() {
		
		return "/xdm/v1/infra/inMember/inMemberXdmForm";
	}
	
	// insert
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmInst")
	public String inMemberXdmInst(InMemberDto inMemberDto) {
		
		inMemberService.memberInsert(inMemberDto);
		return "redirect:/xdm/v1/infra/inMember/inMemberXdmList";
	}
	
	// selectOne
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmMForm")
	public String inMemberXdmMForm(InMemberDto inMemberDto, Model model) {
		
		model.addAttribute("memberItem", inMemberService.selectOneMember(inMemberDto));
		return "/xdm/v1/infra/inMember/inMemberXdmMForm";
	}
	
	// update 
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmUpdt")
	public String inMemberXdmUpdt(InMemberDto inMemberDto) {
		
		inMemberService.memberUpdate(inMemberDto);
		return "redirect:/xdm/v1/infra/inMember/inMemberXdmList";
	}
	
	// update delete
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmUdel")
	public String inMemberXdmUdel(InMemberDto inMemberDto) {
		
		inMemberService.membertUelete(inMemberDto);
		return "redirect:/xdm/v1/infra/inMember/inMemberXdmList";
	}
	
	
	
	

	   
	
	
	
	

	
	
	       

}

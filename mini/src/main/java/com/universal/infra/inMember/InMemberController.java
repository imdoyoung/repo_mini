package com.universal.infra.inMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InMemberController { 
	
	@Autowired
	InMemberService inMemberService;  
	
	// list
	@RequestMapping(value="/xdm/v1/infra/inMember/inMemberXdmList")
	public String inMemberXdmList(InMemberVo inMemberVo, Model model) {
		
		inMemberVo.setShDateStart(inMemberVo.getShDateStart() + " 00:00:00"); 
		inMemberVo.setShDateEnd(inMemberVo.getShDateEnd() + " 23:59:59");
		
		model.addAttribute("memberList", inMemberService.selectMemberList(inMemberVo));
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
	
	       

}

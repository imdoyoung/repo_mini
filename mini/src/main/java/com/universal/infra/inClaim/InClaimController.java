package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InClaimController {
	
	@Autowired
	InClaimService inClaimService;
	
// ==================== inCalimAccept ==================== //

	// ClaimAccept: Lsit-inClaimAcceptSelectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmList")
	public String inClaimAcceptXdmList(Model model) {
		
		model.addAttribute("list", inClaimService.inClaimAcceptSelectList());
		
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmForm")
	public String inClaimAcceptXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmForm";
	}
	
	// ClaimAccept: Inst
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmInst")
	public String inClaimAcceptXdmInst(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptInsert(inClaimDto);
		System.out.println("inst 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}

	// ClaimAccept: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom")
	public String inClaimAcceptXdmMfom(InClaimDto inClaimDto, Model model) {
		model.addAttribute("item", inClaimService.inClaimAcceptSelectOne(inClaimDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom";
	}
	
	// ClaimAccept: Updt
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmUpdt")
	public String inClaimAcceptXdmUpdt(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptUpdate(inClaimDto);
		System.out.println("updt 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Uel
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmUel")
	public String inClaimAcceptUelete(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptUelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Del
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmDel")
	public String inClaimAcceptDelete(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptDelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	
// ==================== inCalimProcess ==================== //
	
	// ClaimProcess: Lsit-inClaimProcessSelectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmList")
	public String inClaimProcessXdmList(Model model) {
		
		model.addAttribute("list", inClaimService.inClaimProcessSelectList());
		
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmForm")
	public String inClaimProcessXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmForm";
	}
	
	// ClaimProcess: Inst
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmInst")
	public String inClaimProcessXdmInst(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessInsert(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmMfom")
	public String inClaimProcessXdmMfom(InClaimDto inClaimDto, Model model) {
		model.addAttribute("item", inClaimService.inClaimProcessSelectOne(inClaimDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmMfom";
	}
	
	// ClaimProcess: Updt
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmUpdt")
	public String inClaimProcessUpdate(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessUpdate(inClaimDto);
		System.out.println("updt 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Uel
	@RequestMapping(value="/xdm/v1/infra/inClaim/inCalimProcessXdmUel")
	public String inClaimProcessUelete(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessUelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Del
	@RequestMapping(value="/xdm/v1/infra/inClaim/inCalimProcessXdmDel")
	public String inClaimProcessDelete(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessDelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	
	////////// inClaimAssign (클레임 배정 관리) //////////
	
	// selectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmList")
	public String inClaimAssignXdmList(Model model) {
		 
		model.addAttribute("assignList", inClaimService.inClaimAssignSelectList());
		return "/xdm/v1/infra/inClaim/inClaimAssignXdmList";
	}
	
	// Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmForm")
	public String inClaimAssignXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimAssignXdmForm";   
	}
	              
	// insert 
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmInst")
	public String inClaimAssignXdmInst(InClaimDto inClaimDto) {
		
		inClaimService.inClaimAssignInsert(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAssignXdmList";
	}
	
	// selectOne
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmMForm")
	public String inClaimAssignXdmMForm(InClaimDto inClaimDto, Model model) {
		
		model.addAttribute("assignItem", inClaimService.inClaimAssignSelectOne(inClaimDto));
		return "/xdm/v1/infra/inClaim/inClaimAssignXdmMForm";
	}
	
	// update 
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmUpdt")
	public String inClaimAssignXdmUpdt(InClaimDto inClaimDto) {
		
		inClaimService.inClaimAssignUpdate(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAssignXdmList";
	}
	
	
	
}

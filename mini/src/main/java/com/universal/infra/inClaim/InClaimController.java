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
		System.out.println("inst넘어왔다~");
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}

	// ClaimAccept: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom")
	public String inClaimAcceptXdmMfom() {
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom";
	}
		
}

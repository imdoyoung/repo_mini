package com.universal.infra.inContract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InContractController {
	
	@Autowired
	InContractService inContractService;
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmList")
	public String inContractXdmList() {
		List<InContractDto> contracts = inContractService.conSelectList();
		return "/xdm/v1/infra/inContract/inContractXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmForm")
	public String inContractXdmForm() {
		return "/xdm/v1/infra/inContract/inContractXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmMForm")
	public String inContractXdmMForm() {
		return "/xdm/v1/infra/inContract/inContractXdmMForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmInst")
	public String inContractXdmInst(InContractDto inContractDto) {
		inContractService.conInsert(inContractDto);
		return "redirect:/xdm/v1/infra/inContract/inContractXdmList";
	}
	
	

}

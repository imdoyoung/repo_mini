package com.universal.infra.codeGroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	
	// List
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}
	
	// Form
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codeGroup/codeGroupXdmForm";
	}

}

package com.universal.infra.codeGroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}

}

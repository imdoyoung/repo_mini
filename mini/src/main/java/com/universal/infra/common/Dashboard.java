package com.universal.infra.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {
	
	@RequestMapping(value="/xdm/v1/infra/common/dashboard")
	public String dashboard() {
		
		return "/xdm/v1/infra/common/dashboard";
	}

}

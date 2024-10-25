package com.universal.infra.inContract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.common.util.UtilDateTime;
import com.universal.infra.inApplication.InApplicationVo;

@Controller
public class InContractController {
	
	@Autowired
	InContractService inContractService;
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmList")
	public String inContractXdmList(@ModelAttribute("vo") InContractVo inContractVo, Model model) {
		model.addAttribute("list", inContractService.conSelectList(inContractVo));
		
		inContractVo.setShDateStart(inContractVo.getShDateStart() == null || inContractVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inContractVo.getShDateStart()));
		inContractVo.setShDateEnd(inContractVo.getShDateEnd() == null || inContractVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inContractVo.getShDateEnd()));
		
		return "/xdm/v1/infra/inContract/inContractXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmForm")
	public String inContractXdmForm() {
		return "/xdm/v1/infra/inContract/inContractXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmMForm")
	public String inContractXdmMForm(InContractDto inContractDto, Model model) {
		model.addAttribute("item", inContractService.conSelectOne(inContractDto));
		return "/xdm/v1/infra/inContract/inContractXdmMForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmInst")
	public String inContractXdmInst(InContractDto inContractDto) {
		inContractService.conInsert(inContractDto);
		return "redirect:/xdm/v1/infra/inContract/inContractXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmUpdt")
	public String inContractXdmUpdt(InContractDto inContractDto) {
		inContractService.conUpdate(inContractDto);
		return "redirect:/xdm/v1/infra/inContract/inContractXdmList";
	}

}

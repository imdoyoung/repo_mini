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
		
		inContractVo.setShDateStart(inContractVo.getShDateStart() == null || inContractVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inContractVo.getShDateStart()));
		inContractVo.setShDateEnd(inContractVo.getShDateEnd() == null || inContractVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inContractVo.getShDateEnd()));
		
		//paging
		inContractVo.setParamsPaging(inContractService.conSelectOneCount(inContractVo));

		if (inContractVo.getTotalRows() > 0) {
			model.addAttribute("list", inContractService.conSelectList(inContractVo));
		}
		
		return "xdm/v1/infra/inContract/inContractXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmForm")
	public String inContractXdmForm(Model model) {
		
		List<InContractDto> contracts = inContractService.selectListApplication();
		model.addAttribute("listApplication", inContractService.selectListApplication());
		
		List<InContractDto> staffs = inContractService.selectListStaff();
		model.addAttribute("listStaff", inContractService.selectListStaff());
		
		List<InContractDto> products = inContractService.selectListProduct();
		model.addAttribute("listProduct", inContractService.selectListProduct());
		
		return "xdm/v1/infra/inContract/inContractXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inContract/inContractXdmMForm")
	public String inContractXdmMForm(InContractDto inContractDto, Model model) {
		model.addAttribute("item", inContractService.conSelectOne(inContractDto));
		return "xdm/v1/infra/inContract/inContractXdmMForm";
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

package com.universal.infra.inApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.common.util.UtilDateTime;


@Controller
public class InApplicationController {
	
	@Autowired
	InApplicationService inApplicationService;
	
	@RequestMapping(value="/xdm/v1/infra/inApplication/inApplicationXdmList")
	public String inApplicationXdmList(@ModelAttribute("vo") InApplicationVo inApplicationVo, Model model) {
		model.addAttribute("list", inApplicationService.selectList(inApplicationVo));
		
		inApplicationVo.setShDateStart(inApplicationVo.getShDateStart() == null || inApplicationVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inApplicationVo.getShDateStart()));
		inApplicationVo.setShDateEnd(inApplicationVo.getShDateEnd() == null || inApplicationVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inApplicationVo.getShDateEnd()));
		
		return "xdm/v1/infra/inApplication/inApplicationXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inApplication/inApplicationXdmInst")
	public String inApplicationXdmInst(InApplicationDto inApplicationDto) {
		inApplicationService.AppInsert(inApplicationDto);
		return "redirect:/xdm/v1/infra/inApplication/inApplicationXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inApplication/inApplicationXdmForm")
	public String inApplicationXdmForm() {
		return "xdm/v1/infra/inApplication/inApplicationXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inApplication/inApplicationXdmMForm")
	public String inApplicationXdmMForm(InApplicationDto inApplicationDto, Model model) {
		model.addAttribute("item", inApplicationService.AppselectOne(inApplicationDto));
		return "xdm/v1/infra/inApplication/inApplicationXdmMForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inApplication/inApplicationXdmUpdt")
	public String inApplicationXdmUpdt(InApplicationDto inApplicationDto) {
		inApplicationService.AppUpdate(inApplicationDto);
		return "redirect:/xdm/v1/infra/inApplication/inApplicationXdmList";
	}

}

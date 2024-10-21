package com.universal.infra.inStaff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InStaffController {
	
	@Autowired
	InStaffService inStaffService;
	
	// selectList
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmList")
	public String inStaffXdmList(InStaffVo inStaffVo, Model model) {
		
		inStaffVo.setShDateStart(inStaffVo.getShDateStart() + " 00:00:00"); 
		inStaffVo.setShDateEnd(inStaffVo.getShDateEnd() + " 23:59:59");
		 
		model.addAttribute("staffList", inStaffService.selectStaffList(inStaffVo));
		return "/xdm/v1/infra/inStaff/inStaffXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmForm")
	public String inStaffXdmForm() {
		return "/xdm/v1/infra/inStaff/inStaffXdmForm";
	}
	
	// insert
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmInst")
	public String inStaffXdmInst(InStaffDto inStaffDto) {
		
		inStaffService.staffInsert(inStaffDto);
		return "redirect:/xdm/v1/infra/inStaff/inStaffXdmList";
	}
	
	// selectOne
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmMForm")
	public String inStaffXdmMForm(InStaffDto inStaffDto, Model model) {
		
		model.addAttribute("staffItem", inStaffService.selectOneStaff(inStaffDto));
		return "/xdm/v1/infra/inStaff/inStaffXdmMForm";
	}
	
	// update 
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmUpdt")
	public String inStaffXdmUpdt(InStaffDto inStaffDto) {
		
		inStaffService.staffUpdate(inStaffDto);
		return "redirect:/xdm/v1/infra/inStaff/inStaffXdmList";
	} 

}

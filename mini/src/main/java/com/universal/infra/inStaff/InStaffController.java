package com.universal.infra.inStaff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.common.util.UtilDateTime;

@Controller
public class InStaffController {
	
	@Autowired
	InStaffService inStaffService;
	
	// selectList
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmList")
	public String inStaffXdmList(@ModelAttribute("vo") InStaffVo inStaffVo, Model model) {
		
		/* 초기값 세팅이 없는 경우 사용 */
		// shDateStart 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
		inStaffVo.setShDateStart(inStaffVo.getShDateStart() == null || inStaffVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inStaffVo.getShDateStart()));
		// shDateEnd 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
		inStaffVo.setShDateEnd(inStaffVo.getShDateEnd() == null || inStaffVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inStaffVo.getShDateEnd()));
		
		inStaffVo.setParamsPaging(inStaffService.selectOneCount(inStaffVo)); // paging
		
		if(inStaffVo.getTotalRows() > 0) {
			model.addAttribute("staffList", inStaffService.selectStaffList(inStaffVo));
		}
		 
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
	
	// update delete
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmUdel")
	public String inStaffXdmUdel(InStaffDto inStaffDto) {
		
		inStaffService.stafftUelete(inStaffDto);
		return "redirect:/xdm/v1/infra/inStaff/inStaffXdmList";
	}
	
	
	

}

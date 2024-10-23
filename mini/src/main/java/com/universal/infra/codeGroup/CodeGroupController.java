package com.universal.infra.codeGroup;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeGroupController {
 @Autowired	
 CodeGroupService codeGroupService;	
	
	
	// List
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo")CodeGroupVo codegroupvo, Model model) {
		codegroupvo.setParamsPaging(codeGroupService.selectOneCount(codegroupvo));
		System.out.println("StartRnumForMysql : "+codegroupvo.getStartRnumForMysql());
		System.out.println("RowNumToShow : "+codegroupvo.getRowNumToShow());
		codegroupvo.setShDateStart(codegroupvo.getShDateStart() == null || codegroupvo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codegroupvo.getShDateStart()));
		codegroupvo.setShDateEnd(codegroupvo.getShDateEnd() == null || codegroupvo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codegroupvo.getShDateEnd()));
		if (codegroupvo.getTotalRows() > 0) {
		model.addAttribute("list", codeGroupService.selectList(codegroupvo));
		}
		return "/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}
	
	// Form 
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codeGroup/codeGroupXdmForm";
	}
	
	//insert
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {
		codeGroupService.insert(codeGroupDto);
		return "redirect:/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}
	//MForm
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmMForm")
	public String codeGroupXdmMform(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item", codeGroupService.selectOne(codeGroupDto));
		return "/xdm/v1/infra/codeGroup/codeGroupXdmMForm";
	}
	//UPDATE
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		codeGroupService.update(codeGroupDto);
		return "redirect:/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}
	//Delete
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmDele")
	public String codeGroupXdmDele(CodeGroupDto codeGroupDto) {
		codeGroupService.delete(codeGroupDto);
		return "redirect:/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}
	//Uelete
	@RequestMapping(value="/xdm/v1/infra/codeGroup/codeGroupXdmUele")
	public String codeGroupXdmUele(CodeGroupDto codeGroupDto) {
		codeGroupService.uelete(codeGroupDto);
		return "redirect:/xdm/v1/infra/codeGroup/codeGroupXdmList";
	}

}

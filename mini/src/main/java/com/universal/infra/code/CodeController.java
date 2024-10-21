package com.universal.infra.code;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.infra.codeGroup.CodeGroupDto;
import com.universal.infra.codeGroup.CodeGroupVo;

import jakarta.annotation.PostConstruct;


@Controller
public class CodeController {

	@Autowired
	CodeService codeService;
	
	// List
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList(@ModelAttribute("vo")CodeVo codevo, Model model) {
			codevo.setParamsPaging(codeService.selectOneCount(codevo));
			System.out.println("StartRnumForMysql : "+codevo.getStartRnumForMysql());
			System.out.println("RowNumToShow : "+codevo.getRowNumToShow());
			if (codevo.getTotalRows() > 0) {
			model.addAttribute("list", codeService.selectList(codevo));
			}
			return "/xdm/v1/infra/code/codeXdmList";
		}
		
		// Form -codegroup
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmForm")
		public String codeXdmForm(Model model) {
			List<CodeDto>codegroups=codeService.selectListCodeGroup();
			model.addAttribute("listCodeGroup", codegroups);
			return "/xdm/v1/infra/code/codeXdmForm";
		}	
		
		//insert
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmInst")
		public String codeXdmInst(CodeDto codeDto) {
			codeService.insert(codeDto);
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		//MForm
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmMForm")
		public String codeXdmMform(CodeDto codeDto, Model model) {
			model.addAttribute("item", codeService.selectOne(codeDto));
			List<CodeDto>codegroups=codeService.selectListCodeGroup();
			model.addAttribute("listCodeGroup", codegroups);
			return "/xdm/v1/infra/code/codeXdmMForm";
		}
		//UPDATE
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmUpdt")
		public String codeXdmUpdt(CodeDto codeDto) {
			codeService.update(codeDto);
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		
		//Delete
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmDele")
		public String codeXdmDele(CodeDto codeDto) {
			codeService.delete(codeDto);
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		//Uelete
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmUele")
		public String codeXdmUele(CodeDto codeDto) {
			codeService.uelete(codeDto);
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		// 
		
		

}

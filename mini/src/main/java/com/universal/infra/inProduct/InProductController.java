package com.universal.infra.inProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.common.util.UtilDateTime;
import com.universal.infra.inApplication.InApplicationVo;

@Controller
public class InProductController {
	
	@Autowired
	InProductService inProductService;
	
	@RequestMapping(value="/xdm/v1/infra/inProduct/inProductXdmList")
	public String inProductXdmList(@ModelAttribute("vo") InProductVo inProductVo, Model model) {
		model.addAttribute("list", inProductService.ProSelectList(inProductVo));
		
		inProductVo.setShDateStart(inProductVo.getShDateStart() == null || inProductVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inProductVo.getShDateStart()));
		inProductVo.setShDateEnd(inProductVo.getShDateEnd() == null || inProductVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inProductVo.getShDateEnd()));
		return "/xdm/v1/infra/inProduct/inProductXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inProduct/inProductXdmForm")
	public String inProductXdmForm() {
		return "/xdm/v1/infra/inProduct/inProductXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inProduct/inProductXdmInst")
	public String inProductXdmInst(InProductDto inProductDto) {
		inProductService.ProInsert(inProductDto);
		return "redirect:/xdm/v1/infra/inProduct/inProductXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inProduct/inProductXdmMForm")
	public String inProductXdmMForm(InProductDto inProductDto, Model model) {
		model.addAttribute("item", inProductService.ProSelectOne(inProductDto));
		return "/xdm/v1/infra/inProduct/inProductXdmMForm";
	}

	@RequestMapping(value="/xdm/v1/infra/inProduct/inProductXdmUpdt")
	public String inProductXdmUpdt(InProductDto inProductDto) {
		inProductService.ProUpdate(inProductDto);
		return "redirect:/xdm/v1/infra/inProduct/inProductXdmList";
	}
	

}

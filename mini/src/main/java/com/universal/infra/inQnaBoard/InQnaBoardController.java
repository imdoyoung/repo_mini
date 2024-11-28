package com.universal.infra.inQnaBoard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.infra.codeGroup.UtilDateTime;


@Controller
public class InQnaBoardController {
	@Autowired
	InQnaBoardService inQnaBoardService;
	
	// List
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmList")
	public String inQnaBoardXdmList(@ModelAttribute("vo")InQnaBoardVo inQnaBoardvo,Model model) {
		inQnaBoardvo.setParamsPaging(inQnaBoardService.selectOneCount(inQnaBoardvo));
		System.out.println("StartRnumForMysql : "+inQnaBoardvo.getStartRnumForMysql());
		System.out.println("RowNumToShow : "+inQnaBoardvo.getRowNumToShow());
		inQnaBoardvo.setShDateStart(inQnaBoardvo.getShDateStart() == null || inQnaBoardvo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inQnaBoardvo.getShDateStart()));
		inQnaBoardvo.setShDateEnd(inQnaBoardvo.getShDateEnd() == null || inQnaBoardvo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inQnaBoardvo.getShDateEnd()));
		
		if (inQnaBoardvo.getTotalRows() > 0) {
		model.addAttribute("list", inQnaBoardService.selectList(inQnaBoardvo));
		}
		return "xdm/v1/infra/inQnaBoard/inQnaBoardXdmList";
	}
	
	// Form-member 
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmForm")
	public String inQnaBoardXdmForm(InQnaBoardDto inQnaBoardDto,Model model) {
		List<InQnaBoardDto>inQnaBoards=inQnaBoardService.selectListInQnaBoard();
		model.addAttribute("listMember", inQnaBoards);
		model.addAttribute("item", inQnaBoardService.selectOne(inQnaBoardDto));
		return "xdm/v1/infra/inQnaBoard/inQnaBoardXdmForm";
	}
	
	
	// MForm 
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmMForm")
	public String inQnaBoardXdmMForm(InQnaBoardDto inQnaBoardDto,Model model) {
		List<InQnaBoardDto>inQnaBoards=inQnaBoardService.selectListInQnaBoard();
		model.addAttribute("listMember", inQnaBoards);
		model.addAttribute("item", inQnaBoardService.selectOne(inQnaBoardDto));
		return "xdm/v1/infra/inQnaBoard/inQnaBoardXdmMForm";
	}
		
	//reForm 
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmReForm")
	public String inQnaBoardXdmReForm(InQnaBoardDto inQnaBoardDto,Model model) {
		List<InQnaBoardDto>inQnaBoard=inQnaBoardService.selectstaffInQnaBoard();
		model.addAttribute("listStep", inQnaBoard);
		List<InQnaBoardDto>inQnaBoards=inQnaBoardService.selectListInQnaBoard();
		model.addAttribute("listMember", inQnaBoards);
		model.addAttribute("item", inQnaBoardService.selectOne(inQnaBoardDto));
		return "xdm/v1/infra/inQnaBoard/inQnaBoardXdmReForm";
	}
	//reMForm 
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmReMForm")
	public String inQnaBoardXdmReMForm(InQnaBoardDto inQnaBoardDto,Model model) {
		List<InQnaBoardDto>inQnaBoards=inQnaBoardService.selectListInQnaBoard();
		model.addAttribute("listMember", inQnaBoards);
		model.addAttribute("item", inQnaBoardService.selectOne(inQnaBoardDto));
		return "xdm/v1/infra/inQnaBoard/inQnaBoardXdmReMForm";
	}
	//UPDATE
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmUpdt")
	public String inQnaBoardXdmUpdt(InQnaBoardDto inQnaBoardDto) {
		inQnaBoardService.update(inQnaBoardDto);
		return "redirect:/xdm/v1/infra/inQnaBoard/inQnaBoardXdmList";
	}	
		
	//insert
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmInst")
	public String inQnaBoardXdmInst(InQnaBoardDto inQnaBoardDto) {
		inQnaBoardService.insert(inQnaBoardDto);
		return "redirect:/xdm/v1/infra/inQnaBoard/inQnaBoardXdmList";
	}	
		
	//Delete
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmDele")
	public String codeGroupXdmDele(InQnaBoardDto inQnaBoardDto) {
		inQnaBoardService.delete(inQnaBoardDto);
		return "redirect:/xdm/v1/infra/inQnaBoard/inQnaBoardXdmList";
	}
	//Uelete
	@RequestMapping(value="/xdm/v1/infra/inQnaBoard/inQnaBoardXdmUele")
	public String codeGroupXdmUele(InQnaBoardDto inQnaBoardDto) {
		inQnaBoardService.uelete(inQnaBoardDto);
		return "redirect:/xdm/v1/infra/inQnaBoard/inQnaBoardXdmList";
	}
}

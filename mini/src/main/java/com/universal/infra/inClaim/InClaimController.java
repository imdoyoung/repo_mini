package com.universal.infra.inClaim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.universal.common.util.UtilDateTime;

@Controller
public class InClaimController {
	
	@Autowired
	InClaimService inClaimService;
	
// ==================== inCalimAccept ==================== //

	// ClaimAccept: Lsit-inClaimAcceptSelectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmList")
	public String inClaimAcceptXdmList(@ModelAttribute("vo") InClaimVo inClaimVo, Model model) {
		
		// 날짜 필드에 시간 추가
//		inClaimVo.setShStartDate(inClaimVo.getShStartDate()+" 00:00:00");			
//		inClaimVo.setShEndDate(inClaimVo.getShEndDate()+" 23:59:59");
		// 초기값 세팅이 없는 경우 사용
		inClaimVo.setShStartDate(inClaimVo.getShStartDate() == null || inClaimVo.getShStartDate() == "" ? null : UtilDateTime.add00TimeString(inClaimVo.getShStartDate()));
		inClaimVo.setShEndDate(inClaimVo.getShEndDate() == null || inClaimVo.getShEndDate() == "" ? null : UtilDateTime.add59TimeString(inClaimVo.getShEndDate()));
		
		// paging
		inClaimVo.setParamsPaging(inClaimService.inClaimAcceptSelectOneCount(inClaimVo));
		
		if(inClaimVo.getTotalRows() > 0) {
			model.addAttribute("list", inClaimService.inClaimAcceptSelectList(inClaimVo));
		}
		
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmForm")
	public String inClaimAcceptXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmForm";
	}
	
	// ClaimAccept: Inst
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmInst")
	public String inClaimAcceptXdmInst(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptInsert(inClaimDto);
		System.out.println("inst 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}

	// ClaimAccept: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom")
	public String inClaimAcceptXdmMfom(InClaimDto inClaimDto, Model model) {
		model.addAttribute("item", inClaimService.inClaimAcceptSelectOne(inClaimDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/inClaim/inClaimAcceptXdmMfom";
	}
	
	// ClaimAccept: Updt
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmUpdt")
	public String inClaimAcceptXdmUpdt(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptUpdate(inClaimDto);
		System.out.println("updt 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Uel
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmUel")
	public String inClaimAcceptUelete(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptUelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	// ClaimAccept: Del
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAcceptXdmDel")
	public String inClaimAcceptDelete(InClaimDto inClaimDto) {
		inClaimService.inClaimAcceptDelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimAcceptXdmList";
	}
	
	
// ==================== inCalimProcess ==================== //
	
	// ClaimProcess: Lsit-inClaimProcessSelectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmList")
	public String inClaimProcessXdmList(@ModelAttribute("vo") InClaimVo inClaimVo, Model model) {
		
		// 날짜 필드에 시간 추가
//		inClaimVo.setShStartDate(inClaimVo.getShStartDate()+" 00:00:00");			
//		inClaimVo.setShEndDate(inClaimVo.getShEndDate()+" 23:59:59");
		// 초기값 세팅이 없는 경우 사용
		inClaimVo.setShStartDate(inClaimVo.getShStartDate() == null || inClaimVo.getShStartDate() == "" ? null : UtilDateTime.add00TimeString(inClaimVo.getShStartDate()));
		inClaimVo.setShEndDate(inClaimVo.getShEndDate() == null || inClaimVo.getShEndDate() == "" ? null : UtilDateTime.add59TimeString(inClaimVo.getShEndDate()));
		
		// paging
		inClaimVo.setParamsPaging(inClaimService.inClaimProcessSelectOneCount(inClaimVo));
		
		if(inClaimVo.getTotalRows() > 0) {
			model.addAttribute("list", inClaimService.inClaimProcessSelectList(inClaimVo));
		}
		
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmForm")
	public String inClaimProcessXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmForm";
	}
	
	// ClaimProcess: Inst
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmInst")
	public String inClaimProcessXdmInst(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessInsert(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmMfom")
	public String inClaimProcessXdmMfom(InClaimDto inClaimDto, Model model) {
		model.addAttribute("item", inClaimService.inClaimProcessSelectOne(inClaimDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/inClaim/inClaimProcessXdmMfom";
	}
	
	// ClaimProcess: Updt
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimProcessXdmUpdt")
	public String inClaimProcessUpdate(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessUpdate(inClaimDto);
		System.out.println("updt 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Uel
	@RequestMapping(value="/xdm/v1/infra/inClaim/inCalimProcessXdmUel")
	public String inClaimProcessUelete(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessUelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
	// ClaimProcess: Del
	@RequestMapping(value="/xdm/v1/infra/inClaim/inCalimProcessXdmDel")
	public String inClaimProcessDelete(InClaimDto inClaimDto) {
		inClaimService.inClaimProcessDelete(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimProcessXdmList";
	}
	
// ==================== inClaimPay ==================== //

	// inClaimPay: Lsit-inClaimPaySelectList
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimPayXdmList")
	public String inClaimPayXdmList(@ModelAttribute("vo") InClaimVo inClaimVo, Model model) {
		
		// 날짜 필드에 시간 추가
//		inClaimVo.setShStartDate(inClaimVo.getShStartDate()+" 00:00:00");			
//		inClaimVo.setShEndDate(inClaimVo.getShEndDate()+" 23:59:59");
		// 초기값 세팅이 없는 경우 사용
		inClaimVo.setShStartDate(inClaimVo.getShStartDate() == null || inClaimVo.getShStartDate() == "" ? null : UtilDateTime.add00TimeString(inClaimVo.getShStartDate()));
		inClaimVo.setShEndDate(inClaimVo.getShEndDate() == null || inClaimVo.getShEndDate() == "" ? null : UtilDateTime.add59TimeString(inClaimVo.getShEndDate()));
		
		// paging
		inClaimVo.setParamsPaging(inClaimService.inClaimPaySelectOneCount(inClaimVo));
		
		if(inClaimVo.getTotalRows() > 0) {
			model.addAttribute("list", inClaimService.inClaimPaySelectList(inClaimVo));
		}
		
		return "/xdm/v1/infra/inClaim/inClaimPayXdmList";
	}
	
	// inClaimPay: Form
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimPayXdmForm")
	public String inClaimPayXdmForm() {
		return "/xdm/v1/infra/inClaim/inClaimPayXdmForm";
	}
	
	// inClaimPay: Inst
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimPayXdmInst")
	public String inClaimPayInsert(InClaimDto inClaimDto) {
		inClaimService.inClaimPayInsert(inClaimDto);
		return "redirect:/xdm/v1/infra/inClaim/inClaimPayXdmList";
	}
	
	// inClaimPay: Mfom
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimPayXdmMfom")
	public String inClaimPayXdmMfom(InClaimDto inClaimDto, Model model) {
		model.addAttribute("item", inClaimService.inClaimPaySelectOne(inClaimDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/inClaim/inClaimPayXdmMfom";
	}
	
	// inClaimPay: Updt
	@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimPayXdmUpdt")
	public String inClaimPayUpdate(InClaimDto inClaimDto) {
		inClaimService.inClaimPayUpdate(inClaimDto);
		System.out.println("updt 잘 넘어감");
		return "redirect:/xdm/v1/infra/inClaim/inClaimPayXdmList";
	}
	
	
	
	
	// ==================== inClaimAssign ==================== //
	 
		// selectList
		@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmList")  
		public String inClaimAssignXdmList(@ModelAttribute("vo") InClaimAssignVo inClaimAssignVo, Model model) {
			
			// getshDateStart()에 "00:00:00"을 넣고 setShDateStart에서 보여줌 
			/* 초기값 세팅이 없는 경우 사용 */
			// shDateStart 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
			inClaimAssignVo.setShDateStart(inClaimAssignVo.getShDateStart() == null || inClaimAssignVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(inClaimAssignVo.getShDateStart()));
			// shDateEnd 값이 null 이거나 비어 있을 경우 UtilDateTime 클래스를 실행 
			inClaimAssignVo.setShDateEnd(inClaimAssignVo.getShDateEnd() == null || inClaimAssignVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(inClaimAssignVo.getShDateEnd()));
			
			inClaimAssignVo.setParamsPaging(inClaimService.selectOneCount(inClaimAssignVo));
			
			if(inClaimAssignVo.getTotalRows() > 0) {
				model.addAttribute("assignList", inClaimService.inClaimAssignSelectList(inClaimAssignVo));
			}
			
			return "/xdm/v1/infra/inClaim/inClaimAssignXdmList";
		}
		
		// Form
		@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmForm")
		public String inClaimAssignXdmForm() {
			return "/xdm/v1/infra/inClaim/inClaimAssignXdmForm";   
		}
		              
		// insert 
		@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmInst")
		public String inClaimAssignXdmInst(InClaimDto inClaimDto) {
			
			inClaimService.inClaimAssignInsert(inClaimDto);
			return "redirect:/xdm/v1/infra/inClaim/inClaimAssignXdmList";
		}
		
		// selectOne
		@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmMForm")
		public String inClaimAssignXdmMForm(InClaimDto inClaimDto, Model model) {
			
			model.addAttribute("assignItem", inClaimService.inClaimAssignSelectOne(inClaimDto));
			return "/xdm/v1/infra/inClaim/inClaimAssignXdmMForm";
		}
		
		// update 
		@RequestMapping(value="/xdm/v1/infra/inClaim/inClaimAssignXdmUpdt")
		public String inClaimAssignXdmUpdt(InClaimDto inClaimDto) {
			
			inClaimService.inClaimAssignUpdate(inClaimDto);
			return "redirect:/xdm/v1/infra/inClaim/inClaimAssignXdmList";
		}
	
	
	
	

	
	
	
}

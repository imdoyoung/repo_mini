package com.universal.infra.inStaff;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.universal.common.constants.Constants;
import com.universal.common.util.UtilDateTime;
import com.universal.infra.inMember.InMemberDto;

import jakarta.servlet.http.HttpSession;

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
		 
		return "xdm/v1/infra/inStaff/inStaffXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/inStaff/inStaffXdmForm")
	public String inStaffXdmForm() {
		return "xdm/v1/infra/inStaff/inStaffXdmForm";
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
		return "xdm/v1/infra/inStaff/inStaffXdmMForm";
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
	
	
	
	
	// login
	 @RequestMapping(value = "/xdm/v1/infra/common/signin")
	   public String userXdmSignin(InStaffDto inStaffDto) {
		  
		 inStaffService.selectOneSignin(inStaffDto);
	     return "xdm/v1/infra/common/signin";
	 }
	 
	// LoginProc 
	   @ResponseBody
	   @RequestMapping(value = "/xdm/v1/infra/common/SigninProc")
	   public Map<String, Object> userXdmSigninProc(InStaffDto inStaffDto, HttpSession httpSession) {

	      Map<String, Object> returnMap = new HashMap<String, Object>(); // 결과를 담기 위한 맵 생성

	      InStaffDto rtUser = inStaffService.selectOneSignin(inStaffDto); // 사용자 정보 조회
	      
	         if (rtUser != null) { // 객체를 대상으로 null을 검사
	            
	        	 InStaffDto rtUser2 = inStaffService.selectOneId(inStaffDto); // 로그인 후 세션 정보 저장

	            if (rtUser2 != null) {
	               // 세션값 저장
	               httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60second * 30 = 30minute
	               httpSession.setAttribute("sessSeqXdm", rtUser2.getInstSeq());
	               httpSession.setAttribute("sessIdXdm", rtUser2.getInstName());
	               httpSession.setAttribute("sessNameXdm", rtUser2.getInstId());
	               httpSession.setAttribute("sessPwXdm", rtUser2.getInstPw());
	               // 성공 응답 설정
	               returnMap.put("rt", "success");
	               // 저장된 세션값 확인
	               System.out.println("sessSeqXdm: " + httpSession.getAttribute("sessSeqXdm"));
	               System.out.println("sessIdXdm: " + httpSession.getAttribute("sessIdXdm"));
	               System.out.println("sessNameXdm: " + httpSession.getAttribute("sessNameXdm"));
	               System.out.println("sessPwXdm: " + httpSession.getAttribute("sessPwXdm"));
	            } else {
	               returnMap.put("rt", "fail"); // 실패 응답 설정
	            }
	      }
	      return returnMap;
	   }
	   
	   
	   // LogoutProc
	   @ResponseBody
	   @RequestMapping(value = "/xdm/v1/infra/common/SignoutProc")
	   public Map<String, Object> signoutXdmProc(HttpSession httpSession) {
	      Map<String, Object> returnMap = new HashMap<String, Object>();
	      httpSession.invalidate();
	      returnMap.put("rt", "success");
	      return returnMap;
	   }
	
	
	

}

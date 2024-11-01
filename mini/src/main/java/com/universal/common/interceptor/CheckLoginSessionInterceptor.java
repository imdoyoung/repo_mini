package com.universal.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.universal.common.constants.Constants;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckLoginSessionInterceptor implements HandlerInterceptor {

	// 로그인 여부를 체크해서 로그인이 되었을 때만 페이지에 접근 허용
		@Override
		// HandlerInterceptor에서 제공하는 메서드
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			System.out.println("로그인 확인 : " + request.getSession().getAttribute("sessSeqXdm"));
			
			if (request.getSession().getAttribute("sessSeqXdm") != null) { //로그인이 되어 있을 떄
				// by pass
			} else {
				response.sendRedirect(Constants.URL_LOGINFORM); // 로그인 페이지 경로로 이동
				return false; // 함수를 빠져나감
			}
			
			return HandlerInterceptor.super.preHandle(request, response, handler);
		}

}

package com.universal.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.universal.common.interceptor.CheckLoginSessionInterceptor;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CheckLoginSessionInterceptor()) // 인터셉터 연결 
//				.order(1)
				.addPathPatterns("/xdm/v1/infra/**") // 인터셉터를 적용할 패턴 지정   
				.excludePathPatterns( // 인터셉터에서 제외할 패턴 지정(예외 처리)
   					    "/resources/**",
//						"/xdm/v1/**", // resources 하위 폴더
   					    "/xdm/v1/infra/common/signin", // 로그인 페이지 제외 
						"/xdm/v1/infra/common/SigninProc" // 로그인 처리 페이지 제외 
				);
	}   
}

package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//���������࣬û��ʹ�ð�ɨ�裬��Ϊ���е�Bean�����涨����
public class JavaConfig {
	
	@Bean
	public FunctionServcie functionServcie() {
		return new FunctionServcie();
	}
	
	//�����д������FunctionService ��Bean���Ϳ���
//	public UserFunctionService userFunctionService(FunctionServcie functionServcie) {
//		UserFunctionService userFunctionService = new UserFunctionService();
//		userFunctionService.setFunctionServcie(functionServcie);
//		return userFunctionService;
//	}
	
	@Bean
	public UserFunctionService userFunctionService() {
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionServcie(functionServcie());
		return userFunctionService;
	}
}

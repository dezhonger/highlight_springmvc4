package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * ʹ�ù���Bean
 * @author shengchenglong
 *
 */
//�˴�û������Bean
public class UserFunctionService {
	//�˴�û��ע��Bean
	FunctionServcie functionServcie;

	public FunctionServcie getFunctionServcie() {
		return functionServcie;
	}

	public void setFunctionServcie(FunctionServcie functionServcie) {
		this.functionServcie = functionServcie;
	}
	
	
}

package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ʹ�ù���Bean
 * @author shengchenglong
 *
 */
@Service
public class UserFunctionService {
	
	@Autowired
	FunctionSrvice functionSrvice;
	
	public String sayHello(String word) {
		return functionSrvice.sayHello(word);
	}
}

package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		
		//����������
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		//���Bean
		UserFunctionService functionService = context.getBean(UserFunctionService.class);
		
		System.out.println(functionService.sayHello("hehehe"));
		
		context.close();
	}
}

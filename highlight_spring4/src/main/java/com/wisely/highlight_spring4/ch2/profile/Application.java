package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.getEnvironment().setActiveProfiles("test");//�Ƚ����profile���ó�test
//		context.register(JavaConfig.class);//����ע��Bean�����࣬��ȻBeanδ����
//		context.refresh();//ˢ������
//		
//		DemoBean bean = context.getBean(DemoBean.class);
//		
//		System.out.println(bean.getContent());
		
		
		context.getEnvironment().setActiveProfiles("dev");//�Ƚ����profile���ó�test
		context.register(JavaConfig.class);//����ע��Bean�����࣬��ȻBeanδ����
		context.refresh();//ˢ������
		
		DemoBean bean1 = context.getBean(DemoBean.class);
		
		System.out.println(bean1.getContent());
		
		context.close();
	}
	
}

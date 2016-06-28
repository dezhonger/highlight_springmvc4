package com.wisely.highlight_spring4.ch1.aop.myaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
	
	/**
	 *  �����com.wisely.highlight_spring4.ch1.aop.myaop.*.*(..)�����ظð��µ����еķ��������֪ͨ�ᱻ���ö�Σ�
	 */
	@Pointcut("execution(* com.wisely.highlight_spring4.ch1.aop.myaop.DemoMethod.say(..))")
	public void annotationPointCut() {
		
	}
	
	@Before("annotationPointCut()")
	public void befor() {
		System.out.println("��֮ǰ����---");
	}
	
	@After("annotationPointCut()")
	public void after() {
		System.out.println("��֮�����---");
	}
	
	
}

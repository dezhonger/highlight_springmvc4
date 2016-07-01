package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * �ж�Windows����
 * @author shengchenglong
 *
 */
public class WindowsCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}
	
	
}

package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;
/**
 * ʹ��ע��    �ı�������
 * @author shengchenglong
 *
 */
@Service
public class DemoAnnotationService {
	
	@Action(name="ע��ʽ��add����")
	public void add() {
		
	}
}

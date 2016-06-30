package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * �¼�������
 * @author shengchenglong
 *
 */
@Component
public class DemoPublisher {
	
	//ע��ApplicationContext
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		//ʹ��applicationcontext��publishEvent()���������¼�
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}

package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * �¼�������
 * ApplicationListener<E extends ApplicationEvent>
 * һ����Ӧ���¼�������ȥʵ�ֵĽӿ�
 * parameter��E һ���̳���ApplicationEvent����
 * @author shengchenglong
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	/**
	 * ��дonApplicationEvent(E event)����������Ϣ���н��ܴ���
	 */
	public void onApplicationEvent(DemoEvent event) {
		
		String message = event.getMsg();
		
		System.out.println("Bean-DemoListener ���յ���Bean-DemoEvent��������Ϣ��" + message);
	}

}

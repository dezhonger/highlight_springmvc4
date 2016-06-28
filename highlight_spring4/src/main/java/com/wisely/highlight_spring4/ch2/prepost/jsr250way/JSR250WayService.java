package com.wisely.highlight_spring4.ch2.prepost.jsr250way;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class JSR250WayService {
	
	@PostConstruct//�ڹ��캯��֮ǰִ��
	public void init() {
		System.out.println("jsr250 init method");
	}
	
	@PreDestroy//��Bean����֮ǰִ��
	public void destroy() {
		System.out.println("jsr250 destroy method");
	}
	
	public JSR250WayService() {
		System.out.println("���캯����ʼ��");
	}
}

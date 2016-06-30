package com.wisely.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
/**
 * spring aware ����ʾBean
 * ʵ�ֻ��Bean���ƺ���Դ���صķ���
 * @author shengchenglong
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	
	private ResourceLoader resourceLoader;
	
	public void outputResult() {
		System.out.println("bean��name�� " + beanName);
		
		Resource resource = resourceLoader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
		
		try {
			System.out.println("resource�ļ�������Ϊ�� " + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	
	
	
}

package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//��junit�������ṩSpring TestContext Framework �Ĺ���
@ContextConfiguration(classes = {TestConfig.class})//��ע��������������ApplicationContext,���е�classes������������������
@ActiveProfiles("dev")//�������profile
public class TestApplication {

	@Autowired
	private TestBean testBean;
	
	@Test
	public void test1() {
		String content = testBean.getContent();
		System.out.println(content);
	}
}

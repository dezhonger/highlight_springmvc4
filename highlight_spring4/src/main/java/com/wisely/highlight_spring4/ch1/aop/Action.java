package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * ���ع����ע�⣨ע�Ȿ��û�й��ܣ��ͺ�xmlһ������һ��Ԫ����-->�������ݵ����ݣ���������ã�
 * ��ע��Ĺ��������������ע��ĵط���
 * �Զ���ע��
 * @author shengchenglong
 *
 */
@Target(ElementType.METHOD)//ָʾ�ڸ�ע�������£�����Ԫ�ص�����
@Retention(RetentionPolicy.RUNTIME)//ָʾע�����͵�ע��Ҫ�������
@Documented//ָʾĳһ���͵�ע�ͽ�ͨ�� javadoc �����Ƶ�Ĭ�Ϲ��߽����ĵ���
public @interface Action {
	String name();
}

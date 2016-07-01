package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * ����ִ����
 * @author shengchenglong
 *
 */
@Service
//@Async����������������з��������첽����
public class AsyncTaskService {
	
	@Async//�ø�ע�����������첽���������Է����༶��
	public void method1(int i) {
		System.out.println("�̣߳�" + Thread.currentThread().getName() + "---" + "method1: " + i);
	}
	
	public void method2(int i) {
		System.out.println("�̣߳�" + Thread.currentThread().getName() + "---" + "method2: " + i);
	}
}

/**
 �̣߳�ThreadPoolTaskExecutor-1---method1: 0
�̣߳�main---method2: 0
�̣߳�main---method2: 1
�̣߳�ThreadPoolTaskExecutor-2---method1: 1
�̣߳�main---method2: 2
�̣߳�main---method2: 3
�̣߳�main---method2: 4
�̣߳�main---method2: 5
�̣߳�main---method2: 6
�̣߳�main---method2: 7
�̣߳�main---method2: 8
�̣߳�main---method2: 9
�̣߳�ThreadPoolTaskExecutor-4---method1: 3 
�̣߳�ThreadPoolTaskExecutor-4---method1: 5
�̣߳�ThreadPoolTaskExecutor-4---method1: 6
�̣߳�ThreadPoolTaskExecutor-4---method1: 7
�̣߳�ThreadPoolTaskExecutor-4---method1: 8
�̣߳�ThreadPoolTaskExecutor-4---method1: 9
�̣߳�ThreadPoolTaskExecutor-3---method1: 2
�̣߳�ThreadPoolTaskExecutor-5---method1: 4
 * 
 * ��������Կ�����main�߳�һ����˳��ִ�еģ�
 * ��TaskExecutor�Ĳ��������̳߳�������5 -->  taskExecutor.setCorePoolSize(5);
 * �����ܹ�����5���߳�ȥִ��method1������
 * �������ڸ�������£�method1����������ִ�У������ǰ�˳��ִ�У�����
 * ���������ǣ�����ͬһ���̣߳��ض��ǰ�˳��� --> 37~42�У�����
 * 
 */

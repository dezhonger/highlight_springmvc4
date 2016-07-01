package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * ����Bean
 * ����ִ����
 * @author shengchenglong
 *
 */
@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void method1() {
		System.out.println(Thread.currentThread().getName() + " --- ÿ��5��ִ��һ�Σ�" + SDF.format(new Date()));
	}
	
	@Scheduled(cron = "0 10 11 ? * *")
	public void method2() {
		System.out.println(Thread.currentThread().getName() + " --- ��ָ��ʱ�䣺 " + SDF.format(new Date()));
	}
	
/**
 * CRON���ʽ    ���� 
"0 0 12 * * ?"    ÿ������ʮ���㴥�� 
"0 15 10 ? * *"    ÿ������10��15���� 
"0 15 10 * * ?"    ÿ������10��15���� 
"0 15 10 * * ? *"    ÿ������10��15���� 
"0 15 10 * * ? 2005"    2005���ÿ������10��15���� 
"0 * 14 * * ?"    ÿ�������2�㿪ʼ��2��59��ÿ����һ�δ��� 
"0 0/5 14 * * ?"    ÿ�������2�㿪ʼ��2��55�ֽ���ÿ5����һ�δ��� 
"0 0/5 14,18 * * ?"    ÿ�������2����2��55��6����6��55������ʱ�����ÿ5����һ�δ��� 
"0 0-5 14 * * ?"    ÿ��14:00��14:05ÿ����һ�δ��� 
"0 10,44 14 ? 3 WED"    ���µ�ÿ������14��10��14��44���� 
"0 15 10 ? * MON-FRI"    ÿ����һ���ܶ������������ġ������10��15���� 
 * 
 * 
 * 
 * 
 * 
 * ִ�н����
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:46
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:51
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:56
pool-1-thread-1 --- ��ָ��ʱ�䣺 11:10:00
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:01
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:06
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:11
 */
}

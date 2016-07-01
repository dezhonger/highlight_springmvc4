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
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:46
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:51
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:09:56
pool-1-thread-1 --- ��ָ��ʱ�䣺 11:10:00
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:01
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:06
pool-1-thread-1 --- ÿ��5��ִ��һ�Σ�11:10:11
 */
}

package com.wisely.highlight_spring4.ch2.el;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
/**
 * ������
 * @author shengchenglong
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")
public class ELConfig {

	@Value("I Love You!")//ע����ͨ�ַ���
	private String normal;
	
	@Value("#{systemProperties['os.name']}")//ע�����ϵͳ����
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0}")//ע����ʽ���
	private double randomNumber;
	
	@Value("#{demoService.another}")//ע������Bean����
	private String fromAnother;
	
	@Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt")//ע���ļ���Դ
	private Resource testFile;
	
	@Value("http://www.baidu.com")//ע����ַ��Դ
	private Resource testUrl;
	
	@Value("${book.name}")//ע�������ļ�
	private String bookName;

	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream(), "UTF-8"));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));//ע�⣺Properties�����Դ�Environment�л��
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

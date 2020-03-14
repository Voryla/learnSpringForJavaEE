package com.zwk.learn_ioc;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	/**
	 * 测试Bean标签的几种创建Bean的模式
	 * 1.直接创建
	 * 2.静态工厂创建
	 * 3.动态工厂创建
	 */
	@Test
	public void testBean() {
		Logger logger = Logger.getLogger(TestIOC.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
		User user2 = (User) context.getBean("userBeanForStaticFactory");
		System.out.println(user2);
		user2.add();
		User user3 = (User) context.getBean("userBeanForFactory");
		System.out.println(user3);
		user3.add();
	}

	/**
	 * 测试Bean的scope使用
	 * 1.singleton单例，默认值
	 * 2.prototype多例
	 */
	@Test
	public void testBeanScope(){
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user1=(User)context.getBean("user");
		User user2=(User)context.getBean ("user");
		System.out.println(user1.equals(user2));
	}
}

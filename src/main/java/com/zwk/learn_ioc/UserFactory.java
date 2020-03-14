package com.zwk.learn_ioc;

public class UserFactory {
	public UserFactory(){
		System.out.println("创建实例工厂");
	}
	public User getUser(){
		return new User();
	}
}

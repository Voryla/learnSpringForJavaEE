package com.zwk.learn_ioc;

public class UserStaticFactory {
	public UserStaticFactory(){
		System.out.println("我被创建了");
	}
	public static User getUser(){
		return new User();
	}
}

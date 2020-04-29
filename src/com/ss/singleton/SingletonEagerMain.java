package com.ss.singleton;

public class SingletonEagerMain {

	public static void main(String[] args) {

		SingletonEager instance1=SingletonEager.getInstance();
		SingletonEager instance2=SingletonEager.getInstance();
		System.out.println("Instance1::"+instance1);
		System.out.println("Instance2::"+instance2);
	}

}

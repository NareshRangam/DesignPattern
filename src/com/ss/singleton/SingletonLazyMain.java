package com.ss.singleton;

public class SingletonLazyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonLazy instance1= SingletonLazy.getInstance();
		SingletonLazy instance2=SingletonLazy.getInstance();
		System.out.println("Instance1::"+instance1);
		System.out.println("Instance2::"+instance2);
	}

}

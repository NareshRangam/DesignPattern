package com.ss.singleton;

public class SingletonThreadsafe {

	private static SingletonThreadsafe instance;
	private SingletonThreadsafe()
	{
		
	}
	public static synchronized SingletonThreadsafe getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonThreadsafe();
		}
		return instance;
	}
}

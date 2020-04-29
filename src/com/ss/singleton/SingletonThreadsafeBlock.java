package com.ss.singleton;

public class SingletonThreadsafeBlock {

	private static SingletonThreadsafeBlock instance;
	private SingletonThreadsafeBlock()
	{
		
	}
	public static SingletonThreadsafeBlock getInstance()
	{
		if(instance==null)
		{
			synchronized (SingletonThreadsafeBlock.class) {
				if(instance==null)
				{
					instance=new SingletonThreadsafeBlock();
				}
				
			}
		}
		return instance;
	}
}

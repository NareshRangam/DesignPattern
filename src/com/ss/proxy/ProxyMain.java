package com.ss.proxy;

public class ProxyMain {

	public static void main(String args[]) 
	{
		DatabaseExecutor databaseExecutor1=new DatabaseExecutorProxy("admin","admin@123");
		try {
			databaseExecutor1.executeQuery("delete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DatabaseExecutor databaseExecutor2=new DatabaseExecutorProxy("user","user@123");
		try {
			databaseExecutor2.executeQuery("delete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.ss.proxy;

public class DatabaseExecutorProxy implements DatabaseExecutor{

	private DatabaseExecutorImpl databaseExecutorImpl;
	boolean isAdmin;
	
	public DatabaseExecutorProxy(String userName,String password)
	{
		if(userName=="admin" && password=="admin@123")
		{
			isAdmin=true;
			databaseExecutorImpl=new DatabaseExecutorImpl();
		}
	}
	
	@Override
	public void executeQuery(String query) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin)
		{
			databaseExecutorImpl.executeQuery(query);
		}
		else
		{
			if(query.equalsIgnoreCase("delete"))
			{
				throw new Exception("Delete not allowed to non admin users");
			}
			else
			{
				databaseExecutorImpl.executeQuery(query);
			}
		}
	}
	
}

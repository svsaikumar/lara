package com.lara;

import org.apache.jasper.runtime.HttpJspBase;

public abstract class MyHelloServlet extends HttpJspBase 
{
	public String getHello()
	{
		return "Hello to all MyHelloServlet";
	}
}

package com.zjut.tomcat.servlet;

import com.zjut.tomcat.MyTomcat.Servlet;
import com.zjut.tomcat.http.Request;
import com.zjut.tomcat.http.Response;

public class MyFirstServlet extends Servlet{

	@Override
	public void doGet(Request request, Response response) {
		System.out.println("这个是我的第一个Servlet  " + "GET");
	}

	@Override
	public void doPost(Request request, Response response) {
		System.out.println("这个是我的第一个Servlet  " + "POST");
	}

}

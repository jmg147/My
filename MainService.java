package com.jmg.webservice.controller;

import javax.xml.ws.Endpoint;

public class MainService {
	MainService()
	{
		System.out.println("service.....");
		IService service = new Service();
		//设置发布路径
		String address="http://localhost:8090/hello";
		//测试访问     http://localhost:8090/hello?wsdl
				
		//发布（发布对象，发布的实体类对象）
		Endpoint.publish(address, service);
	}
	public static void main(String[] args) throws InterruptedException
	{
		//服务端
		
		//创建本类对象 调用构造方法
		new MainService();
		System.out.println("aaaaaaaaaaa");
		//线程等待 防止程序关闭
		Thread.sleep(10*60*1000);
		System.out.println("bbbbbbbbbbbb");
		//关闭java虚拟机
		System.exit(0);
		
	}
}

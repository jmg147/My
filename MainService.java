package com.jmg.webservice.controller;

import javax.xml.ws.Endpoint;

public class MainService {
	MainService()
	{
		System.out.println("service.....");
		IService service = new Service();
		//���÷���·��
		String address="http://localhost:8090/hello";
		//���Է���     http://localhost:8090/hello?wsdl
				
		//�������������󣬷�����ʵ�������
		Endpoint.publish(address, service);
	}
	public static void main(String[] args) throws InterruptedException
	{
		//�����
		
		//����������� ���ù��췽��
		new MainService();
		System.out.println("aaaaaaaaaaa");
		//�̵߳ȴ� ��ֹ����ر�
		Thread.sleep(10*60*1000);
		System.out.println("bbbbbbbbbbbb");
		//�ر�java�����
		System.exit(0);
		
	}
}

package com.jmg.webservice.contoller;



public class ClientService {
	public static void main (String[] args)
	{
		/*cmd ���ɿͻ���
		wsimport -s D:\jmg\aaa\T2CxfClient\src -p com.jmg.webservice.contoller -keep http://localhost:8090/hello?wsdl
		                                      �ͻ��˵�src                      �����ļ����ڿͻ��˵��Ǹ�����                     ����˵�wsdl�ļ�����·��
		 */		
		//�ͻ���
		//��webservice��servicename�������ɵ��� ���Ƿ���˷�������
		ServiceService si=new ServiceService();
		//���ṹ����ʵ��
		IService hs=si.getServicePort();
		//���ýӿڷ���
		String a=hs.bb("jmg22");
		System.out.println(a);
	}
}

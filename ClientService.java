package com.jmg.webservice.contoller;



public class ClientService {
	public static void main (String[] args)
	{
		/*cmd 生成客户端
		wsimport -s D:\jmg\aaa\T2CxfClient\src -p com.jmg.webservice.contoller -keep http://localhost:8090/hello?wsdl
		                                      客户端的src                      生成文件所在客户端的那个包下                     服务端的wsdl文件访问路径
		 */		
		//客户端
		//由webservice中servicename属性生成的类 既是服务端发布的名
		ServiceService si=new ServiceService();
		//给结构赋予实体
		IService hs=si.getServicePort();
		//调用接口方法
		String a=hs.bb("jmg22");
		System.out.println(a);
	}
}

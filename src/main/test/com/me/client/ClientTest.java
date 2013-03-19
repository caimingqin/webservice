package com.me.client;

import java.rmi.RemoteException;


public class ClientTest {

	public static void main(String[] args) throws RemoteException {
		//根据wsdl文件生成本地java客户端代码,进行调用
		HelloWorldStub helloWorldStub = new HelloWorldStub("http://localhost/axis2/services/HelloWorld");
		GetResponse getResponse = helloWorldStub.get(new Get());
		String get_return = getResponse.get_return();
		System.out.println(get_return);
		
	}
}

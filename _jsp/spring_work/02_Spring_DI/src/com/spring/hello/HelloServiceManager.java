package com.spring.hello;
//��û�޴� Ŭ������ ���ϴ� Ŭ���� ��ü�� Ŭ���̾�Ʈ���� �Ѱ��ش�
public class HelloServiceManager {
	public static HelloService getInstance(){
		return new HelloServiceImpl(); //���ϴ� Ŭ����
		//spring.xml�� �� ���
	}
}//class-end

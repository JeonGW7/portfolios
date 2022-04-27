package com.spring.service.order;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class CartService implements InitializingBean,DisposableBean{
	String memId; //����
	
	//������
	public CartService(String memId){
		this.memId=memId;
	}//cons-end
	
	//�޼���
	public void loadItems(){
		System.out.println(memId+" :īƮ ��� ��� init-method,loadItems() ����");
	}//loadItems-end
	
	//�޼���
	public void storeItems(){
		System.out.println(memId+" :īƮ ��� ���� destroy-method, storeItems()����");
	}//storeItems-end
	
	//InitializingBean �޼��� �������̵�
	public void afterPropertiesSet() throws Exception{
		System.out.println(memId+" īƮ ��� ���� InitializingBean.afterPropertiesSet() ����");
	}//afterPropertiesSet-end
	
	//DisposableBean �޼��� �������̵�
	public void destroy() throws Exception{
		System.out.println(memId+" īƮ��� ���� DisposableBean.destory() ����");
	}//destroy-end
}//class-end

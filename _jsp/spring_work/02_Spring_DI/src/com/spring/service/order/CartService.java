package com.spring.service.order;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class CartService implements InitializingBean,DisposableBean{
	String memId; //변수
	
	//생성자
	public CartService(String memId){
		this.memId=memId;
	}//cons-end
	
	//메서드
	public void loadItems(){
		System.out.println(memId+" :카트 목록 기록 init-method,loadItems() 살행");
	}//loadItems-end
	
	//메서드
	public void storeItems(){
		System.out.println(memId+" :카트 목록 저장 destroy-method, storeItems()실행");
	}//storeItems-end
	
	//InitializingBean 메서드 오버라이딩
	public void afterPropertiesSet() throws Exception{
		System.out.println(memId+" 카트 목록 적재 InitializingBean.afterPropertiesSet() 실행");
	}//afterPropertiesSet-end
	
	//DisposableBean 메서드 오버라이딩
	public void destroy() throws Exception{
		System.out.println(memId+" 카트목록 저장 DisposableBean.destory() 실행");
	}//destroy-end
}//class-end

package com.spring.model.product;

public class SaleItem {
	//변수
	Computer item; //객체
	int cnt;
	long price;
	
	//디폴트 생성자
	public SaleItem(){}
	//생성자 DI
	public SaleItem(Computer item,int cnt,long price){
		this.item=item;
		this.cnt=cnt;
		this.price=price;
	}
	//setter메서드 추가, DI
	public void setItem(Computer item) {
		this.item = item;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	//사용자 정의 메서드
	public String display(){
		StringBuffer sb=new StringBuffer();
		sb.append("상품:"+item.getContents()+"\n");
		sb.append("수량:"+cnt+"\n");
		sb.append("금액:"+price+"\n");
		return sb.toString(); //String으로 변환해서 리턴
	}
}//class-end

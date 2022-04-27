package com.spring.model.product;

public class SaleItem {
	//����
	Computer item; //��ü
	int cnt;
	long price;
	
	//����Ʈ ������
	public SaleItem(){}
	//������ DI
	public SaleItem(Computer item,int cnt,long price){
		this.item=item;
		this.cnt=cnt;
		this.price=price;
	}
	//setter�޼��� �߰�, DI
	public void setItem(Computer item) {
		this.item = item;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	//����� ���� �޼���
	public String display(){
		StringBuffer sb=new StringBuffer();
		sb.append("��ǰ:"+item.getContents()+"\n");
		sb.append("����:"+cnt+"\n");
		sb.append("�ݾ�:"+price+"\n");
		return sb.toString(); //String���� ��ȯ�ؼ� ����
	}
}//class-end

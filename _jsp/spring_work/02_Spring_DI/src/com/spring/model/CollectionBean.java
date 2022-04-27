package com.spring.model;
import java.util.*; //List(�ߺ����),Set(�ߺ����ȵ�),Map
import com.spring.model.product.Computer;
//����
public class CollectionBean {
	//List type����
	List<Computer> itemList; //����

	public void setItemList(List<Computer> itemList) {
		this.itemList = itemList;
	}//setItemList-end
	
	//��� �޼��� 
	public void printItemList(){
		for(Computer item:itemList){
			System.out.println(item.getContents());
		}//for-end
	}//printItemList-end
	//===================
	// Set type ����
	//===================
	Set<Computer> itemSet; //����

	public void setItemSet(Set<Computer> itemSet) {
		this.itemSet = itemSet;
	}//setItemSet-end
	
	//��� �޼���
	public void printItemSet(){
		for(Computer item:itemSet){
			System.out.println(item.getContents());
		}//for-end
	}//printItemSet-end
	//===================
	// Map type ����
	//===================
	Map<String,Computer> itemMap; //����

	public void setItemMap(Map<String, Computer> itemMap) {
		this.itemMap = itemMap;
	}
	
	//��¸޼���
	public void printItemMap(){
		for(String key:itemMap.keySet()){
			Computer item=itemMap.get(key); //key�ش��ϴ� ���� ��´�
			System.out.println(key+":"+item.getContents());
		}//for-end
	}//printItemMap-end
}//class-end

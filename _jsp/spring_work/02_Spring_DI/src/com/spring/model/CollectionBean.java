package com.spring.model;
import java.util.*; //List(중복허용),Set(중복허용안됨),Map
import com.spring.model.product.Computer;
//서버
public class CollectionBean {
	//List type참조
	List<Computer> itemList; //변수

	public void setItemList(List<Computer> itemList) {
		this.itemList = itemList;
	}//setItemList-end
	
	//출력 메서드 
	public void printItemList(){
		for(Computer item:itemList){
			System.out.println(item.getContents());
		}//for-end
	}//printItemList-end
	//===================
	// Set type 참조
	//===================
	Set<Computer> itemSet; //변수

	public void setItemSet(Set<Computer> itemSet) {
		this.itemSet = itemSet;
	}//setItemSet-end
	
	//출력 메서드
	public void printItemSet(){
		for(Computer item:itemSet){
			System.out.println(item.getContents());
		}//for-end
	}//printItemSet-end
	//===================
	// Map type 참조
	//===================
	Map<String,Computer> itemMap; //변수

	public void setItemMap(Map<String, Computer> itemMap) {
		this.itemMap = itemMap;
	}
	
	//출력메서드
	public void printItemMap(){
		for(String key:itemMap.keySet()){
			Computer item=itemMap.get(key); //key해당하는 값을 얻는다
			System.out.println(key+":"+item.getContents());
		}//for-end
	}//printItemMap-end
}//class-end

package ch15_io;
import java.io.*;
//implements Serializable 상속받으면 객체 직렬화가 된다 
@SuppressWarnings("serial")
public class Test11_HandPhone implements Serializable{
	//변수
	String name; //핸드폰 이름
	int price; //가격
	//객체직렬화에서 제외시켜보기 
	//transient int price;
	String telecom; //통신사
	//생성자:객체 초기화
	public Test11_HandPhone(String name,int price,String telecom){
		this.name = name;
		this.price = price;
		this.telecom = telecom;
	}
	//메서드
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getTelecom() {
		return telecom;
	}
	//컴파일만 한다(저장하면 컴파일 된다)
}//class-end

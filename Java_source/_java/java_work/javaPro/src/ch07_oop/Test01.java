package ch07_oop;
import java.awt.*; //Frame
@SuppressWarnings("serial")
public class Test01 extends Frame{
	//생성자
	public Test01(){
		super("연습1"); //상위 클래스 생성자 호출
		setSize(450,450); //창크기 width, height
		setVisible(true); //창표시
	}//cons-end
	public static void main(String[] args) {
		new Test01(); //객체생성, 생성자 호출
	}
}//class-end

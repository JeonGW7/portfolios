package ch09_class;
import java.awt.*;
@SuppressWarnings("serial")
public class Test06_extends extends Frame{
	//변수
	
	//생성자
	public Test06_extends(){
		super("연습");
	}
	//메서드
	
	public static void main(String[] args) {
		//상위클래스 변수로 하위객체 처리
		Frame f = new Test06_extends();//객체 생성
		f.setSize(450,450);
		f.setVisible(true); //창표시
	}//main-end
}//class-end

package ch08_const;
import java.awt.*;
@SuppressWarnings("serial")
public class Test04_super extends Frame {
	//생성자
	public Test04_super(){
		super("연습1");//상위 클래스 생성자 호출
		setBackground(Color.gray);//배경색
		setSize(450,450);//창크기 
		setVisible(true);//창표시
		
//		super.setBackground(Color.gray);//배경색
//		super.setSize(450,450);//창크기 
//		super.setVisible(true);//창표시
		
//		this.setBackground(Color.gray);//배경색
//		this.setSize(450,450);//창크기 
//		this.setVisible(true);//창표시
	}
	public static void main(String[] args) {
		new Test04_super();//객체생성,생성자 호출
	}//main-end
}//class-end

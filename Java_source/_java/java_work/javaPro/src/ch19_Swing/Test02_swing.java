package ch19_Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//awt,swing함께 사용
@SuppressWarnings("serial")
public class Test02_swing extends JFrame implements ActionListener{
	//변수
	JButton b1,b2,b3;
	//생성자
	public Test02_swing(){
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b1 = new JButton("정보",icon1);
		b2 = new JButton("경고",icon2);
		b3 = new JButton("에러",icon3); //버튼생성
		
		b1.setToolTipText("정보 대화 상자 입니다");
		b2.setToolTipText("경고 대화 상자 입니다");
		b3.setToolTipText("에러 대화 상자 입니다");
		
		this.getContentPane().setLayout(new FlowLayout()); //Layout설정
		//JFrame에 컴포넌트 붙이기 
		this.getContentPane().add(b1); //this 생략가능
		this.getContentPane().add(b2); //this 생략가능
		this.getContentPane().add(b3); //this 생략가능
		b1.addActionListener(this);//이벤트 등록
		b2.addActionListener(this);//이벤트 등록
		b3.addActionListener(this);//이벤트 등록
		setSize(400, 400);
		setVisible(true);
		//프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//메서드 오버라이딩
	public void actionPerformed(ActionEvent e){
//		JOptionPane.showMessageDialog(부모객체,message,옵션);
//		JOptionPane.showMessageDialog(부모객체,message,"창제목",옵션(아이콘));
//		JOptionPane.showMessageDialog(this,message,옵션);
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "정보대화상자");
		}else if(e.getSource()==b2){
			JOptionPane.showMessageDialog(this, "경고대화상자","창제목:경고",JOptionPane.WARNING_MESSAGE);//옵션추가 - warning아이콘이나옴
		}else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(this, "에러대화상자","창제목:에러",JOptionPane.ERROR_MESSAGE);
		}
	}//actionPerformed()-end
	public static void main(String[] args) {
		new Test02_swing();
	}//main-end
}//class-end

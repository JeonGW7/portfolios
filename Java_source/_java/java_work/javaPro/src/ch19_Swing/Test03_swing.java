package ch19_Swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class Test03_swing extends Frame implements ActionListener{
	//변수
	Button b1,b2,b3;
	//생성자
	public Test03_swing(){
		b1 = new Button("Message");
		b2 = new Button("confirm");
		b3 = new Button("input");
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);//글자 배경색
		
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);//글자 색
		
		b1.setFont(new Font("Dialog",Font.BOLD,16));
		b2.setFont(new Font("Dialog",Font.BOLD,16));
		b3.setFont(new Font("Dialog",Font.BOLD,16));//폰트
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);//이벤트 등록
		
		setLayout(new FlowLayout());
		//Frame에 컴포넌트 붙이기
		add(b1);
		add(b2);
		add(b3);
		//프로그램 종료,무명 inner class 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		setSize(400, 400);
		setVisible(true);
	}//cons-end
	//메서드:오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "message");
		}else if(e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm");
		}else if(e.getSource()==b3){
			String name = JOptionPane.showInputDialog(this,"대화명을 입력하세요");
			//대화명을 입력받아서 
			//당신의 대화명은 ...입니다 출력
			System.out.println("당신의 대화명은 "+name+" 입니다");
			
		}
	}//actionPerformed()-end
	public static void main(String[] args) {
		new Test03_swing();//객체생성, 생성자 호출 
	}//main-end
}//class-end

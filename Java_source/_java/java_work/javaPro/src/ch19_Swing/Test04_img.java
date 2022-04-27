package ch19_Swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class Test04_img extends Frame implements ActionListener {
	//변수
	Image img;
	int num = 6; //배열 인덱스로 사용
	Button b[][]; //2차원배열
	Dimension d; //컴포넌트 크기 구할 때 사용, 창 크기를 구할 때 사용할 것 
	//생성자
	public Test04_img(){
		b = new Button[num][num];//배열 생성
		setLayout(new GridLayout(num,num));
		setFont(new Font("Dialog",Font.BOLD,50));
		int a = 1; //버튼의 라벨로 사용할 갓
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				b[i][j] = new Button(""+ a++); //a를 문자열로 변환, 버튼생성
				b[i][j].setBackground(Color.blue);
				b[i][j].setForeground(Color.white);
				b[i][j].addActionListener(this);//이벤트 등록
				add(b[i][j]); //Frame에 컴포넌트 붙이기 
			}//in-for
		}//out-for
		//배경 그림 준비
		img = Toolkit.getDefaultToolkit().getImage("C:\\_util\\Imgs\\back.jpg");
		setSize(500, 500);
		setVisible(true);
		//프로그램 종료 - 무명클래스
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}//cons-end
	//paint()
	public void paint(Graphics g){
		d=getSize(); //창크기구함
		g.drawImage(img, 0, 0, d.width,d.height,this);
	}
	//메서드 오버라이딩
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(e.getSource()==b[i][j]){
					int answer = JOptionPane.showConfirmDialog(this, "자바는 쉽다","질문",JOptionPane.YES_NO_OPTION);
					switch(answer){
						case JOptionPane.YES_OPTION:
							b[i][j].setVisible(false);//버튼을 사라지게 하고, 배경이 보이게 한다 
							break;
						case JOptionPane.NO_OPTION:
							break; //배경 보여주지 않는다 
					}//switch-end
				}//if-end
			}//inner-for-end
		}//out-for-end
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test04_img(); //객체생성, 생성자 호출
	}//main-end
}//class-end

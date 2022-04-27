package ch22_network;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;//DefaultTableModel 
//대화창
@SuppressWarnings("serial")
public class RoomClient extends JFrame {
	//변수
	TextArea ta = new TextArea(); //대화내용 출력할 곳 
	TextField tf = new TextField(); //대화내용 입력
	String data[][] = new String [0][1];//0행1열 
	String cols[] = {"대화명"};
	DefaultTableModel model1 = new DefaultTableModel(data,cols){
		//이름없는 클래스 
		public boolean isCellEditable(int rows,int cols){ 
			return false; //셀 편집 못하게 
		}
	};
	JTable table = new JTable(model1);
	JScrollPane jscrollPane = new JScrollPane(table);
	
	JLabel label = new JLabel("현재인원");
	TextField inwon = new TextField(10);//10글자 크기
	
	JButton nickB = new JButton("대화명변경"); //디자인만
	JButton sayB = new JButton("귓속말");
	JButton outB = new JButton("대화방나가기");
	
	//생성자
	public RoomClient(){
		setTitle("대화방");
		getContentPane().setLayout(null);//프로그래머가 디자인 
		
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setEditable(false);//편집 못하게
		ta.setBounds(10,10,400,400);//x,y,width,height
		getContentPane().add(ta);
		
		tf.setFont(new Font("Dialog",Font.BOLD,15));
		tf.setBounds(10,420,400,30);
		getContentPane().add(tf); //프레임에 붙임
		
		table.getTableHeader().setBackground(Color.yellow);
		jscrollPane.setBounds(420, 10, 150, 230);
		getContentPane().add(jscrollPane);
		
		label.setBounds(420, 250, 60, 30);
		getContentPane().add(label);
		
		inwon.setBounds(490, 250, 70, 30);
		getContentPane().add(inwon);
		
		nickB.setBounds(420, 290, 150, 30);
		getContentPane().add(nickB);
		
		sayB.setBounds(420, 330, 150, 30);
		getContentPane().add(sayB);
		
		outB.setBounds(420, 370, 150, 30);
		getContentPane().add(outB);
		
		setSize(600, 500);
		//setVisible(true);
		//컴파일만 한다(저장)
	}//cons-end
	//메서드
	//main: 임시
//	public static void main(String[] args) {
//		new RoomClient();
//	}
}//class-end

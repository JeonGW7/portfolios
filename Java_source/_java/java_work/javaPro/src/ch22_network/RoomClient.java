package ch22_network;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;//DefaultTableModel 
//��ȭâ
@SuppressWarnings("serial")
public class RoomClient extends JFrame {
	//����
	TextArea ta = new TextArea(); //��ȭ���� ����� �� 
	TextField tf = new TextField(); //��ȭ���� �Է�
	String data[][] = new String [0][1];//0��1�� 
	String cols[] = {"��ȭ��"};
	DefaultTableModel model1 = new DefaultTableModel(data,cols){
		//�̸����� Ŭ���� 
		public boolean isCellEditable(int rows,int cols){ 
			return false; //�� ���� ���ϰ� 
		}
	};
	JTable table = new JTable(model1);
	JScrollPane jscrollPane = new JScrollPane(table);
	
	JLabel label = new JLabel("�����ο�");
	TextField inwon = new TextField(10);//10���� ũ��
	
	JButton nickB = new JButton("��ȭ����"); //�����θ�
	JButton sayB = new JButton("�ӼӸ�");
	JButton outB = new JButton("��ȭ�泪����");
	
	//������
	public RoomClient(){
		setTitle("��ȭ��");
		getContentPane().setLayout(null);//���α׷��Ӱ� ������ 
		
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setEditable(false);//���� ���ϰ�
		ta.setBounds(10,10,400,400);//x,y,width,height
		getContentPane().add(ta);
		
		tf.setFont(new Font("Dialog",Font.BOLD,15));
		tf.setBounds(10,420,400,30);
		getContentPane().add(tf); //�����ӿ� ����
		
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
		//�����ϸ� �Ѵ�(����)
	}//cons-end
	//�޼���
	//main: �ӽ�
//	public static void main(String[] args) {
//		new RoomClient();
//	}
}//class-end

package ch21_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;
//Ŭ���̾�Ʈ 
@SuppressWarnings({ "serial", "unused" })
public class MiddleClient extends JFrame implements ActionListener,Runnable{
	
	//����
	JButton b1,b2,b3;
	JTextField tf; //��ȭ���� �Է¶�
	JTextArea ta; //��ȭ���� ��� �뵵 
	String name; //��ȭ�� ���� ����
	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	//Ŭ����: ù���� �빮��
	//�޼��� : ù���� �ҹ���
	//���� : ù���� �ҹ��� 
	JScrollPane jScrollPane; //������ ������ ��ũ�ѹ� �ֱ� ����
	JScrollBar jScrollBar; 
	//������
	public MiddleClient(String ip,int port) {
		try{
			@SuppressWarnings("resource")
			Socket sock = new Socket(ip,port);//���ϻ���
			in = new DataInputStream(sock.getInputStream());//�������� ����
			out = new DataOutputStream(sock.getOutputStream()); //���ڵ�ó���ȴ�
			
		}catch(Exception ex){
			System.out.println("���� ���� ����"+ex);
			System.exit(0);
		}
		//������(���̾ƿ�)
		ImageIcon icon1 = new ImageIcon("C:\\_util\\Imgs\\a1.gif");
		b1 = new JButton("����",icon1);//��ư����
		b1.addActionListener(this);//�̺�Ʈ ���
		
		ImageIcon icon2 = new ImageIcon("C:\\_util\\Imgs\\b1.gif");
		b2 = new JButton("����Ʈ",icon2);//��ư����
		b2.addActionListener(this);//�̺�Ʈ ���
		
		ImageIcon icon3 = new ImageIcon("C:\\_util\\Imgs\\c1.gif");
		b3 = new JButton("��������",icon3);//��ư����
		b3.addActionListener(this);//�̺�Ʈ ���
		
		tf = new JTextField(); 
		tf.addActionListener(this);//�̺�Ʈ ���
		
		ta = new JTextArea(); 
		ta.setEditable(false);//�������ϰ� ����
		ta.setLineWrap(true);//������ ������ �ڵ����� 
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		jScrollPane = new JScrollPane(ta);
		jScrollBar = jScrollPane.getVerticalScrollBar();//
		jScrollBar.setValue(jScrollBar.getMaximum());
		
		getContentPane().add(p,"East");//JFrame�� ������Ʈ ���̱� 
		getContentPane().add(jScrollPane,"Center"); //text Area �پ�����
		getContentPane().add(tf,"South"); //��ȭ�Է�ĭ 
	
		setSize(400,400);
		setVisible(true);
		tf.requestFocus(); //��Ŀ�� ����
		
		//��ȭ�� �ޱ�
		name = JOptionPane.showInputDialog(this,"��ȭ���� �Է��ϼ���");
				
		//������ ����
		thread = new Thread(this);//Runnable �������̽��� ��� �޾ұ� ������ this 
		thread.start();//�غ�ܰ�, run()ȣ��
		//���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//�޼���:�������̵�
	//actionPerformed()������ ��û�� ���� �� ���
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf){
			//��ȭ������ ������ ������ �۾� 
			try{
				String msg = tf.getText().trim(); //trim():���� ����
				if(msg.length()<1){//�Է��� ���ϰ� ���͸� ���� ���
					JOptionPane.showMessageDialog(this, "��ȭ������ �Է��ϼ���");
					tf.requestFocus(); //��Ŀ�� ����
					return; //�ǵ��, �Ʒ� ������ ���� ���ϰ� �Ѵ� 
				}//if-end
				
				//��ȭ ������ ���������� �Է����� ��, ������ ������
				out.writeUTF("["+name+"]���� ��>>"+msg);
				tf.setText("");//���� ����� 
				
			}catch(Exception ex){
				System.out.println("������ �����͸� ������ �� ���� �߻�:"+ex);
				ta.append("������ �����͸� ������ �� ���� �߻�:"+ex);
				ta.append("10���Ŀ� ���� �մϴ�");
				try{
					Thread.sleep(10000);
				}catch(Exception ex2){}
				System.exit(0);//���α׷� ���� 
			}//catch-end
		}else if(e.getSource()==b1){//����
			int an = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?","����",JOptionPane.YES_NO_OPTION);
			switch(an){
			case JOptionPane.YES_OPTION:
				System.exit(0);
				break;
			case JOptionPane.NO_OPTION:
				break;
			}//switch-end
		}else if(e.getSource()==b2){//��ȭ�� ����Ʈ
			ta.setText("");
			ta.append(name);
		}else if(e.getSource()==b3){//�� ���� 
			ta.setFont(new Font("�ü�ü",Font.BOLD,20));
			ta.setForeground(Color.blue); //�۲û� ���� 
			
			tf.setFont(new Font("�ü�ü",Font.BOLD,20));
			tf.setForeground(Color.blue);
			tf.setBackground(Color.yellow);//���� ���� 
		}
	}//actionPerformed-end
	//run()������ ������ ������ Ŭ���̾�Ʈ ȭ�鿡 �ݿ��� �� ��� 
	public void run() {
		try{
			while(true){
				String str = in.readUTF();//������ ������ ���� �޴´� 
				ta.append(str+"\n");
				jScrollBar.setValue(jScrollBar.getMaximum());
			}//while-end
		}catch(Exception ex){
			ta.append("������ ���� �����͸� �޴� �� ���� �߻�:"+ex);
			ta.append("10���Ŀ� �����մϴ�");
			try{
				Thread.sleep(10000);
			}catch(Exception ex2){}
			System.exit(0);//���α׷� ���� 
		}//catch-end
	}//run-end
	
	public static void main(String[] args) {
//		new MiddleClient(args[0],5555);
		new MiddleClient("192.168.0.34",5555);
		//                 IP    port
	}
}//class-end

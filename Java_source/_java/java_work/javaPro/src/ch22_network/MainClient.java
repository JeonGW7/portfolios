package ch22_network;
//#############################
// �������� : ��űԾ�
// 100 : ���� ����
// 200 : �游���
// 210 : ����� 
// 400 : �濡�� ��ȭ�ϱ�
// 420 : ��ȭ�� ���� 
// 450 : �ӼӸ�
// 290 : �� ���� 
// 900 : ���� 
//#############################
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*; //DefaultTableModel 

import java.util.*; //Vector : thread ����� �ֱ� ���� 
import java.io.*;
import java.net.*;

@SuppressWarnings("serial")
public class MainClient extends JFrame implements Runnable,ActionListener,MouseListener {
	//����
	Socket sock;
	BufferedReader in; //�о���� ����
	OutputStream out; //ByteStream \r\n 
	
	String name; //��ȭ��
	String ip; 
	String title = "����";
	
	Object data1[][] = new String[0][2];//0��2�� 
	String cols1[] = {"������","�ο�"};
	DefaultTableModel model1 = new DefaultTableModel(data1,cols1);
	JTable table1 = new JTable(model1);
	
	Object data2[][] = new String[0][1];//0��1��
	String cols2[] = {"��ȭ��"};
	DefaultTableModel model2 = new DefaultTableModel(data2,cols2);
	JTable table2 = new JTable(model2);
	
	String data3[][] = new String[0][2];//0��2��
	String cols3[] = {"��ȭ��","��ġ"};
	DefaultTableModel model3 = new DefaultTableModel(data3,cols3);
	JTable table3 = new JTable(model3);
	
	JScrollPane jScrollPane1 = new JScrollPane(table1);
	JScrollPane jScrollPane2 = new JScrollPane(table2);
	JScrollPane jScrollPane3 = new JScrollPane(table3);
	
	JButton createB = new JButton("�游���");
	JButton roominB = new JButton("�����");
	JButton exitB = new JButton("����");
	
	RoomClient roomClient = new RoomClient(); //��ü����  
	
	//������
	public MainClient(String ip){
		setTitle("����â");
		this.ip = ip;
		
		table1.getTableHeader().setReorderingAllowed(false);//�� ���� ���� ���ϰ� ����
		table2.getTableHeader().setReorderingAllowed(false);//�� ���� ���� ���ϰ� ����
		table3.getTableHeader().setReorderingAllowed(false);//�� ���� ���� ���ϰ� ����
		
		table1.getTableHeader().setBackground(new Color(147,247,247));
		table2.getTableHeader().setBackground(new Color(147,247,247));
		table3.getTableHeader().setBackground(new Color(147,247,247));
		
		createB.setBackground(new Color(147,247,247));
		roominB.setBackground(new Color(147,247,247));
		exitB.setBackground(new Color(147,247,247));
		
		//������ Layout : ���α׷��Ӱ� �����Ѵ� 
		getContentPane().setLayout(null);
		
		getContentPane().add(jScrollPane1).setBounds(10, 10, 400, 250);
		getContentPane().add(jScrollPane2).setBounds(415, 10, 168, 250);
		getContentPane().add(jScrollPane3).setBounds(10, 270, 400, 197);
		
		getContentPane().add(createB).setBounds(449, 300, 100, 30);
		getContentPane().add(roominB).setBounds(449, 340, 100, 30);
		getContentPane().add(exitB).setBounds(449, 380, 100, 30);
		
		
		name = JOptionPane.showInputDialog("��ȭ���� �Է� �ϼ���");
		if(name==null || name.length()<1){
			JOptionPane.showMessageDialog(this, "��ȭ���� �Է� �ϼ���");
			return;
		}
		setSize(600, 515);
		setVisible(true);
		//�̺�Ʈ ó��
		eventUP();
		connectServer();//���� ���� �޼��� ȣ��
				
	}//cons-end
	//����� ���� �޼���
	public void eventUP(){
		createB.addActionListener(this);
		roominB.addActionListener(this);
		exitB.addActionListener(this);
		
		table1.addMouseListener(this);
		
		roomClient.tf.addActionListener(this);
		roomClient.nickB.addActionListener(this);
		roomClient.sayB.addActionListener(this);
		roomClient.outB.addActionListener(this);
	}//eventUP-end
	//���� ���� ����� ���� �޼���
	public void connectServer(){
		try{
			sock = new Socket(ip,5555);//����ip, ������Ʈ 5555 (���� ����)
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = sock.getOutputStream(); 
			
			out.write((name+"\r\n").getBytes()); //��ȭ�� ����, getBytes - ���ڵ� ó�� �޼��� ,writeUTFó�� 
			new Thread(this).start(); //������, runȣ�� 
		}catch(Exception ex){
			System.out.println("���� ���� ����: "+ex);
		}
	}//connectServer-end
	//����� ���� �޼��� 
	public void closeServer(){
		try{
			roomClient.setVisible(false); //â�� �Ⱥ��̰� 
			roomClient.dispose(); //���ҽ� ��ȯ 
			out.write(("900|\r\n").getBytes());
			sock.close();
			in.close();
			out.close();
		}catch(Exception ex){}
	}//closeServer-end
	
	//�������̵�
	public void mousePressed(MouseEvent me) {
		model2.setRowCount(0); //���̺��� ��� �����
		int r = table1.getSelectedRow(); //�༱��
		String imTitle = (String)model1.getValueAt(r, 0); //������
		for(int i=0;i<model3.getRowCount();i++){
			String roomt = (String)model1.getValueAt(i, 1);//������ �� ������ ���� ������ ���ϱ� ����
			if(imTitle.equals(roomt)){
				Object ob[] = {model3.getValueAt(i, 0)};//��ȭ���� ������ 
				model2.addRow(ob);                      //��ȭ���� model2�� �Ѹ��� 
			}//if-end
		}//for-end
	}//mousePressed-end
	public void mouseReleased(MouseEvent me) {}
	public void mouseClicked(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	//actionPerformed() : ������ ��û
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob==createB){ //�游���� ������ ��
			title = JOptionPane.showInputDialog(this,"������ �Է��ϼ���");
			if(title==null || title.length()<1){
				JOptionPane.showMessageDialog(this, "�������� �Է����ּ���");
				return; //���̻� �Ʒ��� ������ϰ�
			}
			//����ó��
			try{
				out.write(("200|"+title+"\r\n").getBytes()); //���ڵ�ó������ �ؼ� ������ ����
			}catch(Exception ex2){}
		}else if(ob==roominB){ //�����
			int row = table1.getSelectedRow();
			if(row<0){
				JOptionPane.showMessageDialog(this, "���� ���� �����ϼ���");
				return;
			}//if-end
			//����ó��
			title=(model1.getValueAt(row, 0).toString());//��üŸ���̱⶧���� toString, ��������
			try{
				out.write(("210|"+title+"\r\n").getBytes());//������ ��û���� 
				
			}catch(Exception ex2){}
		}else if(ob==roomClient.tf){ //�濡�� ��ȭ�ϱ�
			String msg = roomClient.tf.getText().trim();//��ȭ����
			if(msg.length()<0){
				return;
			}
			//����ó��
			try{
				out.write(("400|"+msg+"\r\n").getBytes()); //������ ��û
			}catch(Exception ex3){}
			roomClient.tf.setText("");//��ȭ���� �����
		}else if(ob==roomClient.outB){ //��ȭ�濡�� ������
			try{
				out.write(("290|\r\n").getBytes()); //������ ����
			}catch(Exception ex2){}
			title = "����";
			
		}else if(ob==roomClient.nickB){ //��ȭ�� ����, ������ X
			
		}else if(ob==roomClient.sayB){ //�ӼӸ� ������ X
			
		}else if(ob==exitB){ //���� 
			closeServer();//�޼��� ȣ��
			System.exit(0);//���α׷� ����
		}//if-end
	}//actionPerformed-end
	int protocol = 0;
	//run() : ������ ������ ������ Ŭ���̾�Ʈ ȭ�鿡 �ݿ�
	public void run() {
		while(true){
			try{
				String msg = in.readLine(); //������ ������ ���� �޴´� 
				if(msg==null){return;}
				
				StringTokenizer st = new StringTokenizer(msg,"|");
				
				protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol){  //�������� �浹���ϰ� {}�� ������ 
				case 100:{ //���� ����
					String ob[] = {st.nextToken(),st.nextToken()};
					//                ��ȭ��                      ��ġ
					model3.addRow(ob);
					break;
				}//100-end
				case 200:{ //�游���
					String ob[] = {st.nextToken(),st.nextToken()};
					//�游���                   ������                      �ο�
					model1.addRow(ob);
					break;
				}//200-end
				case 210:{ //�����
					String n = st.nextToken(); //��ȭ�� - ������ ������ 
					String t = st.nextToken(); //������ - ������ ������
					//model3���� ���ǿ��� ���������� ����
					for(int i=0;i<model3.getRowCount();i++){
						String imN = (String)model3.getValueAt(i, 0); //��ȭ�� ���
						if(imN.equals(n)){ //��ȭ�� ��ġ�ϸ�
							model3.setValueAt(t, i, 1); //������ ���������� ����
							break; //forŻ�� 
						}//if-end
					}//for-end
					//model1 ������, �ο��� ����
					for(int i=0;i<model1.getRowCount();i++){
						String imTitle = (String)model1.getValueAt(i, 0); //������
						if(imTitle.equals(t)){//���� ��ġ�ϸ� �ο� ����
							int inwon = Integer.parseInt(model1.getValueAt(i, 1)+"");
							model1.setValueAt(++inwon, i, 1);
							break; //forŻ��
						}
					}//for-end
					//���� �濡 ��� ����
					if(n.equals(name)){
						roomInProcess();//�޼��� ȣ��
					}else if(t.equals(title)){ //�ٸ������ �濡 ���ö�
						Object ob[] = {n};
						roomClient.model1.addRow(ob);//���ο��� �߰�
						roomClient.inwon.setText(roomClient.model1.getRowCount()+"");//�ο��� ����
						roomClient.ta.append("***["+n+"]���� ���� �Ͽ����ϴ�***\n");
					}//else-if-end
					break;
				}//210-end
				case 400:{
					roomClient.ta.append(""+st.nextToken()+"\r\n");
					break;
				}//400-end
				case 290:{//������
					String n = st.nextToken(); //������ ������ ��ȭ��
					String t = st.nextToken(); //������ ������ ��ȭ�� 
					//model1 �ο����� 
					for(int i=0;i<model1.getRowCount();i++){
						String imTitle = (String)model1.getValueAt(i,0);//������
						if(t.equals(imTitle)){ //�������� ã�Ƽ� 
							//�ο�����
							int inwon = Integer.parseInt(model1.getValueAt(i, 1)+"");
							if(inwon==1){
								model1.removeRow(i);
							}else{//�ٸ������ ������ �ο������� �Ѵ�
								model1.setValueAt(--inwon, i, 1);
							}
							break; //forŻ��
						}//if-end
					}//for-end
					
					//model3 ��ġ ���� (���̸��� ���Ƿ� ��ȯ)
					for(int i=0;i<model1.getRowCount();i++){
						String imName = (String)model3.getValueAt(i, 0);//��ȭ���� �� 
						if(n.equals(imName)){
							model3.setValueAt("����", i, 1);//���Ƿ� ����
							break; //forŻ�� 
						}//if-end
					}//for-end
					//���� ������ 
					if(n.equals(name)){
						roomOutProcess(); //��Ż�� �޼��� ȣ��
					}else if(t.equals(title)){ //�ٸ� ����� ������
						for(int i=0;i<roomClient.model1.getRowCount();i++){
							String imName = (String)roomClient.model1.getValueAt(i, 0);//��ȭ����
							if(imName.equals(n)){//��ȭ�� ��ġ�ϸ�, ���ݳ������ ����
								roomClient.model1.removeRow(i);
								break; //forŻ�� 
							}
						}//for-end
						//�ο�����
						roomClient.inwon.setText(roomClient.model1.getRowCount()+"");//�ο��� ���� 
						roomClient.ta.append("***["+n+"]�� �����Ͽ����ϴ�***\n");
					}//if-end
					break;
				}//290-end
				case 900:{
					
					break;
				}//900-end
				}//switch-end
			}catch(Exception ex1){
				System.out.println("run �������� ����:"+ex1);
				return; //���� �߻��ص� �ٽ� ���ư��� 
			}//catch-end
		}//while-end
	}//run-end
	
	//����� ���� �޼��� - �� ������(���� ��ȭ�濡 ����) 
	public void roomInProcess(){
		roomClient.setVisible(true); //��ȭ���� ���̰� �Ѵ� 
		roomClient.ta.append("***["+title+"]�濡 ���� �ϼ̽��ϴ�\n");
		
		for(int i=0;i<model3.getRowCount();i++){
			String imTitle = (String)model3.getValueAt(i,1);//����ġ�� ��´�
			if(imTitle.equals(title)){
				Object ob[] = {model3.getValueAt(i,0)}; //��ȭ���� ������ 
				roomClient.model1.addRow(ob);//��ȭ�濡 ��ȭ�� ���
			}//if-end
		}//for-end
		roomClient.inwon.setText(roomClient.model1.getRowCount()+""); //��ȭ�� �ο�����
		roominB.setEnabled(false);//����� ����� ��ư ��Ȱ��ȭ
		createB.setEnabled(false);//�游��⵵ ��Ȱ��ȭ
	}//roomin-end
	//����� ���� �޼��� - ���� ��ȭ�濡�� ������ 
	public void roomOutProcess(){
		roomClient.ta.setText("");//��ȭ���� �����
		roomClient.model1.setRowCount(0);//���̺� ���� ��� ����� 
		int a = roomClient.model1.getRowCount();
		roomClient.inwon.setText(a+"");//�ο��� �ٽ� ����
		roomClient.setVisible(false);//��ȭâ �Ⱥ��̰� �Ѵ�
		createB.setEnabled(true);//�游��� ��ư Ȱ��ȭ
		roominB.setEnabled(true);//����� Ȱ��ȭ 
		
	}//roomOut-end
	//main
	public static void main(String[] args) {
		new MainClient("192.168.0.34");
	}//main-end
	
}//class-end

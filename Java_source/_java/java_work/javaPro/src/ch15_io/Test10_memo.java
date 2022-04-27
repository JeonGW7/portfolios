package ch15_io;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*; //��ȭ���� ����ϱ� ����
//awt
//Exception
//io
//������ �޸��� ����� 

//MenuBar
//Menu
//MenuItem

@SuppressWarnings("serial")
public class Test10_memo extends Frame implements ActionListener{
	//����
	JTextArea ta; //�޸��忪��
	//������
	public Test10_memo(){
		super("�޸���");
		MenuBar mb = new MenuBar(); //�޴���
		Menu fileMenu = new Menu("����");
		Menu editMenu = new Menu("����");
		Menu fmtMenu = new Menu("����");
		Menu viewMenu = new Menu("����");
		mb.add(fileMenu); //�޴��ٿ� �޴� ���̱�
		mb.add(editMenu); //�޴��ٿ� �޴� ���̱�
		mb.add(fmtMenu); //�޴��ٿ� �޴� ���̱�
		mb.add(viewMenu); //�޴��ٿ� �޴� ���̱�
		//-----------------------------------
		//�׸�޴��߰�
		//-----------------------------------
		//����
		MenuItem newItem = new MenuItem("����",new MenuShortcut('N'));
		fileMenu.add(newItem);//���ϸ޴�/����
		newItem.addActionListener(this);//�̺�Ʈ ���
		newItem.setActionCommand("new");
		
		//���Ͽ���
		MenuItem openiItem = new MenuItem("����",new MenuShortcut('O'));
		fileMenu.add(openiItem);//���ϸ޴�/����
		openiItem.addActionListener(this);//�̺�Ʈ ���
		openiItem.setActionCommand("open");
		
		//��������
		MenuItem saveItem = new MenuItem("����",new MenuShortcut('S'));
		fileMenu.add(saveItem);//���ϸ޴�/����
		saveItem.addActionListener(this);//�̺�Ʈ ���
		saveItem.setActionCommand("save");
		
		//�и���/���м�
		fileMenu.addSeparator();
		
		//�����μ�
		MenuItem printItem = new MenuItem("�μ�",new MenuShortcut('P'));
		fileMenu.add(printItem); //���ϸ޴�/�μ�
		printItem.addActionListener(this);//�̺�Ʈ ���
		printItem.setActionCommand("print");
		
		//�и���/���м�
		fileMenu.addSeparator();
		
		//����
		MenuItem exitItem = new MenuItem("����",new MenuShortcut('X'));
		fileMenu.add(exitItem);//���ϸ޴�/����
		exitItem.addActionListener(this);//�̺�Ʈ ���
		exitItem.setActionCommand("exit");
		
		//���α׷� ����, ����Ŭ���� ���
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		ta = new JTextArea(); //�޸��� ����
		add(ta,"Center");//Frame�� ta������Ʈ ���̱� 
		setMenuBar(mb);//Frame�� �޴���(mb) ���̱�
		setSize(400,400);
		setVisible(true);
	}//cons-end
	//inner-class
	//�޼���:�������̵�
	public void actionPerformed(ActionEvent e){
		FileDialog fd = null; //Ŭ������ null�� �ʱ�ȭ
		String cmd = e.getActionCommand();
		if(cmd.equals("new")){
			//ta.setText("");
			ta.setText("\0");//�޸��� �����
			setTitle("�޸���");
		}else if(cmd.equals("open")){
			fd = new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
			fd.setVisible(true);
			String fn = fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileOpen(fn); //�������� �޼��� ȣ��
			}
		}else if(cmd.equals("save")){
			fd = new FileDialog(this,"��������",FileDialog.SAVE);
			fd.setVisible(true);
			String fn = fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileSave(fn);//���� ���� �޼��� ȣ�� 
			}
			
		}else if(cmd.equals("print")){
			@SuppressWarnings("unused")
			PrintJob pj = getToolkit().getPrintJob(this, "�μ�", null);
		}else if(cmd.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed()-end
	//����� ���� �޼��� - ���� ���� ��� ����
	public void fileOpen(String fn){
		BufferedReader in = null;
		ta.setText("\0"); //�޸��� ����� 
		try{
			in = new BufferedReader(new FileReader(fn),1024);//1024 = buffer ũ��
			String str = "";
			while((str=in.readLine()) != null){ //���� ���� �ƴѵ��� �ݺ�����
				ta.append(str+"\n");
			}//while-end
			setTitle("�����̸�:"+fn); //â����
		}catch(Exception ex){
			System.out.println("���� ���� ����"+ex);
		}finally{
			try{
				in.close();
			}catch(Exception ex2){}
		}//finally-end
	}//fileOpen-end
	public void fileSave(String fn){
		PrintWriter out = null;
		try{
			out = new PrintWriter(new BufferedWriter(new FileWriter(fn)));
			String str = ta.getText();
			out.println(str);//���Ϸ� ����
			setTitle("�����̸�:"+fn); //â����
		}catch(Exception ex){
			System.out.println("���� ���� ����"+ex);
		}finally{
			try{
				out.close();
			}catch(Exception ex2){}
		}//finally-end
	}//fileSave-end
	//main
	public static void main(String[] args) {
		new Test10_memo();//��ü ����,������ ȣ�� (��ü �ʱ�ȭ �۾��� ����)
	}//main-end
}//class-end

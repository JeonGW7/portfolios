package ch13_event;
import java.awt.*;
import java.awt.event.*;
//�̺�Ʈó�� �Ϸ���
//1. Ŭ������ �������̽��� ��ӹް�
//2. �̺�Ʈ ����� �ϰ�
//3. �ع� �޼��� �������̵� �ϰ�
@SuppressWarnings("serial")
public class Test02_event extends Frame implements ActionListener {
	//����
	Panel pNorth,pSouth;
	Button bFileOpen,bFileSave,bPrint,bExit;
	//������
	public Test02_event(){
		super("Event ó��");
		pNorth = new Panel();
		pSouth = new Panel();
		pNorth.setBackground(new Color(194,254,231));
		pSouth.setBackground(new Color(194,254,231));
		bFileOpen = new Button("���� ����");
		bFileSave = new Button("��������");
		bPrint = new Button("�μ�");
		bExit = new Button("����");
		//�гο� ��ư ���̱�
		pNorth.add(bFileOpen);
		pNorth.add(bFileSave);
		pNorth.add(bPrint);
		pSouth.add(bExit);
		//Frame�� �гκ��̱�
		add("North",pNorth);
		add("South",pSouth);
		addWindowListener(new MyWin());//�̺�Ʈ ���
		bFileOpen.addActionListener(this);//�̺�Ʈ ���
		bFileSave.addActionListener(this);//�̺�Ʈ ���
		bPrint.addActionListener(this);//�̺�Ʈ ���
		bExit.addActionListener(this);//�̺�Ʈ ���
		setSize(450, 450);
		setVisible(true);
	}
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	//�޼��� �������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bFileOpen){
			FileDialog fd = new FileDialog(this,"���Ͽ���",FileDialog.LOAD);//������
			fd.setVisible(true);
		}else if(e.getSource()==bFileSave){
			FileDialog fd = new FileDialog(this,"��������",FileDialog.SAVE);//������
			fd.setVisible(true);
			
		}else if(e.getSource()==bPrint){
			@SuppressWarnings("unused")
			PrintJob pj = getToolkit().getPrintJob(this, "�μ�", null);
			//                                     this�� �μ��ȭ ���ڰ� �Ҽӵ� �θ�ü�̴�
		}else if(e.getSource()==bExit){
			System.exit(0);
		}
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test02_event();
	}

}

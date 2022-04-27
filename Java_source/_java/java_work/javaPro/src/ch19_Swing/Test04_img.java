package ch19_Swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class Test04_img extends Frame implements ActionListener {
	//����
	Image img;
	int num = 6; //�迭 �ε����� ���
	Button b[][]; //2�����迭
	Dimension d; //������Ʈ ũ�� ���� �� ���, â ũ�⸦ ���� �� ����� �� 
	//������
	public Test04_img(){
		b = new Button[num][num];//�迭 ����
		setLayout(new GridLayout(num,num));
		setFont(new Font("Dialog",Font.BOLD,50));
		int a = 1; //��ư�� �󺧷� ����� ��
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				b[i][j] = new Button(""+ a++); //a�� ���ڿ��� ��ȯ, ��ư����
				b[i][j].setBackground(Color.blue);
				b[i][j].setForeground(Color.white);
				b[i][j].addActionListener(this);//�̺�Ʈ ���
				add(b[i][j]); //Frame�� ������Ʈ ���̱� 
			}//in-for
		}//out-for
		//��� �׸� �غ�
		img = Toolkit.getDefaultToolkit().getImage("C:\\_util\\Imgs\\back.jpg");
		setSize(500, 500);
		setVisible(true);
		//���α׷� ���� - ����Ŭ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}//cons-end
	//paint()
	public void paint(Graphics g){
		d=getSize(); //âũ�ⱸ��
		g.drawImage(img, 0, 0, d.width,d.height,this);
	}
	//�޼��� �������̵�
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(e.getSource()==b[i][j]){
					int answer = JOptionPane.showConfirmDialog(this, "�ڹٴ� ����","����",JOptionPane.YES_NO_OPTION);
					switch(answer){
						case JOptionPane.YES_OPTION:
							b[i][j].setVisible(false);//��ư�� ������� �ϰ�, ����� ���̰� �Ѵ� 
							break;
						case JOptionPane.NO_OPTION:
							break; //��� �������� �ʴ´� 
					}//switch-end
				}//if-end
			}//inner-for-end
		}//out-for-end
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test04_img(); //��ü����, ������ ȣ��
	}//main-end
}//class-end

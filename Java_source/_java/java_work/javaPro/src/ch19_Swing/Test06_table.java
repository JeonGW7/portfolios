package ch19_Swing;
import java.awt.*;//Layout
import java.awt.event.*;//�̺�Ʈ ó��

import javax.swing.*; //JTable
import javax.swing.table.*; //DefaultTableModel����ϱ� ���ؼ� , ���뼺����
@SuppressWarnings("serial")
public class Test06_table extends JFrame implements ActionListener,MouseListener{
	//����
	JButton b;
	JPanel panel;
	JLabel laName,laAge,laAddr;
	JTextField tfName,tfAge,tfAddr;
	String cols[] = {"�̸�","����","�ּ�"};
	Object data[][] = new Object[0][3];//0�� 3�� 
	DefaultTableModel model = new DefaultTableModel(data,cols);
	JTable table = new JTable(model);
	JScrollPane jScrollPane = new JScrollPane(table);
	//������
	public Test06_table(){
		b = new JButton("���̺� ���� ����");
		panel = new JPanel();
		panel.setBackground(new Color(220,254,239));
		laName = new JLabel("�̸�",JLabel.RIGHT);//���ڿ� ������ ����
		laAge = new JLabel("����",JLabel.RIGHT);
		laAddr = new JLabel("�ּ�",JLabel.RIGHT);
		
		tfName = new JTextField();
		tfAge = new JTextField();
		tfAddr = new JTextField();
		
		panel.setLayout(new GridLayout(3,2)); //3�� 2��
		
		panel.add(laName);
		panel.add(tfName);
		
		panel.add(laAge);
		panel.add(tfAge);
		
		panel.add(laAddr);
		panel.add(tfAddr);
		
		//JFrame�� ������Ʈ ���̱�
		getContentPane().add(panel,"North");
		getContentPane().add(jScrollPane,"Center");
		getContentPane().add(b,"South");
		
		//�̺�Ʈ ���
		tfName.addActionListener(this); 
		tfAge.addActionListener(this); 
		tfAddr.addActionListener(this); 
		b.addActionListener(this); 
		table.addMouseListener(this);
		
		setSize(350, 350);
		setVisible(true);
		
		//���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//cons-end
	int row = -1; //�������� 
	int col = -1; //��������
	//�������̵�
	public void mousePressed(MouseEvent me){
		row = table.getSelectedRow(); //���콺�� Ŭ���� �� ���� ��´� 
		col = table.getSelectedColumn(); //���콺�� Ŭ���� �� ���� ��´�
		//System.out.println("row:"+row);
		//System.out.println("col:"+col);
		String str = (String)table.getValueAt(row, col);
		System.out.println("������ ��:"+str);
		row = -1; //�ʱ�ȭ
		col = -1; //�ʱ�ȭ
	}//mousePressed()-end
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	//�޼��� �������̵�
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tfName){
			tfAge.requestFocus();
		}else if(e.getSource()==tfAge){
			tfAddr.requestFocus();
		}else if(e.getSource()==tfAddr){
			Object temp[] = {tfName.getText(),tfAge.getText(),tfAddr.getText()};
			model.addRow(temp); //�� ������ �߰� 
			tfName.setText(""); //���������
			tfAge.setText(""); //���������
			tfAddr.setText(""); //���������
			tfName.requestFocus();
			
		}
	}
	public static void main(String[] args) {
		new Test06_table(); //��ü����,������ ȣ��
	}//main-end
}//class-end

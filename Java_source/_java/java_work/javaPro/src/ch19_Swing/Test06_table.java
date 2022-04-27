package ch19_Swing;
import java.awt.*;//Layout
import java.awt.event.*;//이벤트 처리

import javax.swing.*; //JTable
import javax.swing.table.*; //DefaultTableModel사용하기 위해서 , 융통성있음
@SuppressWarnings("serial")
public class Test06_table extends JFrame implements ActionListener,MouseListener{
	//변수
	JButton b;
	JPanel panel;
	JLabel laName,laAge,laAddr;
	JTextField tfName,tfAge,tfAddr;
	String cols[] = {"이름","나이","주소"};
	Object data[][] = new Object[0][3];//0행 3열 
	DefaultTableModel model = new DefaultTableModel(data,cols);
	JTable table = new JTable(model);
	JScrollPane jScrollPane = new JScrollPane(table);
	//생성자
	public Test06_table(){
		b = new JButton("테이블 내용 삭제");
		panel = new JPanel();
		panel.setBackground(new Color(220,254,239));
		laName = new JLabel("이름",JLabel.RIGHT);//문자열 오른쪽 정렬
		laAge = new JLabel("나이",JLabel.RIGHT);
		laAddr = new JLabel("주소",JLabel.RIGHT);
		
		tfName = new JTextField();
		tfAge = new JTextField();
		tfAddr = new JTextField();
		
		panel.setLayout(new GridLayout(3,2)); //3행 2열
		
		panel.add(laName);
		panel.add(tfName);
		
		panel.add(laAge);
		panel.add(tfAge);
		
		panel.add(laAddr);
		panel.add(tfAddr);
		
		//JFrame에 컴포넌트 붙이기
		getContentPane().add(panel,"North");
		getContentPane().add(jScrollPane,"Center");
		getContentPane().add(b,"South");
		
		//이벤트 등록
		tfName.addActionListener(this); 
		tfAge.addActionListener(this); 
		tfAddr.addActionListener(this); 
		b.addActionListener(this); 
		table.addMouseListener(this);
		
		setSize(350, 350);
		setVisible(true);
		
		//프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//cons-end
	int row = -1; //전역변수 
	int col = -1; //전역변수
	//오버라이딩
	public void mousePressed(MouseEvent me){
		row = table.getSelectedRow(); //마우스가 클릭된 행 값을 얻는다 
		col = table.getSelectedColumn(); //마우스가 클릭된 열 값을 얻는다
		//System.out.println("row:"+row);
		//System.out.println("col:"+col);
		String str = (String)table.getValueAt(row, col);
		System.out.println("선택한 값:"+str);
		row = -1; //초기화
		col = -1; //초기화
	}//mousePressed()-end
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	//메서드 오버라이딩
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tfName){
			tfAge.requestFocus();
		}else if(e.getSource()==tfAge){
			tfAddr.requestFocus();
		}else if(e.getSource()==tfAddr){
			Object temp[] = {tfName.getText(),tfAge.getText(),tfAddr.getText()};
			model.addRow(temp); //행 데이터 추가 
			tfName.setText(""); //내용지우기
			tfAge.setText(""); //내용지우기
			tfAddr.setText(""); //내용지우기
			tfName.requestFocus();
			
		}
	}
	public static void main(String[] args) {
		new Test06_table(); //객체생성,생성자 호출
	}//main-end
}//class-end

package ch13_event;
import java.awt.*;
import java.awt.event.*;
//이벤트처리 하려면
//1. 클래스나 인터페이스를 상속받고
//2. 이벤트 등록을 하고
//3. 해방 메서드 오버라이딩 하고
@SuppressWarnings("serial")
public class Test02_event extends Frame implements ActionListener {
	//변수
	Panel pNorth,pSouth;
	Button bFileOpen,bFileSave,bPrint,bExit;
	//생성자
	public Test02_event(){
		super("Event 처리");
		pNorth = new Panel();
		pSouth = new Panel();
		pNorth.setBackground(new Color(194,254,231));
		pSouth.setBackground(new Color(194,254,231));
		bFileOpen = new Button("파일 열기");
		bFileSave = new Button("파일저장");
		bPrint = new Button("인쇄");
		bExit = new Button("종료");
		//패널에 버튼 붙이기
		pNorth.add(bFileOpen);
		pNorth.add(bFileSave);
		pNorth.add(bPrint);
		pSouth.add(bExit);
		//Frame에 패널붙이기
		add("North",pNorth);
		add("South",pSouth);
		addWindowListener(new MyWin());//이벤트 등록
		bFileOpen.addActionListener(this);//이벤트 등록
		bFileSave.addActionListener(this);//이벤트 등록
		bPrint.addActionListener(this);//이벤트 등록
		bExit.addActionListener(this);//이벤트 등록
		setSize(450, 450);
		setVisible(true);
	}
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class-end
	//메서드 오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bFileOpen){
			FileDialog fd = new FileDialog(this,"파일열기",FileDialog.LOAD);//열기모드
			fd.setVisible(true);
		}else if(e.getSource()==bFileSave){
			FileDialog fd = new FileDialog(this,"파일저장",FileDialog.SAVE);//저장모드
			fd.setVisible(true);
			
		}else if(e.getSource()==bPrint){
			@SuppressWarnings("unused")
			PrintJob pj = getToolkit().getPrintJob(this, "인쇄", null);
			//                                     this는 인쇄대화 상자가 소속될 부모객체이다
		}else if(e.getSource()==bExit){
			System.exit(0);
		}
	}//actionPerformed-end
	public static void main(String[] args) {
		new Test02_event();
	}

}

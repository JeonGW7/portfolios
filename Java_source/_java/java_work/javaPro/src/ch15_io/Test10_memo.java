package ch15_io;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*; //대화상자 사용하기 위해
//awt
//Exception
//io
//간단한 메모장 만들기 

//MenuBar
//Menu
//MenuItem

@SuppressWarnings("serial")
public class Test10_memo extends Frame implements ActionListener{
	//변수
	JTextArea ta; //메모장역할
	//생성자
	public Test10_memo(){
		super("메모장");
		MenuBar mb = new MenuBar(); //메뉴바
		Menu fileMenu = new Menu("파일");
		Menu editMenu = new Menu("편집");
		Menu fmtMenu = new Menu("서식");
		Menu viewMenu = new Menu("보기");
		mb.add(fileMenu); //메뉴바에 메뉴 붙이기
		mb.add(editMenu); //메뉴바에 메뉴 붙이기
		mb.add(fmtMenu); //메뉴바에 메뉴 붙이기
		mb.add(viewMenu); //메뉴바에 메뉴 붙이기
		//-----------------------------------
		//항목메뉴추가
		//-----------------------------------
		//새글
		MenuItem newItem = new MenuItem("새글",new MenuShortcut('N'));
		fileMenu.add(newItem);//파일메뉴/새글
		newItem.addActionListener(this);//이벤트 등록
		newItem.setActionCommand("new");
		
		//파일열기
		MenuItem openiItem = new MenuItem("열기",new MenuShortcut('O'));
		fileMenu.add(openiItem);//파일메뉴/열기
		openiItem.addActionListener(this);//이벤트 등록
		openiItem.setActionCommand("open");
		
		//파일저장
		MenuItem saveItem = new MenuItem("저장",new MenuShortcut('S'));
		fileMenu.add(saveItem);//파일메뉴/저장
		saveItem.addActionListener(this);//이벤트 등록
		saveItem.setActionCommand("save");
		
		//분리선/구분선
		fileMenu.addSeparator();
		
		//파일인쇄
		MenuItem printItem = new MenuItem("인쇄",new MenuShortcut('P'));
		fileMenu.add(printItem); //파일메뉴/인쇄
		printItem.addActionListener(this);//이벤트 등록
		printItem.setActionCommand("print");
		
		//분리선/구분선
		fileMenu.addSeparator();
		
		//종료
		MenuItem exitItem = new MenuItem("종료",new MenuShortcut('X'));
		fileMenu.add(exitItem);//파일메뉴/종료
		exitItem.addActionListener(this);//이벤트 등록
		exitItem.setActionCommand("exit");
		
		//프로그램 종료, 무명클래스 사용
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		ta = new JTextArea(); //메모장 생성
		add(ta,"Center");//Frame에 ta컴포넌트 붙이기 
		setMenuBar(mb);//Frame에 메뉴바(mb) 붙이기
		setSize(400,400);
		setVisible(true);
	}//cons-end
	//inner-class
	//메서드:오버라이딩
	public void actionPerformed(ActionEvent e){
		FileDialog fd = null; //클래스는 null로 초기화
		String cmd = e.getActionCommand();
		if(cmd.equals("new")){
			//ta.setText("");
			ta.setText("\0");//메모장 지우기
			setTitle("메모장");
		}else if(cmd.equals("open")){
			fd = new FileDialog(this,"파일열기",FileDialog.LOAD);
			fd.setVisible(true);
			String fn = fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileOpen(fn); //파일저장 메서드 호출
			}
		}else if(cmd.equals("save")){
			fd = new FileDialog(this,"파일저장",FileDialog.SAVE);
			fd.setVisible(true);
			String fn = fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileSave(fn);//파일 저장 메서드 호출 
			}
			
		}else if(cmd.equals("print")){
			@SuppressWarnings("unused")
			PrintJob pj = getToolkit().getPrintJob(this, "인쇄", null);
		}else if(cmd.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed()-end
	//사용자 정의 메서드 - 파일 열기 기능 구현
	public void fileOpen(String fn){
		BufferedReader in = null;
		ta.setText("\0"); //메모장 지우기 
		try{
			in = new BufferedReader(new FileReader(fn),1024);//1024 = buffer 크기
			String str = "";
			while((str=in.readLine()) != null){ //파일 끝이 아닌동안 반복수행
				ta.append(str+"\n");
			}//while-end
			setTitle("파일이름:"+fn); //창제목
		}catch(Exception ex){
			System.out.println("파일 열기 예외"+ex);
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
			out.println(str);//파일로 쓰기
			setTitle("파일이름:"+fn); //창제목
		}catch(Exception ex){
			System.out.println("파일 저장 예외"+ex);
		}finally{
			try{
				out.close();
			}catch(Exception ex2){}
		}//finally-end
	}//fileSave-end
	//main
	public static void main(String[] args) {
		new Test10_memo();//객체 생성,생성자 호출 (객체 초기화 작업을 수행)
	}//main-end
}//class-end

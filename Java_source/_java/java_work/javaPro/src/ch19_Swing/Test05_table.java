package ch19_Swing;
import java.awt.*;//Layout
import java.awt.event.*;//이벤트 처리
import javax.swing.*;
//JTable
@SuppressWarnings({ "serial", "unused" })
public class Test05_table extends JFrame{
	//변수
	JTable table;
	//생성자
	public Test05_table(){
		String cols[]={"이름","나이","이메일"};//테이블 열 제목
		Object ob[][] = 
				{{"서춘향","16","s@daum.net"},{"이도령","18","l@naver.com"},
				{"월매","41","w@nate.com"},{"향단이","15","h@daum.net"},
				{"마당쇠","17","m@naver.com"},{"무대리","35","mm@daum.net"},{"김떡순","30","k@daum.net"},
				{"이효리","45","lee@naver.com"},{"이상순","50","ll@naver.com"},
				{"갑순이","16","g@daum.net"}};
		table = new JTable(ob,cols); //테이블 생성
		JScrollPane jScrollPane = new JScrollPane(table); //table의 내용이 많을때 스크롤바 적용하기 위해서 
		this.getContentPane().add(jScrollPane); //this생략가능, JFrame에 Component붙이기
		setSize(300, 300);
		setVisible(true);
		//프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons-end
	//메서드
	public static void main(String[] args) {
		new Test05_table();
	}//main-end
}//class-end

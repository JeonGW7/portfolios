package com.example.board.model;
import java.util.Date;
public class BoardVO {
	//전역변수=필드=property
	private int bno; //일련번호
	private String subject; 
	private String content;
	private String writer;
	private Date reg_date;
	
	public BoardVO() {} //디폴트 생성자
	
	//getter,setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
}

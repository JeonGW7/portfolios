package mypa;

public class BoardDTO {
  private int num;
  private String writer;
  private String subject;
  private String content;
  private String pw;
  private String wdate;
  private int readcount;
  private String ip;
  //컴파일 =저장
  public int getNum() {
	  return num;
  }
  public void setNum(int num) {
	  this.num = num;
  }
  public String getWriter() {
	  return writer;
  }
  public void setWriter(String writer) {
	  this.writer = writer;
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
  public String getPw() {
	  return pw;
  }
  public void setPw(String pw) {
	  this.pw = pw;
  }
  public String getWdate() {
	  return wdate;
  }
  public void setWdate(String wdate) {
	  this.wdate = wdate;
  }
  public int getReadcount() {
	  return readcount;
  }
  public void setReadcount(int readcount) {
	  this.readcount = readcount;
  }
  public String getIp() {
	  return ip;
  }
  public void setIp(String ip) {
	  this.ip = ip;
  }
}

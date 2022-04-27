package com.spring.model;
public class Config {
	//변수
	String driver;
	String url;
	String user;
	String pass;
	
	//getter,setter
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	//기타 메서드, 사용자 정의 메서드
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("driver:"+driver+"\n");
		sb.append("url:"+url+"\n");
		sb.append("user:"+user+"\n");
		sb.append("pass:"+pass+"\n");
		return sb.toString(); //String 변환하여 리턴
	}//toString-end
}//class-end

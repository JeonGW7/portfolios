package com.spring.model;
public class Config {
	//����
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
	
	//��Ÿ �޼���, ����� ���� �޼���
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("driver:"+driver+"\n");
		sb.append("url:"+url+"\n");
		sb.append("user:"+user+"\n");
		sb.append("pass:"+pass+"\n");
		return sb.toString(); //String ��ȯ�Ͽ� ����
	}//toString-end
}//class-end

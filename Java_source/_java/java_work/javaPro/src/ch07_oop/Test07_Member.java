package ch07_oop;

public class Test07_Member {
	private String id;//��������=�����ʵ�
	private String pwd;
	private String name;
	private String tel;
	private String email;
	private String addr;
	
	//�����̸����� �޼��带 �����  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;//this.�������� 
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}

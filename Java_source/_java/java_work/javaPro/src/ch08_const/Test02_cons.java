package ch08_const;

class SinSang{
	String name; //��������=Ŭ��������=�ʵ�=property
	int age;
	double ki;
	//default ������
	public SinSang(){}
	//���� �ִ� ������
	public SinSang(String name,int age,double ki){
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	public SinSang(int age,String name,double ki){
		this.name = name;
		this.age = age;
		this.ki = ki;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("Ű:"+ki);
	}
}

public class Test02_cons {
	public static void main(String[] args) {
		SinSang kim = new SinSang("������",45,170.7);
		SinSang yim = new SinSang(32,"�ӿ���",182.7);
		kim.disp();
		yim.disp();
	}//main-end
}//class-end

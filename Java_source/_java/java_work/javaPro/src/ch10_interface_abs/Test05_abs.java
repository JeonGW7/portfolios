package ch10_interface_abs;
//�߻�Ŭ���� ����
abstract class Abs{
	String name;//����
	public Abs(String name){ //�ļ���
		this.name = name;
	}
	//�Ϲݸ޼���
	public void aa(){
		System.out.println("�߻�Ŭ���� ���� �Ϲ� �޼��� aa() called ");
	}
	//�߻�޼���
	abstract public void disp();
}
public class Test05_abs extends Abs{
	//������ 
	public Test05_abs(String name) {
		super(name);
	}
	//�������̵�
	public void disp(){
		System.out.println("�߻�Ŭ�������� �߻�޼��� disp() called ");
		System.out.println("�̸�:"+name);
	}
	public static void main(String[] args) {
		Abs abs = new Test05_abs("������");//����Ŭ���� ������ ���� ��ü ó�� 
		abs.aa();
		abs.disp();
	}//main-end
}//class-end

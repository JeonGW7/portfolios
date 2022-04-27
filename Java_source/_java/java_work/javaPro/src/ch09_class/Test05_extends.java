package ch09_class;

class PersonSuper{
	protected String name;
	//����Ʈ ������
	public PersonSuper(){}
	//���� �ִ� ������
	public PersonSuper(String name){
		this.name = name;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�: "+name);
	}
}//class-end
//�Ļ�Ŭ����
class PersonSub extends PersonSuper{
		private double left_eye;//���� �÷�
		private double right_eye;//������ �÷�
		//����Ʈ ������
		public PersonSub(){}
		//�����ִ� ������
		public PersonSub(String name,double left_eye,double right_eye){
			super(name); //���� Ŭ���� ������ ȣ��
			this.left_eye = left_eye;
			this.right_eye = right_eye;
		}
		//�������̵�: ��ӹ��� �޼��� ���� ������
		public void disp(){
			System.out.println("�̸�: "+name);
			System.out.println("���� �÷�: "+left_eye);
			System.out.println("������ �÷�: "+right_eye);
		}
}//class-end
//�Ļ�Ŭ����
class PersonSin extends PersonSuper{
		private String addr;
		private String tel;
		//����Ʈ ������
		public PersonSin(){}
		//�����ִ� ������
		public PersonSin(String name,String addr,String tel){
			super(name);
			this.addr = addr;
			this.tel = tel;
		}
		//�������̵�: ��ӹ��� �޼��� ���� ������
		public void disp(){
			System.out.println("�̸�: "+name);
			System.out.println("�ּ�: "+addr);
			System.out.println("��ȭ��ȣ: "+tel);
		}
}//class-end
public class Test05_extends {

	public static void main(String[] args) {
		PersonSub sub = new PersonSub("��ȿ��",1.2,1.5);
		sub.disp();
		System.out.println();
		PersonSin sin = new PersonSin("���缮","����","010-1234-5678");
		sin.disp();
	}//main-end
}//class-end

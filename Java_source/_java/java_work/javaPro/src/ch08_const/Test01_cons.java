package ch08_const;
/**
1.�����ڴ� Ŭ�����̸��� ���� 
2.�����ڴ� �������� ����. �ʵ�(��ü)�ʱ�ȭ�� �����̴� 
3.�μ��� ���´� -> �����ε尡 �����ϴ� 
4.��ü������ ȣ��ȴ�
*/
class Sung{
	String name;
	int kor;
	//����Ʈ ������
	public Sung(){
//		System.out.println("default ������");
		name="";
		kor=0;
	}
	//���� �ִ� ������
	public Sung(String name,int kor){
//		System.out.println("���� �ִ� ������");
		this.name = name;
		this.kor = kor;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("��������:"+kor);
		System.out.println();
	}
}//class-end
public class Test01_cons {
	public static void main(String[] args) {
//		new Sung();//����Ʈ ������ ȣ��
//		new Sung("kim",88);//�����ִ� ������ ȣ��
		Sung kim = new Sung("kim",88); //��ü����,������ ȣ�� 
		Sung lee = new Sung("lee",99);
		Sung park = new Sung("park",100);
		kim.disp();
		lee.disp();
		park.disp();
	}//main-end
}//class-end

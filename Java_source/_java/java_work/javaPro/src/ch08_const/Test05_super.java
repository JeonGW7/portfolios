package ch08_const;
class SuperCons{
	String title;
	int num;
	//����Ʈ ������
	public SuperCons(){}
	//���� �ִ� ������
	public SuperCons(String title,int num){
		this.title = title;
		this.num = num;
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("���� Ŭ����");
		System.out.println(title+"-"+num);
		System.out.println();
	}
}//class-end----
//�Ļ�Ŭ����=����Ŭ����
class Subcons extends SuperCons{
	//������
	public Subcons(){
		super("abc",100);//����Ŭ���� ������ ȣ��
	}
}//class-end
public class Test05_super {

	public static void main(String[] args) {
		Subcons sub = new Subcons();
		sub.disp();
	}//main-end
}//class-end

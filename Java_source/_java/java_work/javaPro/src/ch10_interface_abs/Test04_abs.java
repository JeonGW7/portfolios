package ch10_interface_abs;
abstract class Abc{
	abstract public void aa();//�߻�޼���
	public void bb(){//�Ϲݸ޼���
		System.out.println("�߻�Ŭ����.bb()�Ϲݸ޼��� called");
	}
}//class-end
class Mbc extends Abc{
	//�������̵�
	public void aa(){
		System.out.println("�߻�޼��� aa()�߻�޼��� called");
	}
}
public class Test04_abs {
	public static void main(String[] args) {
		Abc abc = new Mbc();//����Ŭ���� ������ ���� ��ü ó��
		abc.aa();
		abc.bb();
	}//main-end
}//class-end

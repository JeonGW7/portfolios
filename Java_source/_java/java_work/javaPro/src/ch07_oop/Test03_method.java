package ch07_oop;
//���ϰ��� �ִ� �޼ҵ� ����
//����������-������(�ڷ���)-�޼ҵ��̸�(){ó������;}
public class Test03_method {
	public int aa(){
		System.out.println("aa() called~");
		return 100;
	}
	public double bb(){
		System.out.println("bb() called~");
		return 12.5;
	}
	public String getName(){
		System.out.println("getName() called");
		return "ȫ�浿";
	}
	//main��  ������ ���ؼ� ȣ�� �Ǿ������� ���ÿ�: JVM 
	public static void main(String[] args) {
		Test03_method t = new Test03_method(); //��ü����(heap������ �޸� �Ҵ�), ������ ȣ��
		double d = t.bb();
		System.out.println("d: "+d);
		//
		System.out.println(t.bb());
		//
		System.out.println(t.aa());
		//
		System.out.println(t.getName());
	}//main-end
}//class-end

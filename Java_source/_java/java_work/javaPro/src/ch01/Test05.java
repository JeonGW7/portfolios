package ch01;
//�ϳ��� ���α׷����� �������� Ŭ������ ���� �� �ִ�
//�����̸��� : �� Ŭ������ �Ѵ�. main()�� �Ҽӵ� Ŭ������ �� Ŭ�����̴�
//�� Ŭ������ �ݵ�� public ���� �����ڸ� ����ؾ��Ѵ�
public class Test05 {
	public static void main(String[] args) {
		//�ܺ� Ŭ���� ���, ��ü �����ϰ� ��ü.method() 
		Demo5 d5 = new Demo5(); //��ü ����
		d5.aa();
	}//main-end
}//class-end

class Demo5{
	public void aa(){
		System.out.println("aa() called");
	}
}
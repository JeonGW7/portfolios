package ch09_class;
//Ŭ���� ��� ����
class PanMae{
	protected String pum;//��ȣ�ʵ�=��������
	protected int su;
	protected int dan;
	//����Ʈ ������
	public PanMae(){}
	//���ڰ� �ִ� ������
	public PanMae(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//����� ���� �޼���
	protected void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end
//�Ļ� Ŭ����
class PanMaeSub extends PanMae{
	private double rate; //������, ��������
	//����Ʈ ������
	public PanMaeSub(){}
	//���ڰ� �ִ� ������
	public PanMaeSub(String pum,int su,int dan,double rate){
		super(pum,su,dan); //����Ŭ���� ������ ȣ��
		this.rate = rate;
	}
	//�������̵�:��ӹ��� �޼��� ���� ������
	public void disp(){
		System.out.println();
		System.out.println("ǰ��:"+pum);
		System.out.println("����:"+su);
		System.out.println("�ܰ�:"+dan);
		System.out.println("������:"+rate);
		System.out.println("10���ξ�:"+(dan*rate)+"��");
		System.out.println("���ΰ�:"+(dan-(dan*rate))+"��");
	}
}
public class Test04_extends {

	public static void main(String[] args) {
		PanMaeSub clo = new PanMaeSub("�е�",1,250000,0.2);
		clo.disp();
	}//main-end
}//class-end

package ch09_class;
class PanMae3{
	protected String pum;
	protected int su;
	protected int dan;
	//����Ʈ ������
	public PanMae3(){}
	//���� �ִ� ������
	public PanMae3(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//����� ���� �޼��� 
	public void disp(){
		System.out.println(); 
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end
//�Ļ�Ŭ����
class SalePanMae3 extends PanMae3{
	private double rate;//������
	//����Ʈ ������
	public SalePanMae3(){}
	//�����ִ� ������
	public SalePanMae3(String pum,int su,int dan,double rate){
		super(pum,su,dan); //����Ŭ���� ������ ȣ��
		this.rate = rate;
	}
	//�������̵�
	public void disp(){
		System.out.println();
		System.out.println("pum: "+pum);
		System.out.println("su: "+su);
		System.out.println("dan: "+dan);
	}
	//����� ���� �޼���
	public void halinAk(){
		System.out.println("���ξ�: "+(dan*rate));
	}
	
}//class-end
public class Test09_downcasting {
	public static void main(String[] args) {
		PanMae3 p[] = new PanMae3[4]; //�迭����
		p[0] = new PanMae3("�����",3,6000);
		p[1] = new SalePanMae3("������",5,8000,0.2);
		p[2] = new PanMae3("�ε�ī��",2,9000);
		p[3] = new SalePanMae3("������",1,12000,0.2);
		for(int i=0;i<p.length;i++){
			p[i].disp();
			if(p[i] instanceof SalePanMae3){
				((SalePanMae3)p[i]).halinAk();
			}
		}
	}//main-end
}//class-end

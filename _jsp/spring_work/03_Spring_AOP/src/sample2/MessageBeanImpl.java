package sample2;
//����Ŭ����=���ϴ� Ŭ����=�����Ͻ�����
public class MessageBeanImpl implements MessageBean{
	private String name; //����
	
	//setter�޼���
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(2000); //2��
		}catch(InterruptedException ex){}
		System.out.println("hello2,"+name);
	}
	
	//�������̵�
}//class-end

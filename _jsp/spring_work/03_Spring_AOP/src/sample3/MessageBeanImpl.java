package sample3;

//target=���ϴ� Ŭ����=�����Ͻ�����
public class MessageBeanImpl implements MessageBean{
	String name; //����

	//setter�޼���
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(3000); //3��
		}catch(InterruptedException ex){}
		
		//ó��
		System.out.println("Hello3~~~ "+name);
	}//sayHello-end
}//class-end

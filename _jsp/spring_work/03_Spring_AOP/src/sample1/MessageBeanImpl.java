package sample1;
//target
//���� Ŭ���� : ���ϴ� Ŭ���� : �����Ͻ� ���� 
public class MessageBeanImpl implements MessageBean{
	private String name; //����
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(2000); //�۾��ð��� 2�� �ɸ��� ���ش�
		}catch(InterruptedException ex){}
		System.out.println("Hello "+name+"��");
	}//sayHello-end

}//class-end

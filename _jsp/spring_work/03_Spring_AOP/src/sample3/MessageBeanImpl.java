package sample3;

//target=일하는 클래스=비지니스로직
public class MessageBeanImpl implements MessageBean{
	String name; //변수

	//setter메서드
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(3000); //3초
		}catch(InterruptedException ex){}
		
		//처리
		System.out.println("Hello3~~~ "+name);
	}//sayHello-end
}//class-end

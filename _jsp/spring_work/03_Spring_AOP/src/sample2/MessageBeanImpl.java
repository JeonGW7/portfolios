package sample2;
//구현클래스=일하는 클래스=비지니스로직
public class MessageBeanImpl implements MessageBean{
	private String name; //변수
	
	//setter메서드
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(2000); //2초
		}catch(InterruptedException ex){}
		System.out.println("hello2,"+name);
	}
	
	//오버라이딩
}//class-end

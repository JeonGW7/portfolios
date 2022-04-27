package sample1;
//target
//구현 클래스 : 일하는 클래스 : 비지니스 로직 
public class MessageBeanImpl implements MessageBean{
	private String name; //변수
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try{
			Thread.sleep(2000); //작업시간을 2초 걸리게 해준다
		}catch(InterruptedException ex){}
		System.out.println("Hello "+name+"님");
	}//sayHello-end

}//class-end

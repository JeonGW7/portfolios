package ch18_Thread;
import java.util.*; //Vector 사용하기 위해
public class Test05_Thread {
	public static void main(String[] args) {
		House house = new House(); //객체생성
		Producer p = new Producer(house); //객체생성
		Consumer c = new Consumer(house); //객체생성
		p.start();//run()호출
		c.start();//run()호출
	}//main-end
}//class-end
//---------------------------
class House extends Thread{
	//변수
	@SuppressWarnings("rawtypes")
	Vector vec;
	//생성자
	@SuppressWarnings("rawtypes")
	public House(){
		vec = new Vector();
	}
	//put()메서드
	@SuppressWarnings("unchecked")
	synchronized void put(char ch){
		while(vec.size()==3){
			try{
				wait();//현재 스레드 대기
			}catch(InterruptedException ex){}
		}//while-end
		//대기가 끝나면 
		//처리내용 
		vec.add(new Character(ch));//vec에 넣기
		System.out.println("창고에 제품"+ch+"가 들어 왔음");
		System.out.println("제품수량:"+vec.size());
		notifyAll();//현재 스레드가 작업이 종료 되었음을 모두에게 알린다
	}//put-end
	//get()메서드
	synchronized char get(){
		while(vec.size()==0){//대기
			try{
				wait();//현재 스레드 대기상태
			}catch(InterruptedException ex){}
		}//while-end
		//대기 끝나면
		//처리내용
		Character ch = (Character)vec.remove(0); //vec에서 꺼내고 삭제 
		System.out.println("창고에서 제품"+ch+"가 나갔음");
		System.out.println("창고에 있는 제품 수량:"+vec.size());
		notifyAll();//현재 스레드가 작업이 종료되었음을 모두에게 알린다
		return ch.charValue();
	}//get-end
}//class-end

//생산 클래스 : House의 put()메서드 호출
class Producer extends Thread{
	//변수
	private House house;
	//생성자
	public Producer(House house){
		this.house = house;
	}
	//run()오버라이딩
	public void run(){
		for(char ch='A';ch<='J';ch++){
			System.out.println("생산자가 제품:"+ch+"를 생산했음");
			house.put(ch);//메서드 호출
		}
	}//run-end
}//class-end

//소비클래스 : House의 get()메서드 호출
class Consumer extends Thread{
	//변수
	House house;
	//생성자
	public Consumer(House house){
		this.house = house;
	}
	//run()오버라이딩
	public void run(){
		char ch;//변수
		for(int i=1;i<=10;i++){
			ch = house.get();//메서드 호출
			System.out.println("소비자가 제품 "+ch+"를 소비 했음");
		}
	}
}




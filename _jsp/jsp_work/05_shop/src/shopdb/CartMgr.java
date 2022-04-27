package shopdb;
import java.util.Hashtable; //Hashtable 장바구니로 사용, 스레드 기능 있어서
//Hashtable
//key value 
//장바구니처리
public class CartMgr {
	private Hashtable hcart=new Hashtable(); //객체생성
	public CartMgr(){} //디폴트 생성자
	//장바구니에 넣기 메서드
	public void addCart(OrderDTO orderDTO){
		int pro_no=orderDTO.getPro_no(); //상품일련번호
		String q=orderDTO.getQuantity(); //수량
		int quantity=Integer.parseInt(q); //수량 정수로 변환
		if(quantity>0){ //주문수량이 있으면
			if(hcart.containsKey(pro_no)){
				//같은 물건을 추가 구매 했을때
				OrderDTO tempDTO=(OrderDTO)hcart.get(pro_no);
				quantity+=Integer.parseInt(tempDTO.getQuantity()); //수량추가
			}else{
				//hcart에 pro_no가 없을때, 상품을 장바구니에 처음 넣는경우
				hcart.put(pro_no,orderDTO);
			}//else-end
		}//if-end
	}//addCart-end
	
	//----------------------------
	// hcart내용을 리턴한다
	// 장바구니 내용 리스트
	//----------------------------
	public Hashtable getCartList(){
		return hcart;
	}//getCartList-end
	
	//----------------------------
	// hcart내용 수정
	//----------------------------
	public void updateCart(OrderDTO orderDTO){
		int pro_no=orderDTO.getPro_no(); //상품 일련번호,key
		hcart.put(pro_no, orderDTO); //해쉬테이블에 (key,value)넣는다
	}//updateCart-end
	
	//-----------------------------
	// hcart 내용 제거
	//-----------------------------
	public void deleteCart(OrderDTO orderDTO){
		int pro_no=orderDTO.getPro_no(); //상품일련번호,key
		hcart.remove(pro_no); //pro_no에 해당하는 것을 삭제
	}
}//class-end

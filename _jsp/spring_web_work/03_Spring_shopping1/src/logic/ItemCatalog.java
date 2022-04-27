package logic;
import java.util.List;
import dao.ItemDao;
//인터페이스 : 메서드 선언만 한다
//메서드 접근 제한자는 항상 public이다, 생략하더라도 public이다
public interface ItemCatalog {
	List<ItemDTO> getItemList(); //추상메서드
}//---

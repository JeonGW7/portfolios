package dao;
import java.util.List;
import logic.ItemDTO;
//인터페이스
public interface ItemDao {
	List<ItemDTO> findAll(); //추상 클래스
}

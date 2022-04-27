package logic;

import java.util.List;

import dao.ItemDao;
//미들웨어
public class ItemCatalogImpl implements ItemCatalog{
	private ItemDao itemDao; //변수
	
	//shopping1-servlet.xml 참조
	//p:itemDao-ref="itemDao"
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public List<ItemDTO> getItemList() {
		return this.itemDao.findAll();
	}

	@Override
	public ItemDTO getItemByItemId(Integer itemId) {
		return this.itemDao.findByPrimary(itemId);
	}

}

package logic;

import java.util.List;

public class ShopImpl implements Shop{
	private ItemCatalog itemCatalog; //변수
	
	//shopping1-servlet.xml 참조
	//p:itemCatalog-ref="itemCatalog"
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	@Override
	public List<ItemDTO> getItemList() {
		return this.itemCatalog.getItemList();
	}

	@Override
	public ItemDTO getItemByItemId(Integer itemId) {
		return this.itemCatalog.getItemByItemId(itemId);
	}

}

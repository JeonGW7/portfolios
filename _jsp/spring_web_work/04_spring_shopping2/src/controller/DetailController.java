package controller;
import java.util.Map;
import java.util.HashMap;
import logic.ItemDTO;
import logic.Shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailController {
	private Shop shopService; //변수=property
	
	//setter
	public void setShopService(Shop shopService) {
		this.shopService = shopService;
	}
	//임의의 메서드 앞에 
	//@RequestMapping 어노테이션을 부여함으로써 
	//요청을 처리하는 메서드로 지정할 수 있다
	@RequestMapping
	public ModelAndView detailItem(Integer itemId){
		ItemDTO itemDTO=this.shopService.getItemByItemId(itemId);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("itemDTO", itemDTO);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("detail");
		mv.addAllObjects(map);
		return mv;
	}
}//class-end

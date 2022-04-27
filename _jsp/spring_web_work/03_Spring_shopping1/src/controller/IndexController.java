package controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import logic.ItemDTO;
import logic.Shop;
//Controller=Action
//어노테이션 사용않고 Controller상속 받아서 오버라이딩
public class IndexController implements Controller{
	private Shop shopService; //변수
	
	//shopping1-servlet.xml 참조
	//
	public void setShopService(Shop shopService) {
		this.shopService = shopService;
	}

	//handleRequest()
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<ItemDTO> itemList=this.shopService.getItemList();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/WEB-INF/jsp/index.jsp");
		mv.addObject("itemList",itemList); //jsp에서 사용할 데이터 
		return mv;
	}

}//class-end

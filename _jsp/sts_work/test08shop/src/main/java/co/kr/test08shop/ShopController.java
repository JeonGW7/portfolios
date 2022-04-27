package co.kr.test08shop;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model; // request.setAttribute("key", value)
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;//***

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.apache.ibatis.session.SqlSession; // MyBatis 사용
import model.shop.ShopDto;

@RequestMapping("/shop")
@Controller
public class ShopController {
	@Autowired
	SqlSession sqlSession; //자동 setter작업
	
	//상품목록 리스트
	@RequestMapping("shopList.do")
	public String shopList(Model model,String search) {
		List<ShopDto> list=null;
		if(search==null) {
			list=sqlSession.selectList("shop.shopList");
		}else if(search != null) {
			list=sqlSession.selectList("shop.shopSearchList",search);
		}
		model.addAttribute("list",list);
		model.addAttribute("cnt",list.size());
		return "/shop/shopList"; //shopList.jsp 뷰 리턴
	}
}//class-end

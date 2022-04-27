package co.kr.test01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession; //MyBatis 사용

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//추가
	@Autowired
	private SqlSession sqlSession; //전역변수
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//추가
		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("name", "park");
		List<HashMap<String,String>> list=sqlSession.selectList("samm.searchList",map1);
		model.addAttribute("list",list); //JSP에서 사용할 데이터
		System.out.println(list.toString()); //xml데이터가 정상적으로 들어왔는지 확인하기위해 사용
		
		//JSP
		//request.setAttribute("key,value)
		return "home"; //뷰 리턴 home.jsp
	}//home-end
	
	@RequestMapping("/insertForm.do")
	public String insertForm() {
		return "insertForm"; //insertForm.jsp 뷰 리턴
	}
	@RequestMapping(value="insertPro.do",method=RequestMethod.POST)
	public String insertP(String name,String email) {
		
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("name",name);
		map.put("email",email);
		sqlSession.insert("samm.insertSam",map);
		
		return "insertForm";  //insertForm.jsp
	}
}//class-end

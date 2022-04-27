package com.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//컨트롤러=Action
@Controller
public class TestController {
	@RequestMapping("aaa") //요청
	public ModelAndView helloWorld(){
		String msg="Hello! gil-dong";
		ModelAndView mv=new ModelAndView();
		mv.setViewName("bbb"); //뷰=bbb.jsp
		mv.addObject("msg",msg); //jsp에서 사용할 데이터
		return mv;
	}
}//class-end

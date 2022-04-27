package com.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Controller=Action
@Controller
public class HelloController {
	@RequestMapping("/hello") // /hello 이렇게 요청이 들어오면 hello메서드가 실행된다
	public ModelAndView hello(){
		String msg="Hello, Spring 3!!!";
		return new ModelAndView("hello","msg",msg);
		//                         (뷰=jsp, jsp에서 사용할 데이터 ${msg} )
	}//hello-end
}//class-end

package controller;
import logic.Shop;
import logic.UserDTO;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

//컨트롤러
@Controller
public class LoginFormController {
	private Shop shopService;
	private Validator loginValidator;
	
	//setter 메서드
	public void setShopService(Shop shopService) {
		this.shopService = shopService;
	}
	public void setLoginValidator(Validator loginValidator) {
		this.loginValidator = loginValidator;
	}
	
	//로그인 화면 표시 (WEB-INF/jsp/login.jsp)
	//login.html로 요청시 처리되는 메서드
	@RequestMapping(method=RequestMethod.GET)
	public String toLoginView(){
		return "login"; //login.jsp 뷰 : 로그인 화면
	}
	
	//<form:form modelAttribute="user">
	@ModelAttribute
	public UserDTO setUpForm(){
		return new UserDTO(); //모델빈을 생성해서 리턴
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView onSubmit(UserDTO user, BindingResult bindingResult){
		// BindingResult 인스턴스는 검증 결과가 저장된 것이다
		this.loginValidator.validate(user, bindingResult);
		
		//검증 대상은 user 인스턴스와.
		//검증 결과를 저장할 BindingResult 인스턴스를 건내준다 
		ModelAndView mv=new ModelAndView();
		if(bindingResult.hasErrors()){
			mv.getModel().putAll(bindingResult.getModel());
			return mv;
		}//에러가 있으면 로그인 화면으로 되돌아 간다
		
		//로그인 화면에서 입력된 값을 지우지 않고 표시하기 위해
		//bindingResult 인스턴스에서 모델을 꺼내어
		//ModelAndView 인스턴스에 저장한다
		//return mv 하면 로그인화면으로 되돌아 간다(에러가 있을 경우)
		
		try{
			//유저 정보 검색
			UserDTO userDTO=this.shopService.getUserByUserIdAndPassword(user.getUserId(),user.getPassword());
			
			//유저가 있을때
			mv.setViewName("loginSuccess"); //loginSuccess.jsp
			mv.addObject("userDTO",userDTO); //jsp(뷰)에서 사용할 데이터
			return mv; //로그인 성공시
		}catch(EmptyResultDataAccessException ex){
			//유저가 없을때
			bindingResult.reject("error.login.user"); //에러 메시지
			//error.login.user=입력된 유저ID 패스워드가 맞지 않습니다
			mv.getModel().putAll(bindingResult.getModel()); //모델을 리턴
			return mv; //로그인 실패시
		}//catch-end
	}
}//class-end

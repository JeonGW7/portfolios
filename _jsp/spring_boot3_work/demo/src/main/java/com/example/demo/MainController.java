package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   
   @RequestMapping(value="/")
   public String main(Model model) {
      
      model.addAttribute("msg","안녕하세요");
      return "index";//뷰리턴 WEB-INF/views/index.jsp 작성
   }
}
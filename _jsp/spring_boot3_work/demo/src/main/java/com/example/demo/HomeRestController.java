package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeRestController {
	
   @RequestMapping("/java")
   public static void main(String args[]) {
	   System.out.println("Hello java");
   }
   @RequestMapping("/web")
   public String home() {
      return "Welcome!!!";
   }
}
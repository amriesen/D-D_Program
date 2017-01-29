package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHomePage(){
		
		return "home";
	};


	@RequestMapping("/userHome")
	public String showUserHome(){

		return "userHome";
	};

}

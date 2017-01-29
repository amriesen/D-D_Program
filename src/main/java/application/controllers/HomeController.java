package application.controllers;

import application.dndObjects.Campaign;
import application.dndObjects.Character;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHomePage(){

		//Check if user is logged in. Redirect to user home if yes
		//not working yet
		if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()){
			return "home";
		}
		else {
			return "redirect:/userHome";
		}
	};


	@RequestMapping("/userHome")
	public String showUserHome(Model model){

		List<Character> characterList = new ArrayList<>();
		characterList.add(new Character("Steve"));
		characterList.add(new Character("Bob"));
		characterList.add(new Character("Joe"));

		model.addAttribute("characters", characterList);

		List<Campaign> campaignList = new ArrayList<>();
		campaignList.add(new Campaign("Steve"));
		campaignList.add(new Campaign("Bob"));
		campaignList.add(new Campaign("Joe"));

		model.addAttribute("campaigns", characterList);

		return "userHome";
	};

}

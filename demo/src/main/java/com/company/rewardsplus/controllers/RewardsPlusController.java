package com.company.rewardsplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.rewardsplus.model.SignUp;

@Controller
public class RewardsPlusController {
	
	@GetMapping("/signup")
	public String signupForm(Model model){
		SignUp signup = new SignUp();
		model.addAttribute("signup", signup);
		return "signup";		
	}
	
	@PostMapping("/signup")
	public String signupSubmit(@ModelAttribute("signup") SignUp signup){
		return "confirmation";
	}

}

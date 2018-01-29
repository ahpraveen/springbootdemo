package com.company.rewardsplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.rewardsplus.model.CustomerInfo;

@Controller
public class RewardsPlusController {
	
	@GetMapping("/signup")
	public String signupForm(Model model){
		CustomerInfo customerinfo = new CustomerInfo();
		model.addAttribute("customerinfo", customerinfo);
		return "signup";		
	}
	
	@PostMapping("/signup")
	public String signupSubmit(@ModelAttribute("customerinfo") CustomerInfo customerinfo){
		return "confirmation";
	}

}

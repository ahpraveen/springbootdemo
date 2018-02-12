package com.company.rewardsplus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.rewardsplus.dao.CustomerInfoRepository;
import com.company.rewardsplus.model.CustomerInfo;

@Controller
public class RewardsPlusController {
	
	@Autowired
	private CustomerInfoRepository customerinforep;
	
	@GetMapping("/home")
	public String getHomePage(){
		return "home";
	}
	
	@GetMapping("/login")
	public String getLoginPage(Model model){
		CustomerInfo customerinfo = new CustomerInfo();
		model.addAttribute("customerinfo", customerinfo);
		return "login";
	}
	
	@PostMapping("/welcome")
	@ResponseBody
	public String validateLogin(@ModelAttribute("customerinfo") CustomerInfo customerinfo){
		
		return "yet to implement";
		
	}
	
	@GetMapping("/signup")
	public String signupForm(Model model){
		CustomerInfo customerinfo = new CustomerInfo();
		model.addAttribute("customerinfo", customerinfo);		
		return "signup";		
	}
	
	@PostMapping("/signup")
	public String signupSubmit(@ModelAttribute("customerinfo") CustomerInfo customerinfo){		
		customerinforep.save(customerinfo);
		return "confirmation";
	}
	
	@GetMapping(path="mycustomer/{id}")
	public String showCustomerById(@PathVariable("id") Integer id, Model model) {		
		model.addAttribute("customerinfo", customerinforep.findOne(id));
		return "customer";
	}
	
	@GetMapping(path="customer/showall")
	public @ResponseBody Iterable<CustomerInfo> getAllCust() {
		// This returns a JSON or XML with the users
		return customerinforep.findAll();
	}
	
	@GetMapping(path="customer/{id}")
	public @ResponseBody CustomerInfo getCustomerById(@PathVariable("id") Integer id) {
		return customerinforep.findOne(id);
	}
	
	@GetMapping(path="customer/delete/{id}")
	public @ResponseBody void deleteCust(@PathVariable("id") Integer id) {
		customerinforep.delete(id);		
	}	
	
	@GetMapping(path="customer/delete/all")
	public @ResponseBody void deleteAllCust() {
		customerinforep.deleteAll();
		System.out.println("all the customers are deleted successfully");
	}	
}

package com.example.demo.samplecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.samplemodel.SampleModel;

@Controller
public class SampleController {
	
	SampleModel samplemodel = new SampleModel();

	@RequestMapping("/index")
	public String index(@RequestParam(value="name",required=false,defaultValue="Praveen") String name,Model model){
		samplemodel.setName("Viki");
		model.addAttribute("name",samplemodel.getName());
		return "index";		
	}
}	

package com.BikkadIT.SpringwebMVCfirstApp.Controller;

//to send simple msg from controller to UI page

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class India {

	
	//way 1 to send data from contoller to UI page
	
	@GetMapping("/getdata")
	public ModelAndView Data() {
		
		String msg="hello India";
		ModelAndView mv = new ModelAndView();
		mv.addObject("MESSAGE",msg);
		mv.setViewName("proper");
		return mv;
		
	}

	public India() {
		super();
		System.out.println("India class constructor");
	}
	
	//way 2 to send data from controller to UI page
	
	@GetMapping("/DATAonUI")
	public String way2(Model model) {
		String msg="way2 to send data from controller to UI";
		model.addAttribute("MESSAGE",msg);
		return "welcome";
		
	}
	
}

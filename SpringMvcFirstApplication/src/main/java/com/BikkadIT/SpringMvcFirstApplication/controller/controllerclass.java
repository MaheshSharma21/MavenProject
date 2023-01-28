package com.BikkadIT.SpringMvcFirstApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerclass {

	
	public controllerclass() {
		super();
	System.out.println("Controller class constructor");
	}
	
	@GetMapping("/DataView")
	public ModelAndView Demo() {
		String msg="welcome India ";
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("MESSAGE",msg);
		mv.setViewName("proper");
		return mv;
	}
}
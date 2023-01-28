package com.BikkadIT.SpringMVCsecondApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Shop {

	public Shop() {
		super();
		System.out.println("Shop class constructor");
	}

	@GetMapping("/greetView")
	public String weldone(Model model) {
		String Msg="weldone Team India";
		model.addAttribute("MESSAGE",Msg);
		//return "greet";
	}
	
}

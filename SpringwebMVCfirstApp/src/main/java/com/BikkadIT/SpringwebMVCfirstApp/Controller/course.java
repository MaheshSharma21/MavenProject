package com.BikkadIT.SpringwebMVCfirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class course {

	@GetMapping("/getdetails")
	public String demo(@RequestParam String name,String Password,Model model) {
		String msg = "  Mahesh your changed name is :"+name +" and Your changed password is : "+Password;
		
		System.out.println(msg);
		
		model.addAttribute("simpleMSG",msg);
		
		return "passbook";
		
	}
}

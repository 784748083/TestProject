package com.Ace.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class UserController {

	private Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		// write your logic here
		return "login/login";
	}
	
	@RequestMapping(value="/loginCheck",method={RequestMethod.GET,RequestMethod.POST})
	public String loginCheck(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password,Model model){
		log.info(username  +  "-"+password); 
		model.addAttribute("uname", username);
		model.addAttribute("pword", password);
		return "mac-Bootstrap/index";
	}
	
	

}
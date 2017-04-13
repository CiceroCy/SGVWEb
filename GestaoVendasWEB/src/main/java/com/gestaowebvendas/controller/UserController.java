package com.gestaowebvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	private String GO_CAD_USER="usuario/cadUser";
	
	@GetMapping(value="cadastrarUser.html")
	public ModelAndView cadastrarUser(){
		ModelAndView mv=new ModelAndView(GO_CAD_USER);
		return mv;
	}
	

}

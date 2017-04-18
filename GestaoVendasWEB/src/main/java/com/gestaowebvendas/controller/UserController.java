package com.gestaowebvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestaowebvendas.entity.Usuario;

@Controller
public class UserController {
	
	private String GO_CAD_USER="usuario/cadUser";
	
	@GetMapping(value="cadastrarUser.html")
	public ModelAndView cadastrarUser(){
		ModelAndView mv=new ModelAndView(GO_CAD_USER);
		return mv;
	}
	

	@PostMapping(value="saveUser.html")
	public ModelAndView save(@ModelAttribute Usuario user){
		ModelAndView mv=new ModelAndView(GO_CAD_USER);
		System.out.println(user.getNome());
		
		return mv;
	}
	
	
}

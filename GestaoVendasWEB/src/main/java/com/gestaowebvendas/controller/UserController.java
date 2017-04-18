package com.gestaowebvendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestaowebvendas.entity.Usuario;
import com.gestaowebvendas.service.UsuarioService;

@Controller
public class UserController {

	private String GO_CAD_USER = "usuario/cadUser";
	private String GO_DASHBOARD = "home/dashboard";

	@Autowired
	private UsuarioService usuerioService;

	@GetMapping(value = "cadastrarUser.html")
	public ModelAndView cadastrarUser() {
		ModelAndView mv = new ModelAndView(GO_CAD_USER);
		return mv;
	}

	@PostMapping(value = "saveUser.html")
	public ModelAndView save(@ModelAttribute @Valid Usuario user, BindingResult result) {
		
	

		ModelAndView mv = new ModelAndView(GO_DASHBOARD);
		if (result.hasErrors()) {
			return mv;
		}
           usuerioService.save(user);
		
		return mv;
	}

}

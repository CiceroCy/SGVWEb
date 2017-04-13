package com.gestaowebvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControler {
	private static String GO_LOGIN = "login";
	private static String GO_RECOVER = "esqueceu-a-senha";
	private static String GO_CREATE = "novo-usuario";

	@RequestMapping(value = "login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView(GO_LOGIN);

		return mav;
	}
}

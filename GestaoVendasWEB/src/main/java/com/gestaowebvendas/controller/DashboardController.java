/**
 * 
 */
package com.gestaowebvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
*
* @author anderson.aristides
*
*/
@Controller
public class DashboardController {
	
	private static String GO_HOME = "home/dashboard";

	@RequestMapping(value = "dashboard.html")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView(GO_HOME);
		return mav;
	}

}

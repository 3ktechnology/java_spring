package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.entity.Login;
import com.mvc.service.ValidationService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private ValidationService validationService;

	@GetMapping(value = "/loadLogInPage")
	public String load(@ModelAttribute("loginForms")Login login,Model model,HttpServletRequest request, HttpServletResponse res) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@PostMapping (value = "/validateLoginPage")
	public String validate(@ModelAttribute("loginForms") Login login,	Model model,BindingResult bindingResult) {
		boolean isValid = validationService.validate(login);
		model.addAttribute("login", login);
		String jsp= null;
		if(isValid) {
			jsp = "success";
		} else {
			jsp = "failure";
		}
		return jsp;
	}

	
}



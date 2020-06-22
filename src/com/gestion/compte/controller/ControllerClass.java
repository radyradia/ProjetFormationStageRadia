package com.gestion.compte.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class ControllerClass {

	@RequestMapping("/")
	public String showPage() {
		return "index";
}
}

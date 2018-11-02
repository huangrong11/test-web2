package com.syaccp.easybuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {

	public NewsController() {
		System.out.println("NewsController 造出来了");
	}
	
	@RequestMapping("/save")
	public String  save() {
		System.out.println("NewsController save");
		return "";
	}
	
}

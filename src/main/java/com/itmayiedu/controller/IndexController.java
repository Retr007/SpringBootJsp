
package com.itmayiedu.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);


	@RequestMapping("/index")
	public String index() {
		System.out.println("this is index...");
		return "index";
	}

}

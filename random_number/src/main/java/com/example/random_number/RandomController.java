package com.example.random_number;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RandomController {
	
@RequestMapping("/getrandom")
public ModelAndView getRandom() {
	ModelAndView modelAndView = new ModelAndView("welcome");
	modelAndView.addObject("key", "Random number ::::");
	modelAndView.addObject("number", (int)(Math.random()*10000));
	System.out.println("controller");
	return modelAndView;
}
}

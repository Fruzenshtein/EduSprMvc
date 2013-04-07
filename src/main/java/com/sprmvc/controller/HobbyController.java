package com.sprmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Hobby;

@Controller
public class HobbyController {

	@RequestMapping(value="/hobby-page")
	public ModelAndView hobbyFormPage() {
		return new ModelAndView("hobby-form", "hobby", new Hobby());
	}
	
	@RequestMapping(value="/hobby-result")
	public ModelAndView processHobby(@ModelAttribute Hobby hobby) {
		ModelAndView modelAndView = new ModelAndView("hobby-result");
		modelAndView.addObject("hobby", hobby);
		return modelAndView;
	}
	
}

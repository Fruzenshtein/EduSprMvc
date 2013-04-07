package com.sprmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Food;

@Controller
public class FoodController {

	@RequestMapping(value="/food-page")
	public ModelAndView foodPage() {		
		return new ModelAndView("food-form", "food", new Food());
	}
	
	@RequestMapping(value="/food-result")
	public ModelAndView processFuits(@ModelAttribute Food food) {
		ModelAndView modelAndView = new ModelAndView("food-result");
		modelAndView.addObject("food", food);
		return modelAndView;
	}
	
}

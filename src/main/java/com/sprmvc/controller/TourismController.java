package com.sprmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Tourism;

@Controller
public class TourismController {

	@RequestMapping(value="/tourism-page")
	private ModelAndView tourismPage() {
		ModelAndView mav = new ModelAndView("tourism-form");
		
		Map<String, String> countries = new HashMap<String, String>();
		countries.put("UKR", "Ukraine");
		countries.put("ENG", "England");
		countries.put("USA", "United States");
		
		mav.addObject("countriesMap", countries);
		mav.addObject("tourism", new Tourism());
		
		return mav;
	}
	
	@RequestMapping(value="/tourism-result")
	private ModelAndView processTourism(@ModelAttribute Tourism tourism) {
		ModelAndView mav = new ModelAndView("tourism-result");
		mav.addObject("tourism", tourism);		
		return mav;
	}
	
}

package com.sprmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Smartphone;

@Controller
public class SmartphoneController {
	
	@RequestMapping(value="/phone-page")
	private ModelAndView selectTag() {
		ModelAndView mav = new ModelAndView("phone-form");
		
		Map<String, String> phones = new HashMap<String, String>();
		phones.put("samsung", "SAMSUNG");
		phones.put("nokia", "NOKIA");
		phones.put("iphone", "IPHONE");
		
		mav.addObject("phonesMap", phones);
		mav.addObject("smartphone", new Smartphone());
		
		return mav;
	}
	
	@RequestMapping(value="/phone-option-page")
	private ModelAndView optionTag() {		
		return new ModelAndView("phone-option-form", "smartphone", new Smartphone());
	}
	
	@RequestMapping(value="/phone-options-page")
	private ModelAndView optionsTag() {
		ModelAndView mav = new ModelAndView("phone-options-form");
		
		Map<String, String> phones = new HashMap<String, String>();
		phones.put("samsung", "SAMSUNG");
		phones.put("nokia", "NOKIA");
		phones.put("iphone", "IPHONE");
		phones.put("bberry", "BLACKBERRY");
		phones.put("htc", "HTC");
		
		mav.addObject("phonesMap", phones);
		mav.addObject("smartphone", new Smartphone());
		
		return mav;
	}
	
	@RequestMapping(value="/phone-result")
	private ModelAndView processTourism(@ModelAttribute Smartphone smartphone) {
		ModelAndView mav = new ModelAndView("phone-result");
		mav.addObject("smartphone", smartphone);		
		return mav;
	}

}

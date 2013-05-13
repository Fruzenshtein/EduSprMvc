package com.sprmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Sport;

@Controller
public class SportController {

	@RequestMapping(value="/sport-page")
	private ModelAndView footballPage() {
		ModelAndView mav = new ModelAndView("sport-form");
		
		List<String> sportList = new ArrayList<String>();
		sportList.add("Judo");
		sportList.add("Basketball");
		sportList.add("Ping-Pong");
		
		mav.addObject("sportList", sportList);
		mav.addObject("sport", new Sport());
		
		return mav;
	}
	
	@RequestMapping(value="/sport-result")
	private ModelAndView processTeams(@ModelAttribute Sport sport) {
		ModelAndView mav = new ModelAndView("sport-result");
		mav.addObject("sport", sport);
		return mav;
	}
	
}

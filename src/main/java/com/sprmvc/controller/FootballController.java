package com.sprmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.FootballTeams;

@Controller
public class FootballController {
	
	@RequestMapping(value="/football-page")
	private ModelAndView footballPage() {
		ModelAndView mav = new ModelAndView("football-form");
		
		List<String> teams = new ArrayList<String>();
		teams.add("Bavaria Munich");
		teams.add("Borussia Dortmund");
		teams.add("Real Madrid");
		teams.add("Barcelona");
		
		mav.addObject("teamsList", teams);
		mav.addObject("footballTeams", new FootballTeams());
		
		return mav;
	}
	
	@RequestMapping(value="/football-result")
	private ModelAndView processTeams(@ModelAttribute FootballTeams footballTeams) {
		ModelAndView mav = new ModelAndView("football-result");
		mav.addObject("footballTeams", footballTeams);		
		return mav;
	}

}

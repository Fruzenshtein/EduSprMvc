package com.sprmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.JobOffer;

@Controller
public class JobController {
	
	@RequestMapping(value="/job-page")
	public ModelAndView jobOfferPage() {		
		return new ModelAndView("job-form", "job", new JobOffer());
	}
	
	@RequestMapping(value="/job-result")
	public ModelAndView processJob(@ModelAttribute JobOffer jobOffer) {
		ModelAndView modelAndView = new ModelAndView("job-result");
		modelAndView.addObject("job", jobOffer);
		return modelAndView;
	}

}

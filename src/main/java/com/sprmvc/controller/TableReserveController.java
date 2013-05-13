package com.sprmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.TableReserve;

@Controller
public class TableReserveController {
	
	@RequestMapping(value="/table-reserve-page")
	public ModelAndView tableReservePage() {
		return new ModelAndView("table-reserve-form", "tableReserve", new TableReserve());		
	}
	
	@RequestMapping(value="/table-reserve-result")
	public ModelAndView processTableReserve(@ModelAttribute TableReserve tableReserve) {
		ModelAndView mav = new ModelAndView("table-reserve-result");
		mav.addObject("tableReserve", tableReserve);
		return mav;
	}
	
}

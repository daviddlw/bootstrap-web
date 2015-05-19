package com.david.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeController implements Controller
{
	private Logger logger = Logger.getLogger(HomeController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		logger.info("execute HomeController start...");
		ModelAndView mav = new ModelAndView("home");
		logger.info("execute HomeController end...");
		return mav;
	}

}

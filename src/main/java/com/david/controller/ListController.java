package com.david.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller
{
	private Logger logger = Logger.getLogger(ListController.class);
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		logger.info("execute ListController start...");
		ModelAndView mav = new ModelAndView("list");
		logger.info("execute ListController end...");
		return mav;
	}

}

package com.huang.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyControl implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse) throws Exception {
		System.out.println("¥Ú”°");
		ModelAndView model=new ModelAndView();
		model.addObject("message","hello jsp");
		model.setViewName("hello");
		return model;
		
	}


}

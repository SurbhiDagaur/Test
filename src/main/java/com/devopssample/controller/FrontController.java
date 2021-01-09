package com.devopssample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class FrontController{
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getHomeView(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping(value = "about", method = RequestMethod.GET)
	public ModelAndView getAbout(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("about");
		return model;
	}

	@RequestMapping(value = "blogs", method = RequestMethod.GET)
	public ModelAndView getBlogs(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("blog");
		return model;
	}

	@RequestMapping(value = "contact", method = RequestMethod.GET)
	public ModelAndView getContactUs(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("contact");
		return model;
	}
	
	@RequestMapping(value = "process", method = RequestMethod.GET)
	public ModelAndView getProcess(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("process");
		return model;
	}
	@RequestMapping(value = "stats", method = RequestMethod.GET)
	public ModelAndView getStats(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("stats");
		return model;
	}
	@RequestMapping(value = "services", method = RequestMethod.GET)
	public ModelAndView getServices(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("services");
		return model;
	}
	@RequestMapping(value = "team", method = RequestMethod.GET)
	public ModelAndView getTeam(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("team");
		return model;
	}
	@RequestMapping(value = "single", method = RequestMethod.GET)
	public ModelAndView getSingle(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("single");
		return model;
	}
}

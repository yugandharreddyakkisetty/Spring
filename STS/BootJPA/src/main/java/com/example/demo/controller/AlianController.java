package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlianRepo;
import com.example.demo.model.*;
@Controller
public class AlianController {
	@Autowired
	AlianRepo repo;
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
		
		
	}
	
	@RequestMapping("/addAlian") 
	public String addAlian(Alian alian) {
		repo.save(alian);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getAlian")
	public ModelAndView getAlian(int aid)
	{
		ModelAndView mv = new ModelAndView("showAlian.jsp");
		Alian alian = repo.findById(aid).orElse(new Alian());
		mv.addObject(alian);
		return mv;
	}
	
	@RequestMapping("/getAllAlians")
	public ModelAndView getAllAlians() {
		ModelAndView mv = new ModelAndView("getAllAlians.jsp");
		List<Alian> alians = repo.findAll();
		mv.addObject(alians);
		return mv;
	
	}
	
	/*
	 *  This is for crud
	@RequestMapping("/alians")
	@ResponseBody
	public String showAllAlians() {
		return repo.findAll().toString();
	}
	
	@RequestMapping("/alian/{aid}")
	@ResponseBody
	public String getAlianById(@PathVariable int aid) {
		return repo.findById(aid).toString();
		
	} */
	
	@RequestMapping("/alians")
	@ResponseBody
	public List<Alian> showAllAlians() {
		return repo.findAll();
	}
	
	@RequestMapping(path="/alian/{aid}", produces= {"application/xml"})
	@ResponseBody
	public Optional<Alian> getAlianById(@PathVariable int aid) {
		return repo.findById(aid);
		
	}
	

}

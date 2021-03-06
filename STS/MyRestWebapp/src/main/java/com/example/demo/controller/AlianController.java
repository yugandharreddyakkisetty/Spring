package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlianRepo;
import com.example.demo.model.*;
import java.util.*;
@RestController
public class AlianController {
	@Autowired
	AlianRepo repo;
	@RequestMapping("/")
	public List<Alian> getAllAlians(){
		return repo.findAll();
		
	}
	// Get --> read from server / produced by server 
	// Post --> write to server / Consumer by server
	// Put --> create or update
	// Delete --> delete the object from server
	@GetMapping("/alians")
	public List<Alian> listAlians(){
		return repo.findAll();
	}
	@PostMapping(path="/alian",consumes="application/json")
	public Alian createAlian(@RequestBody Alian alian)
	{
		repo.save(alian);
		return alian;
		
	}
	
	@RequestMapping("/alian/{aid}")
	public Optional<Alian> getAlian(@PathVariable int aid) {
		
		return repo.findById(aid);
		
	}
	
	@DeleteMapping("/alian/{aid}")
	public String deleteAlian(@PathVariable int aid) {
		Alian a = repo.getById(aid);
		repo.deleteById(aid);
		return "delete";
		
	}
	
	@PutMapping("/alian")
	public Alian saveOrUpdateAlian(@RequestBody Alian alian) {
		
		repo.save(alian);
		return alian;
		
	}

}

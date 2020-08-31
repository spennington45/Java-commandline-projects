package com.techelevator.puppyApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.puppyApi.data.PuppyDAO;
import com.techelevator.puppyApi.model.Puppy;

@RestController
public class PuppyController {

	@Autowired
	PuppyDAO dao;
	
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		return "This is a test";
	}
	
	@RequestMapping(path = "/puppies", method = RequestMethod.GET)
	public List <Puppy> get() {
		List <Puppy> puppyList = dao.getPuppies();
		return puppyList;
	}
	
	@RequestMapping(path = "/puppies/{id}", method = RequestMethod.GET)
	private Puppy getById(@PathVariable int id) {
		Puppy puppy = dao.getPuppy(id);
		return puppy;
	}
	
	@RequestMapping(path = "/puppies/{id}", method = RequestMethod.DELETE)
	public void adopt(@PathVariable int id) {
		dao.removePuppy(id);
	}
	
	@RequestMapping(path = "/puppies", method = RequestMethod.POST)
	public String addPuppy(@RequestBody Puppy puppy) {
		dao.savePuppy(puppy);
		return "Puppy added";
	}
	
}

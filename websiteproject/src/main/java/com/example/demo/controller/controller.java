package com.example.demo.controller;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.game;
import com.example.demo.models.user;
import com.example.demo.service.gamesservice;
import com.example.demo.service.userService;


@RestController
public class controller {
	@Autowired
	userService uDao;
	@Autowired
	gamesservice games;
	
	//@RequestMapping(value="/admin/addUser",method = RequestMethod.POST)
	//@PostMapping(path="/admin/addUser",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	//@RequestMapping(value = "/admin/addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
	  //      produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(
			  value = "/admin/addUser", consumes = "application/json", produces = "application/json")
	public user  addUser(@RequestBody user usr)
	{
		//ResponseEntity<String>
		user n = new  user();
		System.out.println(usr);
		n.setEmail(usr.getEmail());
		n.setFname(usr.getFname());
		n.setLname(usr.getLname());
		n.setPhone(usr.getPhone());
		n.setPassword(usr.getPassword());
		 uDao.addUser(n);
		// HttpHeaders httpHeaders = new HttpHeaders();

	    //  return new ResponseEntity<>("{}", httpHeaders, HttpStatus.CREATED);
		 return n;
		 }
	@GetMapping("/admin/{email}/{password}")
	public user signin (@PathVariable (name="email") String email, @PathVariable String password) {
		return uDao.signin(email, password);
		
	}
	
	@GetMapping("/admin/getAll")
	public Collection<user>getAllUsers()
	{
		return uDao.getAllUser();
	}
	
	@RequestMapping("/admin/testMethods/hi")
	@ResponseBody
	public String printHi()
	{
		return "hi";
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@PostMapping(
			  value = "/admin/addgame", consumes = "application/json", produces = "application/json")
	public game addUser(@RequestBody game usr)
	{
		//ResponseEntity<String>
		game n = new game();
		System.out.println(usr);
		n.setDescription(usr.getDescription());
		n.setAdislike(usr.getAdislike());
		n.setDownload(usr.getDownload());
		n.setName(usr.getName());
		n.setAlike(usr.getAlike());
		n.setPicture(usr.getPicture());
		games.addUser(n);
		// HttpHeaders httpHeaders = new HttpHeaders();

	    //  return new ResponseEntity<>("{}", httpHeaders, HttpStatus.CREATED);
		 return n; 
		 }
	@RequestMapping("/admin/allgames")
	@ResponseBody
	public ArrayList<game> get()
	{
		return games.getAllUser();
	}
	

}
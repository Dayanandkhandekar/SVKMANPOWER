package com.management.svk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.svk.model.User;
import com.management.svk.service.IUserService;

@CrossOrigin(origins = "*", maxAge = 3600)
//@CrossOrigin(origins = "http://localhost:7070")
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/all")
	public List<User> allAccess() {
		
		List<User> allUser = userService.getAllUser();
		return allUser;
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public List<User> userAccess() {
		
		List<User> allUser = userService.getAllUser();
		return allUser;
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	
	@GetMapping("/hello")
//	@PreAuthorize("hasRole('ADMIN')")
	public String hello() {
		return "Helooooooo";
	}
}

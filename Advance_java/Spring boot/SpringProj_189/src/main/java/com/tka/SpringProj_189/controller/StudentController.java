package com.tka.SpringProj_189.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping("/first")
	public String welcomeMsg() {
		return "Welcome to my first api";
	}
	@GetMapping("/getNames")
	public ArrayList<String> getNmaes(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Hardik");
		names.add("Sanket");
		names.add("Vedant");
		names.add("Anurag");
		return names;
	}
}

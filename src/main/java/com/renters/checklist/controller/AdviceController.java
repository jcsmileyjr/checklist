package com.renters.checklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renters.checklist.data.Advice;
import com.renters.checklist.service.AdviceService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdviceController {
	@Autowired
	AdviceService adviceService;
	
	@GetMapping("/advice")
	public String TestAdviceMessage () {
		return "Hello World - Advice Controller";
	}
	
	@GetMapping("/getAdvice")
	public Iterable<Advice> getAdvice (){
		return adviceService.getAllAdvice();
	}
	
	@PutMapping("/updateLikes")
	public Advice updatelikes (@RequestBody Advice advice) {
		System.out.println("update likes: " + advice.getLikes());
		return adviceService.updateLikes(advice, advice.getId());
	}
	
	@PostMapping("/createAdvice")
	public Iterable<Advice> createAdvice (@RequestBody Advice advice) {
		System.out.println("create new advice" + advice.getAdvice());
		adviceService.createAdvice(advice);
		return adviceService.getAllAdvice();
	}

}

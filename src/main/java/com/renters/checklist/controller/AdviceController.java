package com.renters.checklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renters.checklist.data.Advice;
import com.renters.checklist.service.AdviceService;

@RestController
public class AdviceController {
	@Autowired
	AdviceService adviceService;
	
	@GetMapping("/advice")
	public String TestAdviceMessage() {
		return "Hello World - Advice Controller";
	}
	
	@GetMapping("/getAdvice")
	public Iterable<Advice> getAdvice(){
		return adviceService.getAllAdvice();
	}

}

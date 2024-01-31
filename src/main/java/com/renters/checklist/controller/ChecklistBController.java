package com.renters.checklist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renters.checklist.data.ChecklistB;
import com.renters.checklist.service.ChecklistBService;

@RestController
public class ChecklistBController {

	@Autowired
	ChecklistBService checklistBService;
	
	@GetMapping("/checklistB")
	public String testChecklistBMessage() {
		return "Hello world - ChecklistB message";
	}
	
	@GetMapping("/getChecklistBData")
	public Iterable<ChecklistB> getChecklistData(){
		return checklistBService.getAllChecklistBData();
	}
}

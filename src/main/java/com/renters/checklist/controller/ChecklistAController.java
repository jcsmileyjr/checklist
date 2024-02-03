package com.renters.checklist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renters.checklist.data.ChecklistA;
import com.renters.checklist.service.ChecklistAService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChecklistAController {
	
	@Autowired
	ChecklistAService checklistAService;
	
	@GetMapping("/checklistA")
	public String testChecklistAMessage() {
		return "Hello World - ChecklistA Message ";
	}
	
	@GetMapping("/getChecklistAData")
	public Iterable<ChecklistA> getChecklistData(){
		return checklistAService.getAllChecklistData();
	}
	
	@PostMapping("/createCheckListItemA")
	public Iterable<ChecklistA> createCheckItemA (@RequestBody ChecklistA checkItem) {
		checklistAService.createChecklistAItem(checkItem);
		return checklistAService.getAllChecklistData();
	}
}

package com.renters.checklist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renters.checklist.data.ChecklistB;
import com.renters.checklist.service.ChecklistBService;

@CrossOrigin(origins = "http://localhost:3000")
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
	
	@PostMapping("/createCheckListItemB")
	public Iterable<ChecklistB> createCheckItemB (@RequestBody ChecklistB newItem) {
		checklistBService.createChecklistBItem(newItem);
		return checklistBService.getAllChecklistBData();
	}
}

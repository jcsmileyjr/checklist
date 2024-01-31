package com.renters.checklist.service;

import org.springframework.stereotype.Service;

import com.renters.checklist.data.ChecklistA;
import com.renters.checklist.data.ChecklistARepository;

@Service
public class ChecklistAService {
	private final ChecklistARepository checklistARespository;

	public ChecklistAService(ChecklistARepository checklistARespository) {
		this.checklistARespository = checklistARespository;
	}
	
	public Iterable<ChecklistA> getAllChecklistData(){
		return checklistARespository.findAll();
	}
	
}

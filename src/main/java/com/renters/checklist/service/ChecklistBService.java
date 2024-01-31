package com.renters.checklist.service;

import org.springframework.stereotype.Service;

import com.renters.checklist.data.ChecklistB;
import com.renters.checklist.data.ChecklistBRepository;

@Service
public class ChecklistBService {
	private final ChecklistBRepository checklistBRepository;

	public ChecklistBService(ChecklistBRepository checklistBRepository) {
		this.checklistBRepository = checklistBRepository;
	}
	
	public Iterable<ChecklistB> getAllChecklistBData(){
		return checklistBRepository.findAll();
	}
	
}

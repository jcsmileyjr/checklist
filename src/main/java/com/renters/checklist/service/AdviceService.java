package com.renters.checklist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renters.checklist.data.Advice;
import com.renters.checklist.data.AdviceRepository;

@Service
public class AdviceService {
	private final AdviceRepository adviceRepository;

	public AdviceService(AdviceRepository adviceRepository) {
		this.adviceRepository = adviceRepository;
	}
	
	public Iterable<Advice> getAllAdvice() {
		return adviceRepository.findAll();
	}

}

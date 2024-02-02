package com.renters.checklist.service;

import java.util.List;
import java.util.Optional;

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
	
	public Advice updateLikes (Advice currentAdvice, Long id) {
		Advice newAdvice = adviceRepository.findById(id).get();
		newAdvice.setLikes(currentAdvice.getLikes() + 1);
		adviceRepository.save(newAdvice);
		return newAdvice;
	}
	
	public Iterable<Advice> createAdvice (Advice currentAdvice) {
		Advice newAdvice = adviceRepository.save( new Advice(currentAdvice.getAdvice(), currentAdvice.getLikes()));
		System.out.println("advice: " + newAdvice.getId());
		return adviceRepository.findAll();
	}

}

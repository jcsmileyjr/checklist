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
	
	public void updateLikes (Advice currentAdvice, Long id) {
//		adviceRepository.deleteById(id);
//		Advice newAdvice = new Advice();
//		newAdvice.setAdvice(currentAdvice.getAdvice());
//		newAdvice.setLikes(currentAdvice.getLikes() + 1);
//		adviceRepository.save(newAdvice);
		Advice newAdvice = adviceRepository.findById(id).get();
		newAdvice.setLikes(currentAdvice.getLikes() + 1);
		adviceRepository.save(newAdvice);
	}

}

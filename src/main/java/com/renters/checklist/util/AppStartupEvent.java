package com.renters.checklist.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.renters.checklist.data.Advice;
import com.renters.checklist.data.AdviceRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
// The goal is to wait until Spring is done before querying the database.

	private final AdviceRepository adviceRepository;
	
	public AppStartupEvent(AdviceRepository adviceRepository) {
		this.adviceRepository = adviceRepository;
	}
	
	// When the application has loaded, will use the CrudRepository to grab
	// all the data from the ADVICE database linked to the Advice Entity class and display them.  
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		Iterable<Advice> advices = this.adviceRepository.findAll();
		advices.forEach(System.out::println);
	}
}

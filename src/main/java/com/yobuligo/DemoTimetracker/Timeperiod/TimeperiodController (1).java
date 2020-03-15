package com.yobuligo.DemoTimetracker.Timeperiod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeperiodController {

	@Autowired
	ITimeperiodRepository timeperiodRepository;

	@GetMapping
	public Iterable<Timeperiod> getTimeperiods() {
		return timeperiodRepository.findAll();
	}

}

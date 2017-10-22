package edu.learn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.rest.model.Dev;
import edu.learn.rest.model.Tax;
import edu.learn.rest.service.GradeService;

@RestController
public class DevController {
	
	@Autowired
	private GradeService gradeService;
	
	@RequestMapping("/developer")
	public List<Dev> findAll() {		
			
		return  gradeService.findAll();

	}
	
	
	@RequestMapping("/simpletax/{hoursWorked}/{hourlyWage}/{status}")
	public Tax SimpleTaxes (@PathVariable float hoursWorked,@PathVariable float hourlyWage,@PathVariable String status) {
					
			return gradeService.SimpleTaxes(hourlyWage, hourlyWage, status);	
	}
	
	
	
	
	
	
	
	
	
	
	
}
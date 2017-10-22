package edu.learn.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.learn.rest.model.Dev;
import edu.learn.rest.model.Tax;

@Service
public class GradeService {

	private static List<Dev> devlist = new ArrayList<>();

	static {

		devlist.add(new Dev("OneilBogle", "Oneil", "Bogle"));

	}

	public List<Dev> findAll() {

		return devlist;
	}

	public Tax SimpleTaxes(float hoursWorked, float hourlyWage, String status) {

		
		 float weeklySalary;
		 float estimatedYearlySalary;
		 float taxesPaid = 0;
		 float taxRate = 0;

		weeklySalary = hoursWorked * hourlyWage;

		estimatedYearlySalary = hoursWorked * 52;

		if (status == "S") {

			taxesPaid = weeklySalary * 0.3f;
			taxRate = .30f;

		} else if (status == "MFJ") {

			taxesPaid = weeklySalary * 0.32f;
			taxRate = .32f;

		} else if (status == "HH") {

			taxesPaid = weeklySalary * 0.25f;
			taxRate = .25f;

		} else if (status == "MFS") {

			taxesPaid = weeklySalary * 0.28f;
			taxRate = .28f;

		} 

		return new Tax( status,  weeklySalary,  estimatedYearlySalary,  taxesPaid,  taxRate);
		
	}

}
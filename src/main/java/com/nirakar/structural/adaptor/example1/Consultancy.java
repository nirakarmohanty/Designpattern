package com.nirakar.structural.adaptor.example1;

import java.util.List;

public class Consultancy {

	public void processSalary(List<Employee> employees) {
		employees.stream().forEach(predicate->{
			System.out.println(predicate.getId());
			System.out.println(predicate.getName());
		});
		
	}
}

package com.nirakar.structural.adaptor;

import java.util.List;

public class Consultancy {

	public void processSalary(List<Employee> employees) {
		employees.stream().forEach(predicate->{
			System.out.println(predicate.getId());
			System.out.println(predicate.getName());
		});
		
	}
}

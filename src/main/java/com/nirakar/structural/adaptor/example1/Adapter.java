package com.nirakar.structural.adaptor.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adapter {
	Consultancy con = new Consultancy();

	public void adpotAndProcess(String[][] employee) {
		List<Employee> list = new ArrayList<Employee>();
		Arrays.stream(employee).forEach(emp -> {
			Employee e = new Employee();
			e.setName(emp[0]);
			e.setId(emp[1]);
			list.add(e);
		});
		con.processSalary(list);
	}

}

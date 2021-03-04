package com.nirakar.structural.adaptor.example1;

/**
 * 
 * @author Nirakar
 *
 */
public class CompanyHR {
	Adapter adapter = new Adapter();
	public void processSalary() {
		//Process Employee Salary who are employee of some consultancy 
		// SO company send the Name , id as array
		
		String[] employee1= {"Genskey","101"};
		String[] employee2= {"Germane","102"};
		String[] employee3= {"Ganpati","103"};
		String[] employee4= {"Gergo","104"};
		
		String[][] company= {employee1,employee2,employee3,employee4};
		adapter.adpotAndProcess(company);
	}

}

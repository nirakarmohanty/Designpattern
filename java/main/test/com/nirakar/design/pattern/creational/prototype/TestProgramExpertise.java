package com.nirakar.design.pattern.creational.prototype;

import java.util.Arrays;

import com.nirakar.creational.prototype.ProgramExpertise;

public class TestProgramExpertise {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		ProgramExpertise programExpertise=ProgramExpertise.getInstance();
		programExpertise.setProgrammingList(Arrays.asList("Python","Java","Hadoop"));
		System.out.println(programExpertise);
		System.out.println(programExpertise.toString());
		
		ProgramExpertise programExpertise2=programExpertise.clone();
		System.out.println(programExpertise2);
		System.out.println(programExpertise2.toString());
	}

}

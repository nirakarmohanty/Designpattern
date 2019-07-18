package com.nirakar.design.pattern.creational.prototype;

import java.util.List;

public class ProgramExpertise implements Cloneable{

	private List<String> programmingList;

	public List<String> getProgrammingList() {
		return programmingList;
	}

	public void setProgrammingList(List<String> programmingList) {
		this.programmingList = programmingList;
	}

	@Override
	public String toString() {
		return "ProgramExpertise [programmingList=" + programmingList + "]";
	}
	
	private ProgramExpertise() {}
	public static ProgramExpertise getInstance() {
		return new ProgramExpertise();
	}
	
	public ProgramExpertise clone() throws CloneNotSupportedException{
		return (ProgramExpertise) super.clone();
	}
}

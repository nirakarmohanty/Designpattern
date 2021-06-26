package com.nirakar.creation.abstractfactory;

public class PolicyBazarMainApp {

	public static void main(String[] args) {
		
		//Abstract factory
		PolicyBazar abstrctFactory = new PolicyBazarFactoryCreator();
		
		//Factory 1
		Loan loan = abstrctFactory.getLoan("personal");		
		loan.getLoan();
		
		//Factory 2
		Bank bank = abstrctFactory.getBank("sbi");
		bank.getBank();
	}
}

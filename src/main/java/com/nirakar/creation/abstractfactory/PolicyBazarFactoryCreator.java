package com.nirakar.creation.abstractfactory;

/**
 * Abstract factory Impl class
 * @author Nirakar
 *
 */
public class PolicyBazarFactoryCreator implements PolicyBazar {

	@Override
	public Loan getLoan(String loanRelatedInfo) {
		return LoanFacotry.getInstance(loanRelatedInfo);
	}

	@Override
	public Bank getBank(String bankRelatedInfo) {		
		return BankFactory.getInstance(bankRelatedInfo);
	}

}

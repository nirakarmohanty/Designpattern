package com.nirakar.creation.abstractfactory;

public interface PolicyBazar {

	public abstract Loan getLoan(String loanRelatedInfo);

	public abstract Bank getBank(String bankRelatedInfo);

	//Insurance Factory method
}

package com.sac.exceptions;

public class SBIBankATM implements BankATM {
	private double balance;
	@Override
	public void deposite(double amt) throws InvalidAmountException {
		if(amt<=0) {
			throw new InvalidAmountException(amt+" is invalid amount");
		}
		balance=balance+amt;
		
	}
	@Override
	public double withdraw(double amt) throws InvalidAmountException, InSufficientFundsException {
		if(amt>balance) {
			throw new InSufficientFundsException("InSufficient Funds");
		}
		if(amt<=0) {
			throw new InvalidAmountException(amt+" is invalid amount");
		}
		balance=balance-amt;
		return amt;
	}
	@Override
	public void balanceEnquiry() {
		System.out.println("Current Balance:"+balance);
		
	}

}

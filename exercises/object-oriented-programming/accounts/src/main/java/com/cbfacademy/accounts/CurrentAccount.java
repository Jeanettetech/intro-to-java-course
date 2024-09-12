package com.cbfacademy.accounts;

public class CurrentAccount extends Account {

	private double overdraftLimit;

	public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		if (overdraftLimit >= 0) {
			this.overdraftLimit = overdraftLimit;
		}

	}

	@Override
	public double withdraw(double requested) {
		if ((this.balance + this.overdraftLimit) < requested) {
			return 0;
		} else {
			balance -= requested;
			return requested;
		}
	}

}

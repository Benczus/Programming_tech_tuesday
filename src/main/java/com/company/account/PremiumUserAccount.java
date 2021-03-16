package com.company.account;

public class PremiumUserAccount extends UserAccount{
    public PremiumUserAccount(double balance, String userName, String password) {
        super(balance, userName, password);
    }

    @Override
    public UserAccount createNewAccount(String userName, String password) {
        return new PremiumUserAccount(0, userName, password);
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }



}

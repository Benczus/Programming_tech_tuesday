package com.company.account;

public class BasicUserAccount extends UserAccount{
    public BasicUserAccount(double balance, String userName, String password) {
        super(balance, userName, password);
    }

    @Override
    public UserAccount createNewAccount(String userName, String password) {
        return new BasicUserAccount(0, userName, password);
    }



    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }
}

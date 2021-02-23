package com.company;

public class BasicUserAccount extends UserAccount{
    protected BasicUserAccount(double balance, String userName, String password) {
        super(balance, userName, password);
    }

    @Override
    protected UserAccount createNewAccount(String userName, String password) {
        return new BasicUserAccount(0, userName, password);
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}

package com.company.account;

import com.company.account.Account;

public class ManagementAccount implements Account {

    String username;
    String password;

    public ManagementAccount(String username, String password) {
        try {
            this.register(username,password);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void register(String userName, String password) throws IllegalAccessException {
        this.username=userName;
        this.password=password;
    }

    @Override
    public void login(String userName, String password) {

    }

    @Override
    public String getName() {
        return this.username;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void setBalance(double amount) {

    }


    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }
}

package com.company.account;

public interface Account {


    public void register(String userName, String password) throws IllegalAccessException;
    public void login(String userName, String password);
    public String getName();
    public double getBalance();
    public void setBalance(double amount);
    public void withdraw(double amount);
    public void deposit(double amount);
}

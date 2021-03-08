package com.company;

public interface Account {


    public void register(String userName, String password) throws IllegalAccessException;
    public void login(String userName, String password);
    public String getName();

}

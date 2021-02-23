package com.company;

public abstract class UserAccount implements Account{

    private double balance;
    private String userName;
    private String password;

    protected UserAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password= password;
    }

    @Override
    public void register(String userName, String password) throws IllegalAccessException{
        if(isUsernameAndPasswordValid(userName,password)){
            UserAccount userAccount= createNewAccount(userName, password);
        }
    }

    protected abstract UserAccount createNewAccount(String userName, String password);

    private boolean isUsernameAndPasswordValid(String userName, String password) {
        return userName != null && password != null;
    }


    @Override
    public void login(String userName, String password){
    //TODO
    }


    public abstract void withdraw(int amount);
    public abstract void deposit(int amount);
}

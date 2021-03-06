package com.company.account;

public abstract class UserAccount implements Account{

    private double balance;
    private String userName;
    private String password;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

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


}

package com.company;

import java.util.List;
import java.util.UUID;

public class DigitalBank implements Bank {

    private UUID ID;
    private String name;
    String ownerName;
    AccountDB accountDB;

    public DigitalBank(UUID ID, String name, String ownerName, AccountDB accountDB) {
        this.ID = ID;
        this.name = name;
        this.ownerName = ownerName;
        this.accountDB = accountDB;
    }


    public DigitalBank(UUID ID, String name, String ownerName) {
        this.ID = ID;
        this.name = name;
        this.ownerName = ownerName;
        this.accountDB = new AccountMemoryDB();
    }

    @Override
    public boolean authenticateUser(Account user, String authkey) {
        if(user==null || authkey==null){
            return false;
        }
        return true;
    }


    @Override
    public void addUserAccount(String userName, String password) {
        accountDB.addAccount(new BasicUserAccount(0, userName, password));
    }

    public void processAccountDetails(List<Account> list) {

    }


    @Override
    public Account getUser(UUID i) {
        return null;
    }

    public Account getUser(String name){
        return accountDB.getAccount(name);
    }
}

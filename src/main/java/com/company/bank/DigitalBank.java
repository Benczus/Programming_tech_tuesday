package com.company.bank;

import com.company.account.Account;
import com.company.account.BasicUserAccount;
import com.company.accountdb.AccountDB;
import com.company.accountdb.AccountMemoryDB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DigitalBank implements Bank  {

    private UUID ID;
    private String name;
    String ownerName;
    AccountDB accountDB;
    Bank bank;


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

    public List<String> processAccountDetails() {
        List<String> strings = new ArrayList<>();
        for(Account account: this.accountDB.getAccounts())
            strings.add(account.getName());
        return strings;
    }

    public void sendCurrency(String user1, String pass1,String user2, String pass2, double amount){
        Account userAccount =this.accountDB.getAccount(user1);
        userAccount.login(userAccount.getName(), pass1);
        Account userAccount2=this.accountDB.getAccount(user2);
        userAccount2.login(userAccount2.getName(), pass2);
        exchangeCurrency(userAccount, userAccount2, amount);


    }

    public void exchangeCurrency(Account account, Account account2, Double amount){
        account.withdraw(amount);
        account2.deposit(amount);
    }




    @Override
    public Account getUser(UUID i) {
        return null;
    }

    public Account getUser(String name){
        return accountDB.getAccount(name);
    }
}

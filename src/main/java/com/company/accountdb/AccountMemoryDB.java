package com.company.accountdb;

import com.company.account.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountMemoryDB implements AccountDB {

    List<Account> accounts;

    public AccountMemoryDB(List<Account> accounts) {
        this.accounts = accounts;
    }

    public AccountMemoryDB() {
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void setAccount(UUID id, Account account) {

    }

    @Override
    public Account getAccount(UUID id) {
        return null;
    }

    @Override
    public Account getAccount(String name) {
        for (Account acc: accounts){
            System.out.println(acc);
            if(acc.getName().equals(name)){
                return acc;
            }
        }
        return null;
    }

    @Override
    public void setAccounts() {

    }

    @Override
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }
}

package com.company.bank;

import com.company.account.Account;

import java.util.UUID;

public interface Bank {

    public boolean authenticateUser(Account user, String authkey);
    public void addUserAccount(String userName, String password);

    Account getUser(UUID i);
    Account getUser(String name);
}

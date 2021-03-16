package com.company.accountdb;

import com.company.account.Account;

import java.util.List;
import java.util.UUID;

public interface AccountDB {

    public List<Account> getAccounts();

    public void setAccount(UUID id, Account account);

    public Account getAccount(UUID id);

    public Account getAccount(String name);

    public void setAccounts();

    public void addAccount(Account account);

    public void removeAccount(Account account);

}

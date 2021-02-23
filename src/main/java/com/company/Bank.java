package com.company;

import java.util.UUID;

public interface Bank {

    public boolean authenticateUser(Account user, String authkey);
    public void addUserAccount(String userName, UUID userID);

    Account getUser(UUID i);
}

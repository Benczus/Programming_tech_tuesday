package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class DigitalBank implements Bank{

    private UUID ID;
    private String name;
    String ownerName;
    List userArray;

    public DigitalBank(UUID ID, String name, String ownerName) {
        this.ID = ID;
        this.name = name;
        this.ownerName = ownerName;
        this.userArray= new ArrayList<Account>;
    }

    @Override
    public boolean authenticateUser(Account user, String authkey) {
        return false;
    }

    @Override
    public void addUserAccount(String userName, UUID userID) {

    }

    @Override
    public Account getUser(UUID i) {
        return null;
    }
}

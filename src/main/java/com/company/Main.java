package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Bank bank= new DigitalBank(UUID.randomUUID(), "Valami", "Tulajdonos");
        bank.addUserAccount("Kis József", "123");


    }
}

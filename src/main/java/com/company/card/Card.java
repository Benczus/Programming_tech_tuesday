package com.company.card;

import java.time.LocalDate;

public interface Card {

    void deposit(double amount);
    void withdraw(double amount);
    LocalDate getExpirationDate();
    boolean getAvailability();
}

package com.company.card;

import com.company.account.Account;

import java.time.LocalDate;

public class BasicCard implements Card{
    Account account;

    public BasicCard(Account account, LocalDate expDate, boolean availability) {
        this.account = account;
        this.expDate = expDate;
        this.availability = availability;
    }

    LocalDate expDate;
    boolean availability;

    @Override
    public void deposit(double amount) {
        this.account.deposit(amount);
    }

    @Override
    public void withdraw(double amount ) {
        this.account.withdraw(amount);
    }

    @Override
    public LocalDate getExpirationDate() {
        return this.expDate;
    }

    @Override
    public boolean getAvailability() {
        return this.availability;
    }
}

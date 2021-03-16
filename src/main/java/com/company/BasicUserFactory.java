package com.company;

import com.company.account.Account;
import com.company.account.BasicUserAccount;
import com.company.card.BasicCard;
import com.company.card.Card;

import java.time.LocalDate;

public class BasicUserFactory implements AbstractUserFactory{




    @Override
    public Account createAccount(double balance, String userName, String password) {
        return new BasicUserAccount(balance, userName, password);
    }

    @Override
    public Card createCard(Account account, LocalDate expDate, boolean availability) {
        return new BasicCard(account, expDate, availability);
    }
}

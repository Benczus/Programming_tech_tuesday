package com.company;

import com.company.account.Account;
import com.company.account.PremiumUserAccount;
import com.company.card.Card;
import com.company.card.PremiumCard;

import java.time.LocalDate;

public class PremiumUserFactory implements AbstractUserFactory {
    @Override
    public Account createAccount(double balance, String userName, String password) {
        return new PremiumUserAccount(balance, userName, password);
    }

    @Override
    public Card createCard(Account account, LocalDate expDate, boolean availability) {
        return new PremiumCard(account, expDate, availability);
    }
}

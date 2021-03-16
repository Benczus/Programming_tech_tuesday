package com.company;

import com.company.account.Account;
import com.company.card.Card;

import java.time.LocalDate;

public interface AbstractUserFactory {

    Account createAccount(double balance, String userName, String password);
    Card createCard(Account account, LocalDate expDate, boolean availability);

}

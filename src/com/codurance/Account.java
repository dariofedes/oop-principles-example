package com.codurance;

import java.util.List;

public class Account {

    List<Deposit> deposits;
    List<Withdraw> withdraws;

    public void deposit(int amount) {
        String date = getDate();

        Deposit deposit = new Deposit(amount, date);

        deposits.add(deposit);
    }

    public void withdraw(int amount) {
        String date = getDate();

        Withdraw withdraw = new Withdraw(amount, date);

        withdraws.add(withdraw);
    }

    public void printStatement(int amount) {
    }

    private String getDate() {
        return "fake date";
    }
}

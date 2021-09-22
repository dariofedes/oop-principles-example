package com.codurance;

import java.util.List;

public class Account {

    private List<Deposit> deposits;
    private List<Withdraw> withdraws;

    public void deposit(int amount) {
        Deposit deposit = new Deposit(amount);

        deposits.add(deposit);
    }

    public void withdraw(int amount) {
        Withdraw withdraw = new Withdraw(amount);

        withdraws.add(withdraw);
    }

    public void printStatement(int amount) {
    }
}

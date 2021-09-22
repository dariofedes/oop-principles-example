package com.codurance;

public class Deposit {
    private int amount;
    private String date;

    Deposit(int amount) {
        this.amount = amount;
        this.date = getDate();
    }

    private String getDate() {
        return "fake date";
    }
}

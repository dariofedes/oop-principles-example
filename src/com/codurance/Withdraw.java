package com.codurance;

public class Withdraw {
    private int amount;
    private String date;

    Withdraw(int amount) {
        this.amount = amount;
        this.date = getDate();
    }

    private String getDate() {
        return "fake date";
    }
}

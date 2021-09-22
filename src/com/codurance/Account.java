package com.codurance;

import java.util.List;

public class Account {

    List<String> operationsDate;
    List<Integer> operationsAmount;

    public void deposit(int amount) {
        String date = getDate();

        operationsAmount.add(amount);
        operationsDate.add(date);
    }

    public void withdraw(int amount) {
        String date = getDate();

        operationsAmount.add(amount * -1);
        operationsDate.add(date);
    }


    public void printStatement(int amount) {
    }

    private String getDate() {
        return "fake date";
    }
}

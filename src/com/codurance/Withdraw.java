package com.codurance;

public class Withdraw extends Operation {
    private final int amount;

    Withdraw(int amount) {
        super();
        this.amount = amount;
    }

    @Override
    int calculateStatement(int currentStatement) {
        return currentStatement - amount;
    }
}

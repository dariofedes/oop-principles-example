package com.codurance;

public class Deposit extends Operation{
    private final int amount;

    Deposit(int amount) {
        super();
        this.amount = amount;
    }

    @Override
    int calculateStatement(int currentStatement) {
        return currentStatement - amount;
    }
}

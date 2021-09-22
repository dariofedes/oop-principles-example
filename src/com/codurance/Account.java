package com.codurance;

import java.util.List;

public class Account {

    List<Operation> operations;

    public void deposit(int amount) {
        Deposit deposit = new Deposit(amount);

        operations.add(deposit);
    }

    public void withdraw(int amount) {
        Withdraw withdraw = new Withdraw(amount);

        operations.add(withdraw);
    }

    public void printStatement(int amount) {
        int statement = 0;

        for(Operation operation : operations) {
            statement = operation.calculateStatement(statement);
        }

        System.out.println(statement);
    }
}

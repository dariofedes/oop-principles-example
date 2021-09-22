package com.codurance;

public abstract class Operation {
    String date;

    Operation() {
        this.date = getDate();
    }

    private String getDate() {
        return "fake date";
    }

    abstract int calculateStatement(int currentStatement);
}

package com.codurance;

public abstract class Operation {
    int amount;
    String date;

    Operation(int amount) {
        this.date = getDate();
    }

    private String getDate() {
        return "fake date";
    }
}

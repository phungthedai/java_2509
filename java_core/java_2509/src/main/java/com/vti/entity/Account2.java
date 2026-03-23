package com.vti.entity;

public class Account2 {
    private String id;
    private String name;
    private int balance;

    public Account2(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        this.balance = amount;
    }

    public void debit(int amount){
        this.balance = amount;
    }

    public void tranferTo (Account2 account, int amount) {
        account.balance = amount;
    }
}

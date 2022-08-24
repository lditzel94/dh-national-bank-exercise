package org.example;

public abstract class Account {

    protected double balance;
    private Client client;

    public Account( double balance, Client client ) {
        this.balance = balance;
        this.client = client;
    }

    public abstract void extract( double amount );

    public void deposit( double amount ) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient( Client client ) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + balance +
                ", client=" + client +
                '}';
    }
}

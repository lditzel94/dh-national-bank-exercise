package org.example.core;

import org.example.exceptions.InsufficientBalanceException;

public class CurrentAccount extends Account {

    private double uncoveredAmount;

    public CurrentAccount( double balance, Client client ) {
        super( balance, client );
    }

    @Override
    public void extract( double amount ) throws InsufficientBalanceException {
        if ( amount > balance && amount > uncoveredAmount ) {
            throw new InsufficientBalanceException( "Insufficient balance and not available Uncovered Amount" );
        } else if ( amount > balance && amount < uncoveredAmount ) {
            double remainingAmount = amount - balance;
            balance = 0;
            uncoveredAmount -= remainingAmount;
        } else {
            balance -= amount;
        }
    }
}

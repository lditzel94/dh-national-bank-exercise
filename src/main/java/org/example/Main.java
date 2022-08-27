package org.example;

import org.example.core.Account;
import org.example.core.Client;
import org.example.core.SavingsAccount;
import org.example.exceptions.InsufficientBalanceException;

public class Main {
    public static void main( String[] args ) {

        Client client = new Client(10, "Ditzel", "123", "345");
        Account savingsBank = new SavingsAccount( 100000, client, 30 );

        try {
            savingsBank.extract( 100001 );
        } catch ( InsufficientBalanceException balanceException ) {
            System.out.println( balanceException.getMessage() );
        }
    }
}
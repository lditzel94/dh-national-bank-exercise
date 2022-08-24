package org.example;

public class CurrentAccount extends Account {

    public CurrentAccount( double balance, Client client ) {
        super( balance, client );
    }

    @Override
    public void extract( double amount ) {

    }
}

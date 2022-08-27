package org.example.core;

public class Client {
    private int clientNumber;
    private String lastName;
    private String DNI;
    private String CUIT;

    public Client( int clientNumber, String lastName, String DNI, String CUIT ) {
        this.clientNumber = clientNumber;
        this.lastName = lastName;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber( int clientNumber ) {
        this.clientNumber = clientNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI( String DNI ) {
        this.DNI = DNI;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT( String CUIT ) {
        this.CUIT = CUIT;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                ", lastName='" + lastName + '\'' +
                ", DNI='" + DNI + '\'' +
                ", CUIT='" + CUIT + '\'' +
                '}';
    }
}

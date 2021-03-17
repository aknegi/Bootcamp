package com.springFramework.springDAAndTransactions.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class AuthorAddress {
    private int streetNumber;
    private String location;
    private String state;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

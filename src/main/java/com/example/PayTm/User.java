package com.example.PayTm;

import java.util.UUID;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    String name;
    String emailID;
    String contactNumber;
    String userid;

    public User(String name, String emailID, String contactNumber){
        this.name=name;
        this.emailID=emailID;
        this.contactNumber=contactNumber;
    }

}

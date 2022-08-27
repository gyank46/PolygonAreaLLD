package com.example.PayTm.Models;

import java.util.Date;

public class Card {
    public String ownerName;
    public String cardNumber;
    public String CVV;


    public Card(String cardNumber, String ownerName, String CVV,float balance){
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.CVV = CVV;
    }



}

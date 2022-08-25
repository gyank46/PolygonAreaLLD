package com.example.PayTm;

import java.util.Date;

public class Card {
    String ownerName;
    String cardNumber;
    String CVV;


    public Card(String cardNumber, String ownerName, String CVV,float balance){
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.CVV = CVV;
    }



}

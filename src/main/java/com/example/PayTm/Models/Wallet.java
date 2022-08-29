package com.example.PayTm.Models;

public class Wallet extends Recipient{
//    public String walletId;
    public float amount;

    public Wallet(String walletId, float amoount){
        this.amount=amoount;
        this.id=walletId;
    }
}

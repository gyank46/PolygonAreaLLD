package com.example.PayTm.Models;

public class Wallet {
    public String walletId;
    public float amount;

    public Wallet(String walletId, float amoount){
        this.amount=amoount;
        this.walletId=walletId;
    }
}

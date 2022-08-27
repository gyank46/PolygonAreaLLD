package com.example.PayTm.Models;

import java.security.PublicKey;
import java.util.UUID;

public class BankAccount{
    public String bankName;
    public String ifscCode;
    public String bankAccount;

    public float amount;


    public BankAccount(String bankName, String ifscCode, String bankAccount, float amount){
        this.bankAccount = bankAccount;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.amount = amount;
    }

}

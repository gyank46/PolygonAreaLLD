package com.example.PayTm;

import java.security.PublicKey;
import java.util.UUID;

public class BankAccount{
    String bankName;
    String ifscCode;
    String bankAccount;

    float amount;


    public BankAccount(String bankName, String ifscCode, String bankAccount, float amount){
        this.bankAccount = bankAccount;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.amount = amount;
    }

}

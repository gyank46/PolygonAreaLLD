package com.example.PayTm;

import java.security.PublicKey;
import java.util.UUID;

public class BankAccount{
    String bankName;
    String ifscCode;
    String bankAccount;


    public BankAccount(String bankName, String ifscCode, String bankAccount){
        this.bankAccount = bankAccount;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
    }

}

package com.example.PayTm.Models;

import com.example.PayTm.ReceiverType;
import com.example.PayTm.TransactionStatus;

import java.util.Date;

public class Transaction {
    public float amount;
    public User user;
    public Date date;
    public TransactionStatus status;
    public ReceiverType receiverType;
    public String transactionId;


    public Transaction(User user,float amount, Date date, TransactionStatus status, ReceiverType receiverType) {
        this.amount = amount;
        this.user = user;
        this.date = date;
        this.status = status;
        this.receiverType = receiverType;
        this.transactionId = String.valueOf(System.currentTimeMillis());

    }
}

package com.example.PayTm;

import javax.sound.midi.Receiver;
import java.util.Date;
import java.util.Timer;
import java.util.UUID;

public class Transaction {
    float amount;
    User user;
    Date date;
    TransactionStatus status;
    ReceiverType receiverType;
    String transactionId;


    public Transaction(User user,float amount, Date date, TransactionStatus status, ReceiverType receiverType) {
        this.amount = amount;
        this.user = user;
        this.date = date;
        this.status = status;
        this.receiverType = receiverType;
        this.transactionId = String.valueOf(System.currentTimeMillis());

    }
}

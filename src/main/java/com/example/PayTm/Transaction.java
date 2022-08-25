package com.example.PayTm;

import javax.sound.midi.Receiver;
import java.util.Date;

public class Transaction {
    float amount;
    User user;
    Date date;
    TransactionStatus status;
    ReceiverType receiverType;



    public Transaction(User user,float amount, Date date, TransactionStatus status, ReceiverType receiverType) {
        this.amount = amount;
        this.user = user;
        this.date = date;
        this.status = status;
        this.receiverType = receiverType;

    }
}

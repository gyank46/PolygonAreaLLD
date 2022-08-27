package com.example.PayTm.Payment;

import com.example.PayTm.Models.Card;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.TransactionStatus;

public class MakePaymentViaCard implements MakePayment {
    private final Card card;

    public MakePaymentViaCard(Card card) {
        this.card = card;
    }

    @Override
    public void makePayment(Transaction transaction) {
        if(transaction.status != TransactionStatus.SUCCESSFUL){
            System.out.println("Paying "+ transaction.amount+" via Card Number "+this.card.cardNumber);
            transaction.status = TransactionStatus.SUCCESSFUL;
        }

    }
}

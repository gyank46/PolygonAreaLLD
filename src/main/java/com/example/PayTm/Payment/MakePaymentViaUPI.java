package com.example.PayTm.Payment;

import com.example.PayTm.Models.Transaction;
import com.example.PayTm.TransactionStatus;
import com.example.PayTm.Models.UPIId;

public class MakePaymentViaUPI implements MakePayment {

    private final UPIId upiId;

    public MakePaymentViaUPI(UPIId upiId) {
        this.upiId = upiId;
    }

    @Override
    public void makePayment(Transaction transaction) {
        if(transaction.status != TransactionStatus.SUCCESSFUL){
            System.out.println("Paying "+transaction.amount+" via UPIiD "+this.upiId.upiID);
            transaction.status = TransactionStatus.SUCCESSFUL;
        }

    }
}

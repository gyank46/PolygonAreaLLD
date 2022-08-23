package com.example.PayTm;

import com.example.Factory.Transaction;

public interface MakePayment {
    public void makePayment(User user, Transaction transaction);
}

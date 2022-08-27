package com.example.PayTm.SendMoney;

import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.User;

public interface SendMoney {

    public Transaction sendMoney(User sender, float amount);
}

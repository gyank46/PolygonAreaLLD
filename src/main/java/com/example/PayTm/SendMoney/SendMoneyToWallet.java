package com.example.PayTm.SendMoney;

import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.User;
import com.example.PayTm.Models.Wallet;
import com.example.PayTm.ReceiverType;
import com.example.PayTm.Repo;
import com.example.PayTm.TransactionStatus;

import java.util.Date;

public class SendMoneyToWallet implements SendMoney{
    private final Wallet wallet;

    @Override
    public Transaction sendMoney(User sender, float amount) {
        Transaction newtransaction = new Transaction(sender,amount,new Date(), TransactionStatus.INITIATED, ReceiverType.WALLET);
        Repo.transactionid_wallet_mapping.put(newtransaction.transactionId,this.wallet);
        return newtransaction;
    }

    public SendMoneyToWallet(Wallet wallet){
        this.wallet = wallet;
    }
}

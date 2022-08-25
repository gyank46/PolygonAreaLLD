package com.example.PayTm;

import java.util.Date;

public class SendMoneyToWallet implements SendMoney{
    private final Wallet wallet;

    @Override
    public Transaction sendMoney(User sender,float amount) {
        Transaction newtransaction = new Transaction(sender,amount,new Date(),TransactionStatus.INITIATED,ReceiverType.WALLET);
        Repo.transactionid_wallet_mapping.put(newtransaction.transactionId,this.wallet);
        return newtransaction;
    }

    public SendMoneyToWallet(Wallet wallet){
        this.wallet = wallet;
    }
}

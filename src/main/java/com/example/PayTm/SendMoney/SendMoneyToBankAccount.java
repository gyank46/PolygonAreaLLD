package com.example.PayTm.SendMoney;

import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.User;
import com.example.PayTm.ReceiverType;
import com.example.PayTm.Repo;
import com.example.PayTm.TransactionStatus;

import java.util.Date;

public class SendMoneyToBankAccount implements SendMoney{
    BankAccount account;
    @Override
    public Transaction sendMoney(User sender, float amount) {
        Transaction newtransaction = new Transaction(sender,amount,new Date(), TransactionStatus.INITIATED, ReceiverType.BANKACCOUNT);
        Repo.transactionid_bankAccount_mapping.put(newtransaction.transactionId, this.account);
        return newtransaction;
    }

    public SendMoneyToBankAccount(BankAccount account){
        this.account=account;
    }


}

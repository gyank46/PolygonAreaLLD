package com.example.PayTm;

import java.util.Date;

public class SendMoneyToBankAccount implements SendMoney{
    BankAccount account;
    @Override
    public Transaction sendMoney(User sender,float amount) {
        Transaction newtransaction = new Transaction(sender,amount,new Date(),TransactionStatus.INITIATED,ReceiverType.BANKACCOUNT);
        Repo.transactionid_bankAccount_mapping.put(newtransaction.transactionId, this.account);
        return newtransaction;
    }

    public SendMoneyToBankAccount(BankAccount account){
        this.account=account;
    }


}

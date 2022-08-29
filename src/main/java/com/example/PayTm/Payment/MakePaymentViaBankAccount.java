package com.example.PayTm.Payment;

import com.example.PayTm.*;
import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.Wallet;

public class MakePaymentViaBankAccount implements MakePayment {
    private final BankAccount bankAccount;

    @Override
    public void makePayment( Transaction transaction) {
        if(transaction.status!= TransactionStatus.SUCCESSFUL && bankAccount.amount>transaction.amount){
            System.out.println("Paying "+ transaction.amount + " via Bank account "+ this.bankAccount.bankAccount);
            bankAccount.amount-=transaction.amount;
            System.out.println("Remaining balance in Sender "+bankAccount.bankAccount+" :"+bankAccount.amount);
            if(transaction.receiverType == ReceiverType.BANKACCOUNT){
                BankAccount recipient = Repo.transactionid_bankAccount_mapping.get(transaction.transactionId);
                recipient.amount+= transaction.amount;;
                System.out.println("Remaining balance in Receiver "+ recipient.bankAccount+" :"+recipient.amount);
            }else if(transaction.receiverType==ReceiverType.WALLET){
                Wallet recipient = Repo.transactionid_wallet_mapping.get(transaction.transactionId);
                recipient.amount+=transaction.amount;
                System.out.println("Wallet balance of Receiver " + recipient.id+ " : "+ recipient.amount);
            }
            transaction.status = TransactionStatus.SUCCESSFUL;

        }

    }

    public MakePaymentViaBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
}

package com.example.PayTm.Payment;

import com.example.PayTm.*;
import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Transaction;
import com.example.PayTm.Models.Wallet;

public class MakePaymentViaWallet implements MakePayment {
    private final Wallet wallet;

    public MakePaymentViaWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makePayment(Transaction transaction) {
        if(transaction.status != TransactionStatus.SUCCESSFUL && wallet.amount> transaction.amount){
            wallet.amount-= transaction.amount;
            System.out.println("Paying "+transaction.amount+" via wallet");
            System.out.println("Wallet balance of Sender " + transaction.user.name+ ": "+ wallet.amount);
            if(transaction.receiverType== ReceiverType.WALLET){
                Wallet recipient = Repo.transactionid_wallet_mapping.get(transaction.transactionId);
                recipient.amount+=transaction.amount;
                System.out.println("Wallet balance of Receiver " + recipient.walletId+ " : "+ recipient.amount);
            }else if(transaction.receiverType == ReceiverType.BANKACCOUNT){
                BankAccount bankAccount = Repo.transactionid_bankAccount_mapping.get(transaction.transactionId);
                bankAccount.amount+=transaction.amount;
                System.out.println("Bank balance of Receiver "+ bankAccount.bankAccount+" :"+bankAccount.amount);
            }
            transaction.status = TransactionStatus.SUCCESSFUL;

        }


    }
}

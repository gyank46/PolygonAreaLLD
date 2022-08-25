package com.example.PayTm;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        User sender = new User("Gyan","Sittuk46@gmail.com", "7002614683");
        User receiver = new User("Shomya","shomyadoc.123@gmail.com","7991122544");

        Repo.userID_WalletID_Mapping.put("7991122544",new Wallet("7991122544",100));
        Repo.userID_WalletID_Mapping.put("7002614683",new Wallet("7002614683",1000));
        Repo.userID_BankAccount_Mapping.put("7991122544", new BankAccount("HDFC","abcd","0000",100));
        Repo.userID_BankAccount_Mapping.put("7002614683", new BankAccount("ICICI","xyz","0001",1000));

        SendMoney sendMoneyToWallet = new SendMoneyToWallet(Repo.userID_WalletID_Mapping.get("7991122544"));
        Transaction transaction = sendMoneyToWallet.sendMoney(sender,20);


        MakePayment makePaymentViaWallet = new MakePaymentViaWallet(Repo.userID_WalletID_Mapping.get("7002614683"));
        makePaymentViaWallet.makePayment(transaction);

        sendMoneyToWallet = new SendMoneyToWallet(Repo.userID_WalletID_Mapping.get("7002614683"));
        transaction = sendMoneyToWallet.sendMoney(receiver,20);

        makePaymentViaWallet = new MakePaymentViaWallet(Repo.userID_WalletID_Mapping.get("7991122544"));
        makePaymentViaWallet.makePayment(transaction);

        SendMoney sendMoneyToBank = new SendMoneyToBankAccount(Repo.userID_BankAccount_Mapping.get("7991122544"));
        Transaction bankTransaction = sendMoneyToBank.sendMoney(sender,200);

        makePaymentViaWallet = new MakePaymentViaWallet(Repo.userID_WalletID_Mapping.get("7002614683"));
        makePaymentViaWallet.makePayment(bankTransaction);

        sendMoneyToWallet = new SendMoneyToWallet(Repo.userID_WalletID_Mapping.get("7002614683"));
        transaction = sendMoneyToWallet.sendMoney(receiver,250);

        MakePayment makePaymentViaBank = new MakePaymentViaBankAccount(Repo.userID_BankAccount_Mapping.get("7991122544"));
        makePaymentViaBank.makePayment(transaction);


    }
}

package com.example.PayTm;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        User sender = new User("Gyan","Sittuk46@gmail.com", "7002614683");
        User receiver = new User("Shomya","shomyadoc.123@gmail.com","7991122544");

        HashMap<String,Wallet> userID_WalletID_Mapping = new HashMap<String,Wallet>();
        userID_WalletID_Mapping.put("7991122544",new Wallet("7991122544",100));
        userID_WalletID_Mapping.put("7002614683",new Wallet("7002614683",1000));

        SendMoney sendMoneyToWallet = new SendMoneyToWallet(userID_WalletID_Mapping.get("7991122544"));
        Transaction transaction = sendMoneyToWallet.sendMoney(sender,20);

        MakePayment makePaymentViaWallet = new MakePaymentViaWallet(userID_WalletID_Mapping.get("7002614683"));
        makePaymentViaWallet.makePayment(transaction);
        makePaymentViaWallet.makePayment(transaction);
        sendMoneyToWallet = new SendMoneyToWallet(userID_WalletID_Mapping.get("7991122544"));
        transaction = sendMoneyToWallet.sendMoney(sender,20);
        makePaymentViaWallet.makePayment(transaction);


    }
}

package com.example.PayTm;

import java.util.HashMap;

public class Repo {

    public static HashMap<String,Wallet> userID_WalletID_Mapping = new HashMap<String,Wallet>();
    public static HashMap<String,BankAccount> userID_BankAccount_Mapping = new HashMap<String,BankAccount>();
    public static HashMap<String,Wallet> transactionid_wallet_mapping = new HashMap<String,Wallet>();

    public static HashMap<String,BankAccount> transactionid_bankAccount_mapping = new HashMap<String,BankAccount>();


}

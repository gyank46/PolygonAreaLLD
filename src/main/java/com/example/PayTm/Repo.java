package com.example.PayTm;

import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.User;
import com.example.PayTm.Models.Wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repo {

    public static HashMap<String, User> userId_User_Mapping = new HashMap<String,User>();
    public static HashMap<String, Wallet> userID_WalletID_Mapping = new HashMap<String,Wallet>();
    public static HashMap<String, BankAccount> userID_BankAccount_Mapping = new HashMap<String,BankAccount>();
    public static HashMap<String,Wallet> transactionid_wallet_mapping = new HashMap<String,Wallet>();

    public static HashMap<String,BankAccount> transactionid_bankAccount_mapping = new HashMap<String,BankAccount>();

    public static List<Icommand> validCommands = new ArrayList<Icommand>();


}

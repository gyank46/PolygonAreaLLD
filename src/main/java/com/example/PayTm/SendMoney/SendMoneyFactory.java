package com.example.PayTm.SendMoney;

import com.example.PayTm.Models.BankAccount;
import com.example.PayTm.Models.Recipient;
import com.example.PayTm.Models.Wallet;
import com.example.PayTm.ReceiverType;

public class SendMoneyFactory {

    public static SendMoney getInstance(String name, Recipient recipient){
        if(name.equals(ReceiverType.WALLET.name()))
            return new SendMoneyToWallet((Wallet) recipient);

        if(name.equals(ReceiverType.BANKACCOUNT.name()))
            return new SendMoneyToBankAccount((BankAccount) recipient);

        return null;
    }
}

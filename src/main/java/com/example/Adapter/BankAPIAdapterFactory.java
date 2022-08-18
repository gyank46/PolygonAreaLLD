package com.example.Adapter;

public class BankAPIAdapterFactory {

    public static BankApiAdapter getClass(String bankName){

        if(bankName==Bank.ICICI.toString())
            return new IciciBankApiAdapter();

        if(bankName == Bank.HDFC.toString())
            return new HDFCBankApiAdapter();

        return null;

    }
}

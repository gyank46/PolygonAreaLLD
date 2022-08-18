package com.example.Adapter;

public class HDFCBankApiAdapter implements BankApiAdapter{

    HdfcApi hdfcApi = new HdfcApi();
    @Override
    public double getBalance(int id) {
        return hdfcApi.getBalance(String.valueOf(id));
    }

    @Override
    public int transferMoney(int sourceId, int DestinationId, double amount) {
        return hdfcApi.transferMoney(String.valueOf(sourceId), String.valueOf(DestinationId),amount)=="Success"?1:0;
    }
}

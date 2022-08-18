package com.example.Adapter;

public class IciciBankApiAdapter implements BankApiAdapter{
    Iciciapi iciciapi = new Iciciapi();

    @Override
    public double getBalance(int id) {
        return Double.valueOf(iciciapi.getBalance(id));
    }

    @Override
    public int transferMoney(int sourceId, int DestinationId, double amount) {
        return iciciapi.transferMoney(sourceId,DestinationId,amount);
    }
}

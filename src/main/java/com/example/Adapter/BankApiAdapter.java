package com.example.Adapter;

public interface BankApiAdapter {

    double getBalance(int id);

    int transferMoney(int sourceId, int DestinationId, double amount);
}

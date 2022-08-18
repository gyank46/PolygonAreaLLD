package com.example.Adapter;

public class Phonepe {

    BankApiAdapter bankApiAdapter;
    CarrierAPIAdapter carrierAPIAdapter;

    public void setBankApiAdapter(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    public void setCarrierAPIAdapter(CarrierAPIAdapter carrierAPIAdapter){
        this.carrierAPIAdapter = carrierAPIAdapter;
    }

//    public Phonepe(BankApiAdapter bankApiAdapter){
//        this.bankApiAdapter = bankApiAdapter;
//    }

    public double showBalance(int sourceContactNumber){
        return bankApiAdapter.getBalance(sourceContactNumber);
    }

    public int transferMoney(int sourceContactNumber, int destinationContactNumber, double amount){
        return bankApiAdapter.transferMoney(sourceContactNumber,destinationContactNumber,amount);
    }

    public int rechargePhone(int phoneNumber, int rechargePlan){
        return carrierAPIAdapter.rechargePhone(phoneNumber,rechargePlan);
    }






}

package com.example.Adapter;

public class Client {

    public static void main(String[] args) {

        BankApiAdapter bankApiAdapter = BankAPIAdapterFactory.getClass("HDFC");
        CarrierAPIAdapter carrierAPIAdapter = CarrierAPIAdapterFactory.getClass("AIRTEL");

        Phonepe phonepe = new Phonepe();
        phonepe.setBankApiAdapter(bankApiAdapter);
        phonepe.setCarrierAPIAdapter(carrierAPIAdapter);

        System.out.println(phonepe.transferMoney(123,456,99.99));

        System.out.println(phonepe.showBalance(123));

        System.out.println(phonepe.rechargePhone(123,345));

    }

}

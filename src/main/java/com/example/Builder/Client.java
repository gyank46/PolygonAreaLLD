package com.example.Builder;

public class Client {


    public static void main(String[] args) {
        Mobile.MobileBuilder mobileBuilder = Mobile.getBuilder();
        Mobile Iphone13Pro = mobileBuilder.setOS("IOS").setRAM(6).setModel("IPhone13Pro").setStorage(256).setPrice(119999.99).setBrand("Apple").build();
        System.out.println(Iphone13Pro.getPrice());
    }
}

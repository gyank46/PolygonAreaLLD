package com.example.Adapter;

public class CarrierAPIAdapterFactory {

    public static CarrierAPIAdapter getClass(String carrier){
        if(carrier == Carrier.AIRTEL.toString()){
            return new AirtelApiAdapter();
        }

        if(carrier == Carrier.JIO.name()){
            return new JioAPIAdapter();
        }

        return null;

    }
}

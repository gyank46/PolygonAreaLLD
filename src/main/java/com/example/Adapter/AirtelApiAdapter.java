package com.example.Adapter;

public class AirtelApiAdapter implements CarrierAPIAdapter{

    AirtelAPI airtelAPI = new AirtelAPI();
    @Override
    public int rechargePhone(int phoneNumber, int plan) {
        return airtelAPI.recharge(String.valueOf(phoneNumber),String.valueOf(plan)) == "Success"?1:0;
    }
}

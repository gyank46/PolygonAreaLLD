package com.example.Adapter;

public class JioAPIAdapter implements CarrierAPIAdapter{

    JioAPI jioAPI = new JioAPI();
    @Override
    public int rechargePhone(int phoneNumber, int plan) {
        return jioAPI.recharge(Long.valueOf(phoneNumber),Long.valueOf(plan));
    }
}

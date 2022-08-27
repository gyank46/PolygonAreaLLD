package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Session;

public class RechargePhoneCommand implements Icommand {

    @Override
    public boolean canExecute(String command) {
        return command == Commands.RECHARGEPHONE.name();
    }

    @Override
    public void execute(Session session) {

    }
}

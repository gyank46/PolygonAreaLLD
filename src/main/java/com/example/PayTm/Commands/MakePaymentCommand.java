package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Session;

public class MakePaymentCommand implements Icommand {
    @Override
    public boolean canExecute(String command) {
        return command == Commands.MAKEPAYMENT.name();
    }

    @Override
    public void execute(Session session) {

    }
}

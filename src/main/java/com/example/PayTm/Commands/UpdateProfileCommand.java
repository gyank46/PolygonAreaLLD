package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Session;

public class UpdateProfileCommand implements Icommand {
    @Override
    public boolean canExecute(String command) {
        return command == Commands.UPDATEPROFILE.name();
    }

    @Override
    public void execute(Session session) {

    }
}

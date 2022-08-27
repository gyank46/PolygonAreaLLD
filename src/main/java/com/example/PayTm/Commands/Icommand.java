package com.example.PayTm.Commands;

import com.example.PayTm.Session;

public interface Icommand {


    public boolean canExecute(String command);

    public void execute(Session session);

}

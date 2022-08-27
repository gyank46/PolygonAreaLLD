package com.example.PayTm.Commands;

import com.example.PayTm.Commands.Commands;
import com.example.PayTm.Commands.Icommand;
import com.example.PayTm.Session;

import java.util.Scanner;

public class SendMoneyCommand implements Icommand {
    @Override
    public boolean canExecute(String command) {
        return command == Commands.SENDMONEY.name();
    }

    @Override
    public void execute(Session session) {
        if(!session.isLoggedIn){
            System.out.println("Pleae login to continue");
            return ;
        }
        System.out.println("Please select method of sending money WALLET or BANK: ");
        String methodOfSendingMoney = new Scanner(System.in).nextLine();



    }
}
